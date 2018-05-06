package com.xcg.luckdraw.util;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author xuchenguang
 * @since 2018-5-3
 */
@Component
public class StringRedisUtil {

    private static StringRedisTemplate stringRedisTemplate = SpringUtil.getBean("stringRedisTemplate", StringRedisTemplate.class);


    /**
     * 存入redis
     *
     * @param key
     * @param value
     */
    public static void set(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }

    /**
     * 存入redis 设置过期时间
     *
     * @param key
     * @param value
     * @param time  过期时间  默认秒 10位时间戳
     */
    public static void set(String key, String value, Long time) {
        stringRedisTemplate.opsForValue().set(key, value, time, TimeUnit.SECONDS);
    }

    /**
     * 存入redis 设置过期时间
     *
     * @param key
     * @param value
     * @param time  过期时间
     * @param unit  时间类型
     */
    public static void set(String key, String value, Long time, TimeUnit unit) {
        stringRedisTemplate.opsForValue().set(key, value, time, unit);
    }

    /**
     * 通过key取出
     *
     * @param key
     * @return
     */
    public static String get(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    /**
     * 根据key删除
     *
     * @param key
     * @return
     */
    public static Boolean delete(String key) {
        return stringRedisTemplate.delete(key);
    }

    /**
     * 批量删除
     */
    public static void delete(String... key) {
        for (String k : key) {
            stringRedisTemplate.delete(k);
        }
    }


    /**
     * 通过key 设置过期时间
     *
     * @param key
     * @param time
     * @param unit
     * @return
     */
    public static Boolean expire(String key, Long time, TimeUnit unit) {
        return stringRedisTemplate.expire(key, time, unit);
    }


    /**
     * 根据key获取过期时间并换算成指定单位
     *
     * @param key
     * @return
     */
    public static Long getExpire(String key, TimeUnit unit) {
        return stringRedisTemplate.getExpire(key, unit);
    }

    /**
     * 检查key是否存在，返回boolean值
     *
     * @param key
     * @return
     */
    public static Boolean hasKey(String key) {
        return stringRedisTemplate.hasKey(key);
    }


    /**
     * 根据key获取过期时间
     *
     * @param key
     * @return
     */
    public static Long getExpire(String key) {
        return stringRedisTemplate.getExpire(key);
    }

}
