package com.etc.selftag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author root
 * @create 2021/10/4 20:50
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	private static final String NAME_PROPERTY = "name";

	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}

	@Override
	protected void doParse(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
		String username = element.getAttribute(NAME_PROPERTY);
		if(StringUtils.hasLength(username)){
			builder.addPropertyValue(NAME_PROPERTY,username);
		}
		String age = element.getAttribute("age");
		if(StringUtils.hasLength(age)){
			builder.addPropertyValue("age",age);
		}
		String email = element.getAttribute("email");
		if(StringUtils.hasLength(email)){
			builder.addPropertyValue("email",email);
		}
		String phone = element.getAttribute("phone");
		if(StringUtils.hasLength(phone)){
			builder.addPropertyValue("phone",phone);
		}
	}
}
