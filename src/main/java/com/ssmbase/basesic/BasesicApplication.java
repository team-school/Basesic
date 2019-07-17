package com.ssmbase.basesic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ssmbase.basesic.dao")
public class BasesicApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasesicApplication.class, args);
    }

}
