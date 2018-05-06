package com.xcg.luckdraw.service.interfaces.user;

import com.xcg.luckdraw.entity.user.UserEntity;

import java.util.List;

public interface UserService {
    /**
     * 获取用户列表
     *
     * @return
     */
    List<UserEntity> findUserList();

    /**
     * 增加用户
     */
    void saveUser(UserEntity user);

    String getUserId();

    /**
     * 通过openid查询
     * @param openId
     * @return
     */
    UserEntity findUserByOpenId(String openId);
}
