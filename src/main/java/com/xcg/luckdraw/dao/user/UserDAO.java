package com.xcg.luckdraw.dao.user;

import com.xcg.luckdraw.entity.user.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDAO {

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

    /**
     * 通过openid查询
     * @param openId
     * @return
     */
    UserEntity findUserByOpenId(String openId);
}
