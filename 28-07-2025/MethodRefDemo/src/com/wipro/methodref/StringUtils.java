package com.wipro.methodref;

import java.util.Arrays;
import java.util.List;

public class StringUtils {
	
	static String capatilize(String str) {
		List<String>list = Arrays.asList("Prem","Vijay");
		
		
//		list.forEach(word->System.out.println(); StringUtils.capatilize(word));
		list.forEach(word->StringUtils.capatilize("Prem"));
	}

}
