package com.xcg.luckdraw.controller.login;

import com.alibaba.fastjson.JSONObject;
import com.xcg.luckdraw.common.resultjson.ResultJson;
import com.xcg.luckdraw.controller.BaseController;
import com.xcg.luckdraw.entity.user.UserEntity;
import com.xcg.luckdraw.util.StringRedisUtil;
import com.xcg.luckdraw.util.WeiXinUtil;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * 登录
 *
 * @author xuchenguang
 * @since 2018-5-5
 */
@RestController
@RequestMapping("wx")
public class LoginController extends BaseController {

    /**
     * 微信小程序登录
     *
     * @param code
     * @return
     */
    @PostMapping("login")
    public String login(String code) {

        JSONObject result = WeiXinUtil.miniAppGetSession("wxc6262cb07c1121dc",
                "0d7d7c3d70028c106674f4392fd1784a", code);
        String openId = result.getString("openid");
        String sessionKey = result.getString("session_key");
        String unionId = result.getString("unionid");
        Integer expiresIn = result.getInteger("expires_in");


        UserEntity user = userService.findUserByOpenId(openId);
        UserEntity userEntity = new UserEntity();

        //生成token
        String token = "token_" + System.currentTimeMillis() / 1000;

        if (user == null) {
            userEntity.setOpenId(openId);
            userEntity.setUnionId(unionId);
            userService.saveUser(userEntity);
            StringRedisUtil.set(token, Integer.toString(userEntity.getUserId()));
        } else {
            StringRedisUtil.set(token, Integer.toString(user.getUserId()));
        }
        return ResultJson.getResultJsonSuccess(token);
    }
}
