package com.hll;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 你知道越多，你不知道的也就越多
 *
 * @Author: Domid
 * @Description:
 * @Date: 2020-12-04 10:22
 * @Version: 1.0
 */
@SpringBootApplication
@MapperScan("com.hll.mapper")
public class GeneratorDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeneratorDemoApplication.class,args);
    }
}
