package com.calc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class Calculator {
	
	private static final Logger logger = LoggerFactory.getLogger(Calculator.class);
	public int add(int a, int b) {
		logger.debug("Addtion");
		
		return (a+b);
	}

	public int sub(int a, int b) {
		
		logger.debug("subtraction ");
		
		return (a-b);
	}

	public int mul(int a, int b) {
		
		logger.debug("multiplication");
		
		return (a*b);
	}

	public double div(int a, int b) {
		
		logger.debug("division");
		
		return (a/b);
	}
	
}
