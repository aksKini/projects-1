package practice;
import java.lang.*;

class MarriageException extends Exception{
	String msg;
	MarriageException(String msg)
	{
		this.msg=msg;
	}
	public String getMessage(){
		return msg;
	}
}

public class Shaadidotcom 
{
	static void submit() throws MarriageException
	{
		int age=16;
		if(age>21){
			System.out.println("happy life");
		}else{
			throw new MarriageException("invalid age");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main starts...");
		try{
		submit();
		}
		catch(MarriageException e){
			System.out.println(e.getMessage());
			
		e.printStackTrace();
			
		}
		System.out.println("main ends");
		
	}
}
	
