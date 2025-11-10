package Batch22_Functional_Interface.Bi;

import java.util.function.BiPredicate;

public class BiPredicates {
	
	public static void main(String[] args) {
		
		// compare two integer
		BiPredicate<Integer, Integer> compare = (a,b) -> a > b;
		System.out.println(compare.test (15, 45));
		
	}

}
