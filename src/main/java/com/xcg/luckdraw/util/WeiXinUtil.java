package com.xcg.luckdraw.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xcg.http.HttpUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 微信工具类
 *
 * @author xuchenguang
 * @since 2018-5-5
 */
public class WeiXinUtil {

    private static final String jscode2session = "https://api.weixin.qq.com/sns/jscode2session";

//    appid=APPID&=SECRET&=JSCODE&=

    /**
     * 微信小程序获取openid和session_key
     *
     * @param appId
     * @param secret
     * @param code
     * @return
     */
    public static JSONObject miniAppGetSession(String appId, String secret, String code) {
        //请求参数
        Map<String, String> param = new HashMap<>(16);
        param.put("appid", appId);
        param.put("secret", secret);
        param.put("js_code", code);
        param.put("grant_type", "authorization_code");
        String result = HttpUtil.get(jscode2session, param);
        return JSON.parseObject(result);
    }
}
