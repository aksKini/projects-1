package practice;

public class Star1 {
	public static void main(String[] args) throws InterruptedException {
		
	
		for(int r=0;r<=6;r++)
		{
			for(int c=0;c<=4;c++){
				if( ((c==0||c==4) && (r!=0)) || ( ((r==0||r==3) && ((c>0) && c<4))) )
					System.out.print("* ");
				else 
					System.out.print("  ");
				Thread.sleep(75);
		   }
			System.out.print("  ");
			
			int i=0,j=4;
			for(int c=0;c<=4;c++){
				if (c==0 || (r==c+2 && c>1) )
					System.out.print("* ");}
				    
				else if ((r==i && c==j)  && (c>0))
                    System.out.print("* ");
				    i+=1;
				    j-=1;}
				
				    else
   					System.out.print("  ");}
				
		   }
			System.out.println();
		
		}
	
		

	
	}

}
