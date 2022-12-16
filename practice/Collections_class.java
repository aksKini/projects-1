package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_class {
	public static void main(String[] args) {
		List a= new ArrayList();
		
		a.add(100);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		Collections.sort(a);
		System.out.println(a);
		Collections_class a1=new Collections_class();
		System.out.println(this);
	}

}
