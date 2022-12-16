package exceptionHandling;

public class Demo7 {
	public static void main(String[] args) {
		System.out.println("main starts ...");
		
		try{
			int i=18/2;
			int[] arr={10,20,30,40};
			
			try{
				System.out.println(arr[i]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("caught...");
				e.printStackTrace();
			}
		}
		catch(ArithmeticException e){
			System.out.println("handled...");
		}
		System.out.println("main ends...");
	}

}
