package exceptionHandling;

public class Demo5 {
	public static void main(String[] args) {
		System.out.println("Main starts...");
		String s3=null;
		try{
		System.out.println(s3.hashCode());
		}
		catch(NullPointerException e){
			System.out.println();
		}
		System.out.println("main ends...");
	}

}
