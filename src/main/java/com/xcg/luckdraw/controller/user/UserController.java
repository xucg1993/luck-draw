package com.xcg.luckdraw.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.xcg.luckdraw.entity.user.UserEntity;
import com.xcg.luckdraw.service.interfaces.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping("findUserList")
    public String findUserList() {
        List<UserEntity> userList = userService.findUserList();
        return JSONObject.toJSONString(userList);
    }

    @PostMapping("save")
    public String save(@ModelAttribute UserEntity user) {
        userService.saveUser(user);
        return JSONObject.toJSONString(user);
    }
}
