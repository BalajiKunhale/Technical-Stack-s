package Batch22_Functional_Interface.predefined;

import java.util.function.Consumer;

public class ConsumerDemo {
	
	public static void main(String[] args) {
		
		// To find length of string
		Consumer<String> strLength = (str)-> System.out.println(str.length());
		strLength.accept("Balaji Kunhale");
	}

}
