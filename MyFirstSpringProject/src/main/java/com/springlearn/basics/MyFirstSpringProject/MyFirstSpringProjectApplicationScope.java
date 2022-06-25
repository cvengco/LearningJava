package com.springlearn.basics.MyFirstSpringProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springlearn.basics.MyFirstSpringProject.basic.BinarySearchImpl;
import com.springlearn.basics.MyFirstSpringProject.scope.PersonDAO;

@SpringBootApplication
public class MyFirstSpringProjectApplicationScope{
	
	private static Logger LOGGER = LoggerFactory.getLogger(MyFirstSpringProjectApplicationScope.class);
	

	public static void main(String[] args) {
		
		
		// Spring ApplicationContext
		ApplicationContext appContext = SpringApplication.run(MyFirstSpringProjectApplicationScope.class, args);
		
		PersonDAO personDao1 = appContext.getBean(PersonDAO.class);
		PersonDAO personDao2 = appContext.getBean(PersonDAO.class);
		
	
		LOGGER.info("{}", personDao1);
		LOGGER.info("{}", personDao1.getJdbcConnection());
		LOGGER.info("{}", personDao1.getJdbcConnection());
		
		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
		
		
	}

}
