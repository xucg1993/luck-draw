package com.xcg.luckdraw.service.interfaces.luckuser;

import com.xcg.luckdraw.entity.luckuser.LuckUserEntity;

import java.util.List;

/**
 * @author xuchenguang
 * @since 2018-5-6
 */
public interface LuckUserService {
    int saveLuckUser(LuckUserEntity luckUserEntity);

    int countLuckUser(Integer luckId);

    List<LuckUserEntity> listLuckUser(Integer luckId);
}
