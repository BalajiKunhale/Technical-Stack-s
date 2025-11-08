package Batch21.codingques;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CodingQuestion1 {
	
	//Write a java program using stream api to count the repetition of words in 
    //    String s= "welcome to bikkadit and bikkadit welcome you".
	
	public static void main(String[] args) {
		String s= "welcome to bikkadit and bikkadit welcome you";
		
		Map<String, Long> wordCount = Arrays.stream(s.split("\\s+"))    
		       .collect(Collectors.groupingBy(word ->word,Collectors.counting()));
		                       // .groupingBy(Function.identity(),Collectors.counting()));
		
	    System.out.println(wordCount);	    
		
	}

}

/*
Arrays.stream(...)                   :-  Converts the array of words into a Stream 
 s.split("\\s+")                     :-  split string into words using whitespace 
 \\s+                                :-  Match one or more whitespace characters
 .collect(...)                       :-  gather result into a map
 Collectors.groupingBy(...)          :-  Group all same words together in a Map.
 word -> word                        :-  use each word itself as key 
 Collectors.counting()               :-  count how many times each key appears. 
  
  */
 