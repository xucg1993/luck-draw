package com.xcg.luckdraw.service.impl.user;

import com.xcg.luckdraw.dao.user.UserDAO;
import com.xcg.luckdraw.entity.user.UserEntity;
import com.xcg.luckdraw.service.interfaces.user.UserService;
import com.xcg.luckdraw.util.StringRedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDao;
    @Autowired
    private HttpServletRequest request;


    @Override
    public List<UserEntity> findUserList() {
        return userDao.findUserList();
    }

    @Override
    public void saveUser(UserEntity user) {
        userDao.saveUser(user);
    }

    @Override
    public String getUserId() {
        String token = request.getHeader("token");
        return StringRedisUtil.get(token);
    }

    @Override
    public UserEntity findUserByOpenId(String openId) {
        return userDao.findUserByOpenId(openId);
    }
}
