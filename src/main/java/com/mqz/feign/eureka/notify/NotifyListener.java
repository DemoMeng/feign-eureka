package com.mqz.feign.eureka.notify;

import com.netflix.appinfo.InstanceInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MarkerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author mqz
 * @description
 * @abount https://github.com/DemoMeng
 * @since 2021/2/5
 */
@Component
public class NotifyListener {

    private Logger logger = LoggerFactory.getLogger(NotifyListener.class);

    /**
     * 服务下线事件
     * @param event
     */
    @EventListener
    public void listenDown(EurekaInstanceCanceledEvent event){
        // TODO 发送邮件，短信，钉钉通知
        logger.info(MarkerFactory.getMarker("DOWN")+"服务ID：" + event.getServerId() + "\t" +
                "服务实例：" + event.getAppName() + "\t服务下线");
        logger.info(event.getServerId() + "\t" + event.getAppName() + "服务下线");
    }

    /**
     * 服务注册事件
     * @param event
     */
    @EventListener
    public void listenDown(EurekaInstanceRegisteredEvent event){
        // TODO 发送邮件，短信，钉钉通知
        InstanceInfo instanceInfo = event.getInstanceInfo();
        logger.info(MarkerFactory.getMarker("DOWN"),instanceInfo.getAppName() + "服务注册");
    }
}
