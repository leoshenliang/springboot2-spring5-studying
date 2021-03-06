package com.aop.myDefaultAdvisor1;

import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhangshukang
 */

@Configuration
public class DefaultAdvisorAutoProxyCreatorConfig {

    //采用默认 advisorCreator：DefaultAdvisorAutoProxyCreator
    @Bean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
        return new DefaultAdvisorAutoProxyCreator();
    }
}
