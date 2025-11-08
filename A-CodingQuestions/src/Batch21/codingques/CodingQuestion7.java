package Batch21.codingques;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CodingQuestion7 {
	
	// 1. find the longest string in a list using Stream API
	      // List= "Apple",Banana","Mango","Pineapple"
	
	public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Pineapple");

        String longest = fruits.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("No fruits");

         System.out.println("Longest fruit name: " + longest);
         
         
         
         
       //  2. Find the Product of All Elements in a List
         List<Integer> numbers = Arrays.asList(2, 3, 4, 5);

         int product = numbers.stream()
                 .reduce(1, (a, b) -> a * b);

         System.out.println("Product of all numbers: " + product);
         
         
         
         //  3. Convert List of Strings to Uppercase
         List<String> names = Arrays.asList("balaji", "kunhale", "sunbeam");

         List<String> upperNames = names.stream()
                 .map(String::toUpperCase)
                 .collect(Collectors.toList());

         System.out.println("Uppercase names: " + upperNames);
    }

}
