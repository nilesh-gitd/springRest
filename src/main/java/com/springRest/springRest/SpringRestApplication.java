package com.springRest.springRest;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.springRest.repo.UserReopsitory;

@SpringBootApplication
public class SpringRestApplication {

	public static void main(String[] args) {
	ApplicationContext context =  (ApplicationContext) SpringApplication.run(SpringRestApplication.class, args);
		
	UserReopsitory userReopsitory = ((BeanFactory) context).getBean(UserReopsitory.class);
	
	User user = new User();
	user.setName("nilesh");
//	user.setAddress("nashik");
//	user.setDOB("2/3/96");
	
//	User user = userReopsitory.save(user);
	
	System.out.println(user);
	}

}
