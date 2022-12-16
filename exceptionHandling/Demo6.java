package exceptionHandling;

public class Demo6 {
	public static void main(String[] args) {
		System.out.println("main starts...");
		try{
		int i=1/0;
		System.out.println("huhuhuhu...");
		}
		
		catch(ClassCastException e){
			System.out.println("ClassCastException caught");
		} 
		
        catch(Exception e){
			
			System.out.println("Exception handled...");
		}
		 
		catch(ArithmeticException e){
			
			System.out.println("ArithmeticException handled...");
		}
		
        
		System.out.println("main ends ...");
	}

}
