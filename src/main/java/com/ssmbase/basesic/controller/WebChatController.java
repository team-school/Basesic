package com.ssmbase.basesic.controller;


import com.ssmbase.basesic.dao.Messages;
import com.ssmbase.basesic.util.MessgaeUtils;
import com.ssmbase.basesic.util.WebChatUtil;
import io.swagger.annotations.Api;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping(value = "/Wx")
@EnableAutoConfiguration
@Api(value = "微信对接", description = "微信对接Controller")
public class WebChatController {
    // 开发者接入验证 确认请求来自微信服务器
    @RequestMapping(method = RequestMethod.GET)
    public void get(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //消息来源可靠性验证
        String signature = request.getParameter("signature");// 微信加密签名
        String timestamp = request.getParameter("timestamp");// 时间戳
        String nonce = request.getParameter("nonce");       // 随机数
        String echostr = request.getParameter("echostr");//成为开发者验证
        //确认此次GET请求来自微信服务器，原样返回echostr参数内容，则接入生效，成为开发者成功，否则接入失败
        PrintWriter out = response.getWriter();
        if(WebChatUtil.checkSignature(signature, timestamp, nonce)){
            System.out.println("=======请求校验成功======" + echostr);
            out.print(echostr);
        }
        out.close();
        out = null;
    }
    @RequestMapping(method = RequestMethod.POST)
    public void post(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // TODO 消息的接收、处理、响应
        request.setCharacterEncoding("UTF-8");

        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        String str = null;

            //将request请求，传到Message工具类的转换方法中，返回接收到的Map对象
        try {
            Map<String, String> map = MessgaeUtils.xmlToMap(request);
            //从集合中，获取XML各个节点的内容
            String ToUserName = map.get("ToUserName");

            String FromUserName = map.get("FromUserName");

            String CreateTime = map.get("CreateTime");

            String MsgType = map.get("MsgType");

            String Content = map.get("Content");

            String MsgId = map.get("MsgId");
            //这里只处理文本消息
            if (MsgType.equalsIgnoreCase("text")){

                Messages message=new Messages();
                message.setFromUserName(ToUserName);
                message.setToUserName(FromUserName);
                message.setContent("您发送的消息是text文本消息"+":"+Content);
                message.setMsgId(MsgId);
                message.setMsgType("text");
                message.setCreateTime(new Date().getTime());

                str=MessgaeUtils.objectToXml(message);
            }else
//                if (MsgType.equalsIgnoreCase(MessgaeUtils.RESP_MESSAGE_TYPE_NEWS))
//                {
                    str=MessgaeUtils.initNewsMessage(ToUserName,FromUserName);
//                }
            System.out.println(MsgType);
            System.out.println(str);

        }catch (Exception e){
            e.printStackTrace();
        }
        out.print(str);
        out.close();
    }

}
