package exceptionHandling;

public class Demo4 {
	public static void main(String[] args) {
		System.out.println("Main starts...");
		
		Object o1=new Integer(10);
		System.out.println(o1);
		try{
		Character c1=(Character) o1;
		}
		catch(ClassCastException e){
			System.out.println("ClassCastException Handled...");
		}
		System.out.println("Main ends ...");
		
	

	}

}
