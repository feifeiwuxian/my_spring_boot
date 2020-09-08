package com.wf;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.ArrayList;

/**
 * spring,启动引导类
 */
@SpringBootApplication
// 扫描mabatis里mappter
//@MapperScan("com.wf.mapper")

// 改造为通用mapper // 要用tk开头的
@MapperScan("com.wf.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
