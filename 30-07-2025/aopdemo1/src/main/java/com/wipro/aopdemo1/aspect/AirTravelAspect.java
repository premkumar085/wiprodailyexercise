package com.wipro.aopdemo1.aspect;

import com.wipro.aopdemo1.exception.NoSeatAvailableException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AirTravelAspect {

    @Before("execution(* com.wipro.aopdemo1.service.AirTravelProcess.checkIn(..))")
    public void showPhotoId(JoinPoint jp) {
        System.out.println(" Please show your Photo ID before check-in");
    }

    @Before("execution(* com.wipro.aopdemo1.service.AirTravelProcess.doSecurityCheck(..)) || execution(* com.wipro.aopdemo1.service.AirTravelProcess.doBoarding(..))")
    public void showBoardingPass(JoinPoint jp) {
        System.out.println(" Please show your Boarding Pass");
    }

    @AfterThrowing(pointcut = "execution(* com.wipro.aopdemo1.service.AirTravelProcess.checkIn(..))", throwing = "ex")
    public void handleNoSeatAvailable(JoinPoint jp, NoSeatAvailableException ex) {
        System.out.println(" Error: " + ex.getMessage());
        System.out.println(" Please contact airline desk for assistance.");
    }
}
