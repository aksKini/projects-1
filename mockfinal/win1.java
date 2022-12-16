package mockfinal;

public class win1 {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the String");
		String str="akshay";
		String rev=" ";
		char[] arr= str.toCharArray();
		
			for(int i=str.length()-1;i>=0;i--){
				
				rev=rev+str.charAt(i);
		
		}
		System.out.println("Input string is: "+str);
		System.out.println("reversed string is: "+rev);
		
	}

}
