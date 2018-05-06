package com.xcg.luckdraw.service.interfaces.luck;

import com.xcg.luckdraw.entity.luck.LuckEntity;

import java.util.List;

/**
 * @author xuchenguang
 * @since 2018-5-3
 */
public interface LuckService {

    /**
     * 按userId查询
     *
     * @param userId
     * @return
     */
    List<LuckEntity> listLuckByUserId(String userId);

    /**
     * 添加抽奖活动
     *
     * @param luckEntity
     * @return
     */
    int saveLuck(LuckEntity luckEntity);

    /**
     * 根据抽奖活动id查询
     *
     * @param luckId
     * @return
     */
    LuckEntity findLuckByLuckId(Integer luckId);
}
