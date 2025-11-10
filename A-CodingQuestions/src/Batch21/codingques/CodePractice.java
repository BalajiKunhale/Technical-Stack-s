package Batch21.codingques;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CodePractice {
	
	public static void main(String[] args) {
		//Write a java program using stream api to count the repetition of words in 
	    //    String s= "welcome to bikkadit and bikkadit welcome you".
		
		String s= "welcome to bikkadit and bikkadit welcome you";
		Map<String, Long> collect = Arrays.stream(s.split("\\s+"))
		.collect(Collectors.groupingBy(word->word,Collectors.counting()));
		System.out.println(collect);
		
		
		
		/* Write a java code using stream api to arrange in ascending order of length
	      input   ["Java", "is","Wonderful","language"]
		  output  ["is","Java","language","Wonderful"]
  */     
		List<String> List = Arrays.asList("Java", "is","Wonderful","language");
		List.stream()
		.collect( Collectors.groupingBy(null) );
		
		
		
	}
	
	
	
	

}
