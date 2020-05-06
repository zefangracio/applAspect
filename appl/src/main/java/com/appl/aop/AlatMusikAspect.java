package com.appl.aop;

import com.appl.model.AlatMusik;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;



@Aspect
public class AlatMusikAspect {
	@Pointcut("execution(** com.appl.services.AlatMusikService.create(..))")
	public void show() {}
	
	@Before("show()")
	public void pesan1() {
		System.out.println("Membuat data...");
	}
	
/*	@Before("show()")
	public void takeSeats() {
		System.out.println("Taking seats");
	}
*/	
	@AfterReturning("show()")
	public void applause() {
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	@AfterThrowing("show()")
	public void demandRefund() {
		System.out.println("Demanding a refund");
	}
}
