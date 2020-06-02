package com.wsdcoding.test;

import com.wsdcoding.anno.SpringConfig;
import com.wsdcoding.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Authror Shiko
 * @Date 2020/6/2 16:18
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(SpringConfig.class);
		UserDao dao = (UserDao) annotationConfigApplicationContext.getBean("dao");
		dao.printInfo();
	}
}
