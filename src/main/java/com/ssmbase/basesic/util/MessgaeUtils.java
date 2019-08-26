package com.ssmbase.basesic.util;

import com.ssmbase.basesic.dao.Messages;
import com.ssmbase.basesic.model.wxModel.message.News;
import com.ssmbase.basesic.model.wxModel.message.NewsMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.io.Writer;
import java.util.*;

public class MessgaeUtils {

    /**
     * 返回消息类型：文本
     */
    public static final String RESP_MESSAGE_TYPE_TEXT = "text";

    /**
     * 返回消息类型：音乐
     */
    public static final String RESP_MESSAGE_TYPE_MUSIC = "music";

    /**
     * 返回消息类型：图文
     */
    public static final String RESP_MESSAGE_TYPE_NEWS = "news";

    /**
     * 返回消息类型：图片
     */
    public static final String RESP_MESSAGE_TYPE_Image = "image";

    /**
     * 返回消息类型：语音
     */
    public static final String RESP_MESSAGE_TYPE_Voice = "voice";

    /**
     * 返回消息类型：视频
     */
    public static final String RESP_MESSAGE_TYPE_Video = "video";

    /**
     * 请求消息类型：文本
     */
    public static final String REQ_MESSAGE_TYPE_TEXT = "text";

    /**
     * 请求消息类型：图片
     */
    public static final String REQ_MESSAGE_TYPE_IMAGE = "image";

    /**
     * 请求消息类型：链接
     */
    public static final String REQ_MESSAGE_TYPE_LINK = "link";

    /**
     * 请求消息类型：地理位置
     */
    public static final String REQ_MESSAGE_TYPE_LOCATION = "location";

    /**
     * 请求消息类型：音频
     */
    public static final String REQ_MESSAGE_TYPE_VOICE = "voice";

    /**
     * 请求消息类型：视频
     */
    public static final String REQ_MESSAGE_TYPE_VIDEO = "video";

    /**
     * 请求消息类型：推送
     */
    public static final String REQ_MESSAGE_TYPE_EVENT = "event";

    /**
     * 事件类型：subscribe(订阅)
     */
    public static final String EVENT_TYPE_SUBSCRIBE = "subscribe";

    /**
     * 事件类型：unsubscribe(取消订阅)
     */
    public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";

    /**
     * 事件类型：CLICK(自定义菜单点击事件)
     */
    public static final String EVENT_TYPE_CLICK = "CLICK";

    /**
     * 事件类型：VIEW(自定义菜单URl视图)
     */
    public static final String EVENT_TYPE_VIEW = "VIEW";

    /**
     * 事件类型：LOCATION(上报地理位置事件)
     */
    public static final String EVENT_TYPE_LOCATION = "LOCATION";

    /**
     * 事件类型：LOCATION(上报地理位置事件)
     */
    public static final String EVENT_TYPE_SCAN = "SCAN";

    /*将xml格式转化为map*/
    public static Map<String,String> xmlToMap(HttpServletRequest request) throws Exception{
        Map<String,String> map=new HashMap<>();

        SAXReader reader=new SAXReader();
        InputStream inputStream=request.getInputStream();
        Document doc=reader.read(inputStream);
        Element root=doc.getRootElement();//得到根节点
        List<Element> list=root.elements();//根节点下的所有的节点
        for(Element e:list){
            map.put(e.getName(),e.getText());
        }

        inputStream.close();
        return  map;
    }

    /*将我们的消息内容转变为xml*/

    public static String objectToXml(Messages message){

        xstream.alias("xml", message.getClass());
        return xstream.toXML(message);
    }


    /**
     * 将图文消息对象转成XML
     * @param
     * @return
     */
    public static String newsMessageToXml(NewsMessage newsMessage){

        //将xml的根节点替换成<xml>  默认为NewsMessage的包名
        xstream.alias("xml", newsMessage.getClass());
        //同理，将每条图文消息News类的报名，替换为<item>标签
        xstream.alias("item", new News().getClass());
        System.out.println(newsMessage);
        return xstream.toXML(newsMessage);
    }

    /**
     * @Description: 图片消息对象转换成xml
     * @param @param imageMessage
     * @param @return
     * @author dapengniao
     * @date 2016年3月9日 上午9:25:51
     */
    public static String imageMessageToXml(NewsMessage imageMessage) {

        xstream.alias("xml", imageMessage.getClass());
        return xstream.toXML(imageMessage);
    }

    /**
     * 初始化图文消息
     */
    public static String initNewsMessage(String toUSerName,String fromUserName){
        List<News> newsList = new ArrayList<News>();
        NewsMessage newsMessage = new NewsMessage();
        //组建一条图文↓ ↓ ↓
        News newsItem = new News();
        newsItem.setTitle("欢迎来到测试账号");
        newsItem.setDescription("测试账号，中国高端互联网人才培训领导品牌！");
        newsItem.setPicUrl("http://www.jredu100.com/statics/images/index/top/logo.png");
        newsItem.setUrl("www.jredu100.com");
        newsList.add(newsItem);

        //组装图文消息相关信息
        newsMessage.setToUserName(fromUserName);
        newsMessage.setFromUserName(toUSerName);
        newsMessage.setCreateTime(new Date().getTime());
        newsMessage.setMsgType(RESP_MESSAGE_TYPE_NEWS);
        newsMessage.setArticle(newsList);
        newsMessage.setArticleCount(newsList.size());

        //调用newsMessageToXml将图文消息转化为XML结构并返回
        return MessgaeUtils.newsMessageToXml(newsMessage);
    }
//
//    /**
//     * @Description: 语音消息对象转换成xml
//     * @param @param voiceMessage
//     * @param @return
//     * @author dapengniao
//     * @date 2016年3月9日 上午9:27:26
//     */
//    public static String voiceMessageToXml(VoiceMessage voiceMessage) {
//        xstream.alias("xml", voiceMessage.getClass());
//        return xstream.toXML(voiceMessage);
//    }
//
//    /**
//     * @Description: 视频消息对象转换成xml
//     * @param @param videoMessage
//     * @param @return
//     * @author dapengniao
//     * @date 2016年3月9日 上午9:31:09
//     */
//    public static String videoMessageToXml(VideoMessage videoMessage) {
//        xstream.alias("xml", videoMessage.getClass());
//        return xstream.toXML(videoMessage);
//    }
//
//    /**
//     * @Description: 音乐消息对象转换成xml
//     * @param @param musicMessage
//     * @param @return
//     * @author dapengniao
//     * @date 2016年3月8日 下午4:13:36
//     */
//    public static String musicMessageToXml(MusicMessage musicMessage) {
//        xstream.alias("xml", musicMessage.getClass());
//        return xstream.toXML(musicMessage);
//    }

    /**
     * 对象到xml的处理
     */
    private static XStream xstream = new XStream(new XppDriver() {
        public HierarchicalStreamWriter createWriter(Writer out) {
            return new PrettyPrintWriter(out) {
                // 对所有xml节点的转换都增加CDATA标记
                boolean cdata = true;

                @SuppressWarnings("rawtypes")
                public void startNode(String name, Class clazz) {
                    super.startNode(name, clazz);
                }

                protected void writeText(QuickWriter writer, String text) {
                    if (cdata) {
                        writer.write("<![CDATA[");
                        writer.write(text);
                        writer.write("]]>");
                    } else {
                        writer.write(text);
                    }
                }
            };
        }
    });
}
