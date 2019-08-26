package com.ssmbase.basesic.util;

public class WenXinUntil {

    public static final String APPID = "wxd62151b92df864b6"; //开发环境

   // public static final String APPID = "wx2ef5d685c1a6880d"; //生产环境

    public static final String APPSECRET = "67be35f95d6a6aaca6227bc55e63b212"; // 开发环境

//    public static final String APPSECRET = "d422d208140faaf30be966d394251407"; // 生产环境

    public static final String ACCESS_TOKEN = "";

    public static final String ACCESS_TOKEN_URL = String.format("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid={0}&secret={1}",APPID,APPSECRET);

    public static final String UPLOAD_URL = "";

    public static final String CREATE_MENU_URL = String.format("https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN");
}
