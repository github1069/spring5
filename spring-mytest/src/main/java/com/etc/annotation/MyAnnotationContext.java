package com.etc.annotation;

import com.etc.entity.PrizeUser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author root
 * @create 2021/10/18 20:57
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
public class MyAnnotationContext {
	@Value("{jdbc.url}")
	private String url;
	@Value("{jdbc.username}")
	private String user;
	@Value("{jdbc.password}")
	private String pasword;

	@Bean
	public PrizeUser newInstencePrizeUser(){
		PrizeUser prizeUser = new PrizeUser();
		prizeUser.setUserId(100010L);
		prizeUser.setUserName("张三");
		prizeUser.setUserPwd("1121103");
		return prizeUser;
	}

//	@Bean
//	public OrderEntity newInstenceOrder(){
//		return new OrderEntity();
//	}
}
