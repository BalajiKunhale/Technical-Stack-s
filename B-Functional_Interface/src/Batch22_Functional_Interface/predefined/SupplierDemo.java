package Batch22_Functional_Interface.predefined;

import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		
		// return random value 
		Supplier<Double> randomValue = () -> Math.random();	
		System.out.println(randomValue.get());	
	
		
		
		// Return same string every time it's called
		Supplier<String> str = ()-> "Hello World! ";
		System.out.println( str.get());
		System.out.println( str.get());
		System.out.println( str.get());
		System.out.println( str.get());
	
		
		
		// current time supplier
		Supplier<Long> timeSupplier = ()-> System.currentTimeMillis();		 
		 System.out.println(timeSupplier.get());
		 
		 
		 
		// otp generate
		 Supplier<String>  otpSupplier = ()-> {
				int otp = (int)(Math.random()*9000) + 1000;
				
				return String.valueOf(otp);
			};
			
			System.out.println("Your OTP : " +otpSupplier.get());
			System.out.println("Your OTP : " +otpSupplier.get());
			System.out.println("Your OTP : " +otpSupplier.get());
			System.out.println("Your OTP : " +otpSupplier.get());
		
		
	}

}
