package Batch21.codingques;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class CodingQuestion6 {
	// "examination" count/frequency of each word 
	public static void main(String[] args) {
	
	String str = "examination";
	
	Map<Character, Long> freqMap = str.chars()  //  str.chars() :-Converts string into character Unicode code  	
			                                    // Ex:- for  "exam" → [101, 120, 97, 109] which represent 'e', 'x', 'a', 'm'
	.mapToObj(c ->(char)c)   //   Converts each int value to its corresponding char
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	                            // groups elements by themselves ,   counts how many times each character occurs.
	
	  System.out.println(freqMap);


   }
}
