package com.etc.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author root
 * @create 2021/9/25 19:55
 */
public class CustomBeanFactoryPostProcess implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("扩展了beanFactoryPostProcess--------------");
		BeanDefinition prizeUser = beanFactory.getBeanDefinition("prizeUser");
		if(prizeUser != null){
			MutablePropertyValues propertyValues = prizeUser.getPropertyValues();
			System.out.println("prizeUser----propertyValues："+propertyValues.toString());
		}

	}
}
