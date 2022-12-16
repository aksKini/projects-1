package practice;

public class Sample {
	int a=100;
	static Mainclass s1;
	static int count=0;
	
	private Sample(){
		count++;
	}
	public static Mainclass getInstance(){
		if(count<1){
			s1=new Mainclass();
		}
		return s1;
	}
    public static void setInstance(int x){
    	s1.a=x;
    }
}
class Sample{
	public static void main(String[] args) {
		Mainclass s2=Mainclass.getInstance();
		System.out.println(s2.a);
		Mainclass s3=Mainclass.getInstance();
		System.out.println(s3.a);
		Mainclass.setInstance(80);
		System.out.println(s2.a);
	}
}
