package com.xcg.luckdraw.controller.luck;

import com.xcg.luckdraw.common.resultjson.ResultJson;
import com.xcg.luckdraw.controller.BaseController;
import com.xcg.luckdraw.entity.luck.LuckEntity;
import com.xcg.luckdraw.entity.luckuser.LuckUserEntity;
import com.xcg.luckdraw.util.StringRedisUtil;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;

/**
 * @author xuchenguang
 * @since 2018-5-2
 */
@RestController
@RequestMapping("luck")
public class LuckController extends BaseController {

    /**
     * 新建抽奖活动
     *
     * @param luckEntity
     * @return
     */
    @PostMapping("save")
    public String save(@ModelAttribute LuckEntity luckEntity) {
        //获取userId
        String userId = userService.getUserId();
        luckEntity.setUserId(Integer.parseInt(userId));

        //奖品数不能大于参与人数
        if (luckEntity.getPrizes() > luckEntity.getPeopleNum()) {
            return ResultJson.getResultJsonFail("奖品数量不能大于参与人数");
        }
        try {

            int saveLuck = luckService.saveLuck(luckEntity);

            if (saveLuck > 0) {

                return ResultJson.getResultJsonSuccess();

            }
            return ResultJson.getResultJsonFail();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResultJson.getResultJsonError();
    }

    /**
     * 参加抽奖活动
     *
     * @return
     */
    @PostMapping("partake")
    public String partake(@RequestParam Integer luckId) {
        //获取userId
        String userId = userService.getUserId();

        //查询抽奖详情
        LuckEntity luckEntity = luckService.findLuckByLuckId(luckId);
        //查询抽奖参与人
        LuckUserEntity luckUserEntity = new LuckUserEntity();
        luckUserEntity.setLuckId(luckId);
        luckUserEntity.setUserId(Integer.parseInt(userId));
        //参与抽奖
        luckUserService.saveLuckUser(luckUserEntity);

        //判断抽奖类型  为按人数自动开奖
        if (LuckEntity.TYPE_NUM.equals(luckEntity.getType())) {
            //查询参与抽奖人数
            List<LuckUserEntity> list = luckUserService.listLuckUser(luckId);

            if (luckEntity.getPeopleNum() == list.size()) {
                //随机数结果集
                HashSet<Integer> hashSet = new HashSet<>();
                randomSet(luckEntity.getPeopleNum(), luckEntity.getPrizes(), hashSet);
                LuckUserEntity entity = null;
                for (Integer i : hashSet) {
                    entity = list.get(i);
                }
                return ResultJson.getResultJsonSuccess(entity);
            }
        }

        return ResultJson.getResultJsonSuccess();
    }


}
