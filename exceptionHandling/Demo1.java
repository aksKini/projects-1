package exceptionHandling;



public class Demo1 {
	static void submit() throws BookException
	{
		int book=5;
		if(book<=4)
		{
			System.out.println("happy watching");
		else {
			throw new BookException("invalid data");
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		submit();
		System.out.println("main ends");
	}

}
