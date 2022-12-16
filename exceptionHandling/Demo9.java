package exceptionHandling;

public class Demo9 {
	public static void main(String[] args) {
		System.out.println("main starts...");
		
		try{
		int i=1/0;
		}
		catch(ArithmeticException e){
			System.out.println("caught...");
		}
		finally{
			System.out.println("caught 108...");
		}
	}

}
