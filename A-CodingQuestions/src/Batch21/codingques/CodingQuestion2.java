package Batch21.codingques;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class CodingQuestion2 {
	
	/* Write a java code using stream api to arrange ascending order of length
	      input   ["Java", "is","Wonderful","language"]
		  output  ["is","Java","language","Wonderful"]
    */
     
	/* steps : create list of string into stream
	           sort string using length wise 
	           collect sorted string back to list	           
	*/
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Java", "is","wonderful","language");  // rrays.asList(...)  : Creates list of strings	
		List<String> sortedByLength = words.stream()      // Converts list into Stream
		.sorted(Comparator.comparingInt(String::length) )  // Sort strings based on their length, & Compares		
		                                          //  .reversed()    // To sort by descending length
		.collect(Collectors.toList());                    // collects sorted stream into List
		 System.out.println(sortedByLength);    
		
		 
		 
		 String sentence = "Java is a beautiful language";
		 List<String> stringLength = Arrays.stream(sentence.split("\\s")) // 1st Splits sentence into words by space
				                                                           // Converts array  into  Stream of words
		  .sorted(Comparator.comparingInt(String::length))    // Sorts words by their length, in ascending order.             
		  .collect(Collectors.toList());                  //  Store result in list
		  System.out.println( stringLength);
		  
		  
		  
		 
		 // To sort in alphabetical order
		 List<String> sortedAlphabetically = words.stream()
		 .sorted()
		 .collect(Collectors.toList());
		 System.out.println(sortedAlphabetically);
		 
		 
		 
		 
		// sort numbers in ascending order
		 List<Integer> Numbers  = List.of(5,3,6,7,4,8,1 ); // This creates list of integers: [5, 3, 6, 7, 4, 8, 1]
		 List<Integer> ascendingNumbers = Numbers.stream()
		 .sorted()                                         // Sort stream in natural/ascending order.
		 .collect(Collectors.toList());                    // Collects sorted stream back into a List.
		 System.out.println(ascendingNumbers);             
		
		
		 
		 
		// sort numbers in descending order
		 List<Integer> descendingNumbers = Numbers.stream()
		 .sorted(Comparator.reverseOrder())              //  Sort in Descending Order
  //or   .sorted((a,b) -> b-a)
		 .collect(Collectors.toList());
		 System.out.println(descendingNumbers);
		 
		 
		 
		 
		 
		
		
	}
 
}
