package filehandling;
import java.io.File;
import java.io.IOException;

public class Sample2 {
	public static void main(String[] args) throws  IOException {
		File f1=new File("C:\\Users\\User\\Desktop\\aks.img");
		File f2=new File("C:\\Users\\User\\Desktop\\aks.txt");
        File f3=new File("C:\\Users\\User\\Desktop\\aks.pdf");
        f1.createNewFile();
        f2.createNewFile();
        f3.createNewFile();
	}
}
