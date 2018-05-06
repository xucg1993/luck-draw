package com.xcg.luckdraw.controller;

import com.xcg.luckdraw.service.interfaces.luck.LuckService;
import com.xcg.luckdraw.service.interfaces.luckuser.LuckUserService;
import com.xcg.luckdraw.service.interfaces.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.HashSet;
import java.util.Random;

/**
 * @author xuchenguang
 * @since 2018-5-3
 */
public class BaseController {

    @Autowired
    protected LuckService luckService;
    @Autowired
    protected UserService userService;
    @Autowired
    protected LuckUserService luckUserService;

    @Autowired
    protected StringRedisTemplate redisTemplate;

    /**
     * 随机指定范围内N个不重复的数
     *
     * @param max     指定范围最大值
     * @param num     随机数个数
     * @param hashSet 随机数结果集
     */
    protected void randomSet(Integer max, Integer num, HashSet<Integer> hashSet) {
        Random random = new Random();

        for (int i = 0; i < num; i++) {
            int nextInt = random.nextInt(max);
            hashSet.add(nextInt);
        }
        int setSize = hashSet.size();

        if (setSize < num) {
            randomSet(max, num - setSize, hashSet);// 递归
        }
    }
}
