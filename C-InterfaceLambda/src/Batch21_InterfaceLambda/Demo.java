package Batch21_InterfaceLambda;

public class Demo implements AddInterface {
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.add(25, 25);
		
	}

	@Override
	public void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
		
	}

}
