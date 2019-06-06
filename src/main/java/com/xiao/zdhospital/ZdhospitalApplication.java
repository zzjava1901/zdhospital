package com.xiao.zdhospital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("com.xiao.zdhospital.dao")
@SpringBootApplication
@EnableSwagger2
public class ZdhospitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZdhospitalApplication.class, args);
    }

}
