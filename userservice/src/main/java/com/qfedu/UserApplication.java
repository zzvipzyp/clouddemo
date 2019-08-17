package com.qfedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author ZZzz
 * @version 1.0
 * @className UserApplication
 * @description TODO
 * @date 2019/8/16 20:22
 */
@SpringBootApplication
@MapperScan("com.qfedu.User.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }
}
