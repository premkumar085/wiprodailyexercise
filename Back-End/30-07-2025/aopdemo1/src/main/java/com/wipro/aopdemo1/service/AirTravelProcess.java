package com.wipro.aopdemo1.service;

import com.wipro.aopdemo1.exception.NoSeatAvailableException;
import org.springframework.stereotype.Component;

@Component
public class AirTravelProcess {

    public void checkIn(Boolean flag) throws NoSeatAvailableException {
        if (flag) {
            System.out.println(" Check-in successful");
        } else {
            throw new NoSeatAvailableException(" No seat available");
        }
    }

    public void collectBoardingPass() {
        System.out.println(" Boarding pass collected");
    }

    public void doSecurityCheck() {
        System.out.println(" Security check completed");
    }

    public void doBoarding() {
        System.out.println(" Boarding completed");
    }
}
