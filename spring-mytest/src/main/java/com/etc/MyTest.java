package com.etc;

import com.etc.entity.PrizeUser;
import com.etc.facbean.Cat;
import com.etc.overed.lookupmethod.ABppleInterface;
import com.etc.overed.lookupmethod.Apple;
import com.etc.overed.lookupmethod.B;
import com.etc.overed.lookupmethod.LookUPT;
import com.etc.start.CustomApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * @author root
 * @create 2021/10/27 23:29
 */
public class MyTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new CustomApplicationContext("applicationContext.xml");
//		Object bean = () applicationContext.getBean("&myCustomFactoryBean");
//		Cat bean = applicationContext.getBean(Cat.class);
//		System.out.println(bean.toString());
//		LookUPT lookUPT = (LookUPT) applicationContext.getBean("lookUPT");
//		B aBpple = (B) lookUPT.getABpple();
//		System.out.println(aBpple.toString());
//		Apple b = (Apple) lookUPT.getABpple();
//		System.out.println(b.toString());
		PrizeUser bean = applicationContext.getBean(PrizeUser.class);
		String userName = bean.getUserName();
		System.out.println(userName);

	}
}
