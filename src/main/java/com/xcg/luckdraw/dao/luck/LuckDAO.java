package com.xcg.luckdraw.dao.luck;

import com.xcg.luckdraw.entity.luck.LuckEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LuckDAO {

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
