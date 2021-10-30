package com.etc;

import com.etc.start.CustomApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * @author root
 * @create 2021/10/27 23:29
 */
public class MyTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new CustomApplicationContext("applicationContext.xml");

	}
}
