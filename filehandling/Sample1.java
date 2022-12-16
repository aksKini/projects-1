 package filehandling;

import java.io.File;

public class Sample1 {
	public static void main(String[] args) {
		File f1=new File("C:\\Users\\User\\Desktop\\JSPIDERS");
		if(f1.mkdirs()){
			System.out.println("folder is created");
		}
		else{
			System.out.println("Folder not created");
		}
		
		if(f1.delete()){
			System.out.println("folder is deleted ");
		}
		else{
			System.out.println("Folder not deleted");
		}
	
	}

}
