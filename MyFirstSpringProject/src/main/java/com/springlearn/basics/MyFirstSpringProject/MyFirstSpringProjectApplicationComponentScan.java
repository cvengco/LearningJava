package com.springlearn.basics.MyFirstSpringProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springlearn.basics.MyFirstSpringProject.basic.BinarySearchImpl;
import com.springlearn.basics.componentscan.ComponentDAO;
import com.springlearn.basics.MyFirstSpringProject.scope.PersonDAO;

@SpringBootApplication
@ComponentScan({"com.springlearn.basics.componentscan", "com.springlearn.basics.MyFirstSpringProject"})
public class MyFirstSpringProjectApplicationComponentScan{
	
	private static Logger LOGGER = LoggerFactory.getLogger(MyFirstSpringProjectApplicationComponentScan.class);
	

	public static void main(String[] args) {
		
		
		// Spring ApplicationContext
		ApplicationContext appContext = SpringApplication.run(MyFirstSpringProjectApplicationComponentScan.class, args);
		
		ComponentDAO componentDao = appContext.getBean(ComponentDAO.class);
	
		LOGGER.info("{}", componentDao);
		LOGGER.info("{}", componentDao.getJdbcConnection());

		
		
	}

}
