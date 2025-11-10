package Batch21_InterfaceLambda.usingLambda;
import Batch21_InterfaceLambda.AddInterface;
import Batch21_InterfaceLambda.SubInterface;

public class Test {
	
	public static void main(String[] args) {
		
		AddInterface sum = (a,b)-> System.out.println(a+b);
		sum.add(10,20);
		
		SubInterface sub = (x, y)->(x-y);
		int result = sub.Sub(50, 15);
		System.out.println(result);

	}
}
