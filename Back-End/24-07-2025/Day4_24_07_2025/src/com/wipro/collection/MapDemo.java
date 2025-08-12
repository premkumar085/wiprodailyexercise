package com.wipro.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		 
		 
		Map<String,String> airportCode= new TreeMap<>();
		airportCode.put("CCU", "Kolkata");
		airportCode.put("BOM", "Mumbai");
		airportCode.put("MAA", "Chennai");
		airportCode.put("DEL", "DELHI");
		airportCode.put("DEL", "DELHI");
//		airportCode.put("DEL1", null);
//		airportCode.put(null, null);
		
//		System.out.println(airportCode.get("BOM"));
//		System.out.println(airportCode.containsKey("BOM1"));
 
		for(Map.Entry<String, String> data:airportCode.entrySet())
		{
			System.out.println(data.getKey() +"-"+ data.getValue());
			
		}
		
//		for(String key:airportCode.keySet())
//		{
//			
//			System.out.println(key);
//		}
		
//		for(String value:airportCode.values())
//		{
//			
//			System.out.println(value);
//		}
	}}