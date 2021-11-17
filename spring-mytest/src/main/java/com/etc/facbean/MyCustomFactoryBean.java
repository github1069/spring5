package com.etc.facbean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author root
 * @create 2021/10/26 21:22
 */
public class MyCustomFactoryBean implements FactoryBean<Cat>{


	@Override
	public Cat getObject() throws Exception {
		System.out.println("此处开始执行factoryBean创建factorybean对象----Cat");
		return new Cat();
	}

	@Override
	public Class<?> getObjectType() {
		return Cat.class;
	}

	@Override
	public boolean isSingleton() {
		return FactoryBean.super.isSingleton();
	}
}
