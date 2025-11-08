package Batch21.codingques;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CodingQuestion4 {
	
	
	// partition list of integers into two groups
	// one contain even & other contain odd numbers 
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,12,13,15,17,18,19,20,11);
		Map<Boolean, List<Integer>> partitionMap = list.stream()
		.collect(Collectors.partitioningBy(num->num % 2 == 0));
		System.out.println(partitionMap);
		
		System.out.println("Even Numbers" +partitionMap.get(true));
		System.out.println("Odd Numbers" +partitionMap.get(false));
		
	
		

		
	}

}
