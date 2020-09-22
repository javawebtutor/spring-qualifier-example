package com.jwt.spring.demo.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("student")
public class Student implements Person {

	@Override
	public String information() {
		return "Student Information";
	}

}
