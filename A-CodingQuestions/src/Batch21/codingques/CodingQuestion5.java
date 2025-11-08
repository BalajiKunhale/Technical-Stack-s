package Batch21.codingques;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CodingQuestion5 {
	
	// To group names by their length
	//           lina, radha, mina, tina
	//   o/p :-  4 - lina,mina,tina,  5 -radha
	
 	
	public static void main(String[] args) {
		
		                    
		List<String> Names = Arrays.asList("lina", "radha", "mina", "tina","Bala","as", "W");
		Map<Integer, List<String>> NamesByLength = Names.stream()
		.collect(Collectors.groupingBy(String::length));
		System.out.println(NamesByLength);
		
		NamesByLength.forEach((length, nameList)->       // for to print systematic output
		       System.out.println(length+ "=" +nameList));
		
			
	}			
	
/*	
	public static void main(String[] args) {
		List<String> names = List.of("lina", "radha", "mina", "tina","Bala","as", "W" );
		Map<Integer, List<String>> groupingByNames = names.stream()
		.collect(Collectors.groupingBy(String::length));
		System.out.println(groupingByNames);		
		
		groupingByNames.forEach( (l,name )->System.out.println(l+ "="+name));
		
	}
*/	
/*	
	public static void main(String[] args) {
		List<String> names = List.of("lina", "radha", "mina", "tina","Bala","as", "W" );
		Map<Integer, Long> groupingByNames = names.stream()
		.collect(Collectors.groupingBy(String::length, Collectors.counting()));
		System.out.println(groupingByNames);		
		
		groupingByNames.forEach( (l,name )->System.out.println(l+ "="+name));
		
	}
	
*/
	
	

}
