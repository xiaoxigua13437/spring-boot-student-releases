package com.xiaolyuh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableCaching// 开启缓存，需要显示的指定
@EnableAsync// 开启异步
public class SpringBootStudentCacheRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudentCacheRedisApplication.class, args);
	}
}
