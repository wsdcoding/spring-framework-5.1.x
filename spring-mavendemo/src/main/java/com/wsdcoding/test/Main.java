package com.wsdcoding.test;

import com.wsdcoding.entity.User;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description:
 * @Authror wsdcoding
 */

/**
 * 在 Spring 框架，构造出 Resource 对象之后，接下来还会把 Resource 对象转为 EncodedResource，
 * 这里会对资源进行编码处理，编码主要体现在 getReader 方法上，
 * 在获取 Reader 对象时，如果有编码，则给出编码格式
 */
class Test {
	/**
	 * 使用Spring 的 ClassPathResource 接口 读取资源
	 */
	public void test1() {
		//XmlBeanDefinitionReader
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("application.xml"));
		User user = factory.getBean(User.class);
		System.out.println("User ==== " + user);
		user.setName("SHIKO");
		System.out.println("Username == " + user.getName());
	}

	/**
	 * 不使用spring读取 application.xml
	 */
	public void test2() throws IOException {
		ClassPathResource resource = new ClassPathResource("application.xml");
		InputStream inputStream = resource.getInputStream();
		System.out.println(resource.getFilename());
	}
}

public class Main {
	public static void main(String[] args) throws IOException {
		Test ts = new Test();
		ts.test1();
		ts.test2();
	}
}
