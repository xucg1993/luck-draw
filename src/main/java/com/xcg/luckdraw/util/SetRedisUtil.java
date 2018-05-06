/*
package com.xcg.luckdraw.util;

import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Set;

*/
/**
 * @author xuchenguang
 * @since 2018-5-4
 *//*

public class SetRedisUtil {

    private static StringRedisTemplate stringRedisTemplate = SpringUtil.getBean("stringRedisTemplate", StringRedisTemplate.class);

    */
/**
     * 向指定key中存放set集合
     *
     * @param key
     * @param value
     * @return
     *//*

    public static Long add(String key, String... value) {
        return stringRedisTemplate.opsForSet().add(key, value);
    }

    public static Long remove(String key, Object... objects) {
        return stringRedisTemplate.opsForSet().remove(key, objects);
    }

    */
/**
     * 根据key获取set集合
     *
     * @param key
     * @return
     *//*

    public static Set<String> members(String key) {
        return stringRedisTemplate.opsForSet().members(key);
    }

    */
/**
     * 根据key查看集合中是否存在指定数据
     *
     * @param key
     * @param o
     * @return
     *//*

    public static Boolean isMember(String key, Object o) {
        return stringRedisTemplate.opsForSet().isMember(key, o);
    }

    */
/**
     * 根据key查看value数量
     *
     * @param key
     * @return
     *//*

    public static Long size(String key) {
        return stringRedisTemplate.opsForSet().size(key);
    }
}
*/
