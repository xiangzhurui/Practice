package com.xiangzhurui.drools;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author xiangzhurui
 * @version 2018/3/20
 */
@MapperScan(basePackages = {"com.xiangzhurui.drools.dao"})
@SpringBootApplication
@EnableAspectJAutoProxy
public class DroolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DroolsApplication.class);
    }
}
