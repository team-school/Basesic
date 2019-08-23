package com.ssmbase.basesic;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@MapperScan("com.ssmbase.basesic")
@EnableScheduling
@EnableSwagger2
public class BasesicApplication {
       private static final Logger logger= LogManager.getLogger(BasesicApplication.class);
    public static void main(String[] args) {
        logger.info("启动成功");
        SpringApplication.run(BasesicApplication.class, args);
    }

}
