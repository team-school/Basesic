package com.ssmbase.basesic.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.ssmbase.basesic.bean.DruidBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfig {

    @Autowired
    DruidBean druidProperties;//这里会有一个Could not autowire. No beans of 'xxxx' type found的提示，不影响运行

    private DruidDataSource dataSourceStrom() {
        DruidDataSource dataSource = new DruidDataSource();
        druidProperties.config(dataSource);
        return dataSource;
    }

    @Bean(initMethod = "init",destroyMethod = "close")
    public DruidDataSource dataSource() {
        return dataSourceStrom();
    }


}
