package Batch22_Functional_Interface.predefined;

import java.util.function.Function;

public class FunctionDemo {
	
	//R apply(T t)
	public static void main(String[] args) {
		
		// To obtain string converted into capital letters/ uppercase
		Function<String, String> uppercase = (str)-> str.toUpperCase();
		String result = uppercase.apply("Full stack Developer");
		System.out.println(result);
		
		
		// to obtain length of string 
		Function<String, Integer> strLength= (str)-> str.length();
		Integer result1 = strLength.apply("Developer");
		System.err.println(result1);
		
		
	}

}
