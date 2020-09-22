package com.jwt.spring.demo.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("teacher")
public class Teacher implements Person {

	@Override
	public String information() {
		return "Teacher Information";
	}

}
