package com.wangzh.bootdemo.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangzhuohui
 * @version V1.0
 * @description 定时任务
 * @since 2018-12-20 16:14
 */
@Component
public class QuartzService
{
    private Logger logger = LoggerFactory.getLogger(QuartzService.class);
    
    @Scheduled(cron = "0 0 */1 * * ?")
    public void timerToNow()
    {
        String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        
        logger.debug("BootDemo Now Time={}", dateStr);
    }
}
