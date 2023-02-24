
public class SHWETA {

	public static void main(String[] args) {
		
		 int n=7;
	//S	 
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 if(i==0 || i==n-1 || j==0 && i<=(n-1)/2 || j==n-1 && i>=(n-1)/2 || i==(n-1)/2 )
					 
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 //H
			 System.out.print(" ");
			 for(int j=0;j<n;j++)
			 {
				 if( j==0 || j==n-1 || i==(n-1)/2 )
					 
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			//W
			 System.out.print(" ");
			 for(int j=0;j<n;j++)
			 {
				 if( j==0 || j==n-1 || i==j && i>=(n-1)/2 || i+j==n-1 && i>=(n-1)/2 )
					 
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			//E
			 System.out.print(" ");
			 for(int j=0;j<n;j++)
			 {
				 if( j==0 || i==0 || i==(n-1)/2 || i==(n-1) )
					 
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			//T
			 System.out.print(" ");
			 for(int j=0;j<n;j++)
			 {
				 if( i==0 || j==(n-1)/2 )
					 
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			//A
			 System.out.print(" ");
			 for(int j=0;j<n;j++)
			 {
				 if( i==0 || j==0 || j==(n-1) ||i==(n-1)/2 )
					 
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }

	}

}
