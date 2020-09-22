package com.jwt.spring.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jwt.spring.demo.model.Person;

@Component
public class Test implements CommandLineRunner {
	
	 private static final Logger logger = LoggerFactory.getLogger(Test.class);
	 
	 @Autowired
	 @Qualifier("student")
	 private Person p1;
	 
	 @Autowired
	 @Qualifier("teacher")
	 private Person p2;
	 

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("Student info: {}", p1.information());
		logger.info("Teacher info: {}", p2.information());

	}

}
