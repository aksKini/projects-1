package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sample3 {
	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\User\\Desktop\\aks.pdf");
		FileWriter f =new FileWriter(f1);
		f.write("WELCOME TO BENGALURU");
		f.write("WARM GREETINGS");
		f.flush();
		System.out.println("data is written");
		
		
	}

}
