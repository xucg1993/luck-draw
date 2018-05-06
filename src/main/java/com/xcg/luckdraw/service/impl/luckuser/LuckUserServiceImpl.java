package com.xcg.luckdraw.service.impl.luckuser;

import com.xcg.luckdraw.dao.luckuser.LuckUserDAO;
import com.xcg.luckdraw.entity.luckuser.LuckUserEntity;
import com.xcg.luckdraw.service.interfaces.luckuser.LuckUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuchenguang
 * @since 2018-5-6
 */
@Service("luckUserService")
public class LuckUserServiceImpl implements LuckUserService {
    @Autowired
    LuckUserDAO luckUserDAO;

    @Override
    public int saveLuckUser(LuckUserEntity luckUserEntity) {
        return luckUserDAO.saveLuckUser(luckUserEntity);
    }

    @Override
    public int countLuckUser(Integer luckId) {
        return luckUserDAO.countLuckUser(luckId);
    }

    @Override
    public List<LuckUserEntity> listLuckUser(Integer luckId) {
        return luckUserDAO.listLuckUser(luckId);
    }
}
