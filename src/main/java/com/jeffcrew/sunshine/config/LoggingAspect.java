package com.jeffcrew.sunshine.config;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.jeffcrew.sunshine.web.CategoryController;

@Aspect
@Component
public class LoggingAspect {

	private static final Logger logger = LoggerFactory
			.getLogger(CategoryController.class);

	/**
	 * NOT WORKING
	 */
	@Pointcut("execution(* org.springframework.stereotype.Controller.*(..))")
	// the pointcut expression
	private void executionOfAControllerMethod() {

	}// the pointcut signature

	@After("execution(* com.jeffcrew.sunshine.web.*.*(..))")
	public void afterControllerMethod(JoinPoint joinPoint)
	{
		logger.debug("Leaving Method:" + joinPoint.getSignature().toShortString() + "| Args => " + Arrays.asList(joinPoint.getArgs()));  
	}
	
	@Before("execution(* com.jeffcrew.sunshine.web.*.*(..))")
	public void beforeControllerMethod(JoinPoint joinPoint) {
		logger.debug("Entering Method:" + joinPoint.getSignature().toShortString() + "| Args => " + Arrays.asList(joinPoint.getArgs()));  
		
	}

}