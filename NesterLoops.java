

public class NesterLoops {

	public static void main(String[] args) {
	/*
		//Square pattern
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	 */	
		/*
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==0 || j==n-1 || i==n-1 )
				System.out.print("*");
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
	/*	
		int n=12;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==0 || i==(n-1)/2 ||j==n-1 )
				System.out.print("*");
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	*/
		/*
	Q3 H	
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==(n-1)/2 ||j==n-1 )
				System.out.print("*");
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
	/*Q4 I
		
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n-1 || j==(n-1)/2)
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
		*/
	
	/*Q5 T	
		
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || j==(n-1)/2)
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
		*/
	
	/*	Q6 E
		
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n-1 || i==(n-1)/2 || j==0)
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
		*/
	/*Q7 F
		
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==(n-1)/2 || j==0)
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
		*/
		
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if( i==n-1 || j==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			
		    }
			System.out.print(" ");
			
			for(int j=0;j<n;j++)
			{
				if( i==n-1 || j==0)
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
