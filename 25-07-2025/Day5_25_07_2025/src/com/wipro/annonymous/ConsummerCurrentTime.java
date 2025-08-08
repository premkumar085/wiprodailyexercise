package com.wipro.annonymous;


import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.function.Consumer;

public class ConsummerCurrentTime {

	public static void main(String[] args) {
		Consumer<String> time = zone -> System.out.println(ZonedDateTime.now(ZoneId.of(zone)).toLocalTime());
        time.accept("Europe/London");
       
		

	}

}
