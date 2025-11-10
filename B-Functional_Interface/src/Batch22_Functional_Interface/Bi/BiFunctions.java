package Batch22_Functional_Interface.Bi;

import java.util.function.BiFunction;

public class BiFunctions {
	
	public static void main(String[] args) {
		
		//find sum of two nos. and produce a string of result
		
		BiFunction<Integer, Integer, String> sumAsString = (i,j)-> "Sum = " +(i+j);
		System.out.println(sumAsString.apply(15, 34));
		System.out.println(sumAsString.apply(78, 66));
		System.out.println(sumAsString.apply(66, 89));
		
		
	}

}
