package Batch21.codingques;
import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CodingQuestion3 {
	
	/* Write a Java program using Stream API to:
		 find and print all the duplicate elements in a list of integers.
		 
		 Input : [1, 2, 3, 4, 2, 3, 5, 1, 6]
         Output: [1, 2, 3] 
	*/
		
	public static void main(String[] args) {
		
		List<Integer> Numbers = Arrays.asList(1,2,3,4,2,3,5,1,6);
		Set<Integer> seen = new HashSet<>();
		
		List<Integer> duplicates = Numbers.stream()
		.filter(n -> !seen.add(n))  // filter(!seen.add(n)) :- keeps only duplicates.
		.distinct()                 // to remove repeated duplicates in output
		.collect(Collectors.toList());
		System.out.println(duplicates);
		
		
		
		
		
		//   Remove duplicate elements from a list
		//  Output: [1, 2, 3, 4, 5,6]
		List<Integer> Number = Arrays.asList(1,2,3,4,2,3,5,1,6);
		List<Integer> duplicate = Number.stream() //Converts list to Stream
		.distinct()                          // removes duplicates
		.collect(Collectors.toList());       // .collect(...) :-Converts Stream back to List
		System.out.println(duplicate);
		
		
		
		
		//   Count duplicates
		//  Output: 1 = 2  	 2 = 2    3 = 2   	4 = 1     5 = 1    6 = 1
		List<Integer> Numberr = Arrays.asList(1,2,3,4,2,3,5,1,6);
		Map<Integer, Long> countMap = Numberr.stream()
		.collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		countMap.forEach(( key, value) -> 
		   System.out.println(key + " = " + value ));
		
		
		
			
		
	}
	
}
