package com.soft2242.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.soft2242.shop.mapper")

public class ShopOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopOnlineApplication.class, args);
	}

}
