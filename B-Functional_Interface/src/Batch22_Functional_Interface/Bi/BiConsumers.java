package Batch22_Functional_Interface.Bi;
import java.util.function.BiConsumer;

public class BiConsumers {
	
	public static void main(String[] args) {
		
		//accepting name and age of student
		
		BiConsumer<String, Integer> printData = (name, age) -> System.out.println("Student:"+name+ "is " +age+" yrs old");
		
		printData.accept("sujit ", 19);
		printData.accept("Ajit ", 21);
		
		
		
	}

}
