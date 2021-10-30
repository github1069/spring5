package com.etc.selftag;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author root
 * @create 2021/10/3 21:23
 */
public class UserNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
	}
}
