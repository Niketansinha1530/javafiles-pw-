


public class ComplexPattern {

	public static void main(String[] args) 
	{
	/*Q1 N	
		int n =5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || j==i )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print( " ");
				}
			}
			System.out.println();
		}
*/
		/*
	Qimportant 	
		int n =11;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j+i==10 || j==i || i==0  || j==0 || i==n-1 || j==n-1  )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print( " ");
				}
			}
			System.out.println();
	     }
	   */
		
		int n =8;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i>0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print( " ");
				}
			}
			System.out.println();
	     }
	}

}
