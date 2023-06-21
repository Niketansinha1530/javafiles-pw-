
public class Pattern07 {

	public static void main(String[] args) {
	/*	Q1
		int n=6;
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
			*/
/* Q2
		int n=6;
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(i+j<=(n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
				*/
		/* Q3
   int n=6;		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j<=(n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		*/
	/*	q4
int n=6;
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(i+j>(n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		*/
	/*q5
int n=6;
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(i<=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		*/
	/*	Q7
int n=6;
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(i+j>(n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(i<j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		*/
int n=11;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j==(n-1)/2 || i+j==(n-3) && i<=(n-1)/2 && i>0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		}
	}

