package com.etc.start;

import com.etc.extend.CustomBeanFactoryPostProcess;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author root
 * @create 2021/9/25 19:49
 */
public class CustomApplicationContext extends ClassPathXmlApplicationContext {

	public CustomApplicationContext(String configLocation){
		super(configLocation);
	}

	/**
	 * 扩展方法，这里前面有创建了defualtlistablebeanFactory
	 * @param beanFactory the newly created bean factory for this context
	 */
	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		System.out.println("这边扩展了--------customizeBeanFactory");
		super.setAllowBeanDefinitionOverriding(false);
		super.addBeanFactoryPostProcessor(new CustomBeanFactoryPostProcess());
//		super.addBeanFactoryPostProcessor(new CustomBeanDefinitionPostProcess());
//		beanFactory.get
	}

	/**
	 * 初始化属性资源
	 * 环境信息已经有了 ，并且解析了占位符
	 */
	@Override
	protected void initPropertySources() {
		//添加属性到Environment环境中，方便后面使用
		getEnvironment().getSystemProperties().put("name","gust");
//		getEnvironment().getSystemEnvironment().put("name","gust");
		//这里要求Environment中必须包含username属性，如果不包含，则抛出异常
		//getEnvironment().validateRequiredProperties();这里会对name进行验证
		getEnvironment().setRequiredProperties("name");
	}


}
