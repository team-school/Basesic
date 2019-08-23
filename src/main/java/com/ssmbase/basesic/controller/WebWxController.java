package com.ssmbase.basesic.controller;

import com.ssmbase.basesic.model.WxMenu;
import com.ssmbase.basesic.model.resultModel.Result;
import com.ssmbase.basesic.service.WxService;
import com.ssmbase.basesic.util.HttpErrorCode;
import com.ssmbase.basesic.util.excption.ExceptionHandle;
import com.ssmbase.basesic.util.excption.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/WebApi")
@EnableAutoConfiguration
@Api(value = "微信菜单管理", description = "微信菜单管理")
public class WebWxController {

    /**
     * 添加日志文件
     */
    private static Logger log = LogManager.getLogger(WebWxController.class);

    @Autowired
    private WxService wxService;
    private ExceptionHandle exceptionHandle;

    /**
     * 获取所有菜单信息
     * @param wxMenu
     * @return
     */
    @RequestMapping(value = "/QueryMenus",method = RequestMethod.POST)
    @ApiOperation(value = "获取所有菜单信息", notes = "参数可为空")
    public Result queryMenus(WxMenu wxMenu) {
        Result result= ResultUtil.success();
        try{
            log.info("****************请求菜单信息******************");
            log.info("请求参数："+ JSONObject.fromObject(wxMenu).toString());
            List<WxMenu> wxMenuList=wxService.QueryMenu(wxMenu);
            log.info("返回参数："+ JSONArray.fromObject(wxMenuList).toString());
            result= ResultUtil.success(wxMenuList);
        }catch (Exception e){
            log.error("错误码："+HttpErrorCode.OUT_ERROR_TYPE+"\n 错误消息："+e.getMessage());
            result=exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    /**
     * 新增菜单信息
     * @param wxMenu
     * @return
     */
    @RequestMapping(value = "/InserMenu",method = RequestMethod.POST)
    @ApiOperation(value = "新增菜单信息", notes = "参数非空")
    public Result inserMenu(WxMenu wxMenu){
        Result result=ResultUtil.success();
        log.info("【菜单新增接口参数】："+JSONObject.fromObject(wxMenu));
        try {
            result =ResultUtil.success( wxService.insert(wxMenu));
        }catch (Exception e){
            log.info("【ERROR】【菜单新增接口】："+e.getMessage());
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    /**
     * 更新菜单信息
     * @param wxMenu
     * @return
     */
    @RequestMapping(value = "/UpdateMenu",method = RequestMethod.POST)
    @ApiOperation(value = "更新菜单信息", notes = "参数非空")
    public Result updateMenu(WxMenu wxMenu){
        Result result = ResultUtil.success();
        try {
            result = ResultUtil.success(wxService.updateByPrimaryKey(wxMenu));
        }catch (Exception e){
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }
}
