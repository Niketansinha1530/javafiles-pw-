
public class NIKETANPattern {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<n;i++)
		{
			//N
			for(int j=0;j<n;j++)
			{
				if(j==0|| j==n-1 || i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//I
			System.out.print("  ");
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
			//K
			System.out.print("  ");
			for(int j=0;j<n;j++)
			{
				if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//E
			System.out.print("  ");
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n-1 || j==0 || i==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}	
			//T
			System.out.print("  ");
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
			
			//A
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(j==0|| j==n-1 || i==0 || i==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//N
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(j==0|| j==n-1 || i==j)
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
