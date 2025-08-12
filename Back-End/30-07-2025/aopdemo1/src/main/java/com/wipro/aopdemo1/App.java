package com.wipro.aopdemo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.aopdemo1.exception.NoSeatAvailableException;
import com.wipro.aopdemo1.service.AirTravelProcess;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("com.wipro.aopdemo1");
        ctx.refresh();

        AirTravelProcess travel = ctx.getBean(AirTravelProcess.class);

      
        try {
            travel.checkIn(true);
            travel.collectBoardingPass();
            travel.doSecurityCheck();
            travel.doBoarding();
        } catch (NoSeatAvailableException e) {
        	
        }

        ctx.close();
    }
}
