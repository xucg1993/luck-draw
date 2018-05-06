package com.xcg.luckdraw.service.impl.luck;

import com.xcg.luckdraw.dao.luck.LuckDAO;
import com.xcg.luckdraw.entity.luck.LuckEntity;
import com.xcg.luckdraw.service.interfaces.luck.LuckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuchenguang
 * @since 2018-5-3
 */
@Service("luckService")
public class LuckServiceImpl implements LuckService {
    @Autowired
    LuckDAO luckDAO;

    @Override
    public List<LuckEntity> listLuckByUserId(String userId) {
        return luckDAO.listLuckByUserId(userId);
    }

    @Override
    public int saveLuck(LuckEntity luckEntity) {
        return luckDAO.saveLuck(luckEntity);
    }

    @Override
    public LuckEntity findLuckByLuckId(Integer luckId) {
        return luckDAO.findLuckByLuckId(luckId);
    }
}
