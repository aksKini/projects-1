package practice;

public class Diamond {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if( ((i*j == 4) || (i*j == 3) ||  (i*j == 8) || (i*j == 15)||(i*j == 16))   &&  (i+j!=5)){
					System.out.print("* ");
				}else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}


//        11   12   13   14   15

//        21   22   23   24   25

//        31   32   33   34   35

//        41   42   43   44   45

//        51   52   53   54   55