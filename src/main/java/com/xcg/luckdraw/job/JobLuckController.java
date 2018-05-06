package com.xcg.luckdraw.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author xuchenguang
 * @since 2018-5-2
 */
@Component
public class JobLuckController {

    /**
     * 开奖   每分钟一次
     */
    @Scheduled(cron = "0 0/1 * * * ?")
    public void lottery() throws InterruptedException {

    }
}
