package com.xcg.luckdraw.dao.luckuser;

import com.xcg.luckdraw.entity.luckuser.LuckUserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author xuchenguang
 * @since 2018-5-6
 */
@Mapper
public interface LuckUserDAO {
    int saveLuckUser(LuckUserEntity luckUserEntity);

    int countLuckUser(Integer luckId);

    List<LuckUserEntity> listLuckUser(Integer luckId);
}
