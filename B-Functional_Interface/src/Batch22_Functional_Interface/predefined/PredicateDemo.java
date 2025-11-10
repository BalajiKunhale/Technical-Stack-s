package Batch22_Functional_Interface.predefined;

import java.util.function.Predicate;

public class PredicateDemo{
	
	public static void main(String[] args) {
		
		// Number even/odd
		Predicate< Integer> oddEven = (num)->num%2 != 0 ;
		boolean result = oddEven.test(340);
		if (result)
			System.out.println("The number is odd");
		else 
			System.out.println("The number is even");	
		
		
		
		
		// To check string start with letter 'S'		
		Predicate<String> strCheck = (str)-> str.startsWith("S");
		
		boolean result1 =strCheck.test("Kolhapur");
		boolean result2= strCheck.test("Sangli");
		
		System.out.println(result1);
		System.out.println(result2);
		
		
		
		
		// to check if voter is eligible for voting
		Predicate<Integer>  checkAge = (age)-> age>=18;
		 boolean Eligible =  checkAge.test(19);
		 
		  if(Eligible)
			  System.out.println("Voter is eligible  for voting");
		  else
			System.out.println("Voter is Not eligible  for voting");
		
		
	}

}
