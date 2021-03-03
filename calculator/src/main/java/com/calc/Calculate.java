package com.calc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculate {
	
	private static final Logger logger = LoggerFactory.getLogger(Calculate.class);
	public static void main(String[] args) {

		Calculator calculator=new Calculator();
		int sum=calculator.add(5,6);
		logger.debug("Addition  of two numbers : ",sum);
		int sub=calculator.sub(20,10);
		logger.debug("subtraction of two numbers :",sub);
		
		int mul=calculator.mul(10,20);
		logger.debug("multiplication of two number: ",mul);
		
		double div=calculator.div(20,10);
		logger.debug("division of two number: ",div);
		

	}

}
