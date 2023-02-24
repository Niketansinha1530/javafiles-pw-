import java.util.Scanner;
public class Ranjana {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Enter any no:");
		//int n=scan.nextInt();
		int n=11;
		//RANJANA
		for(int i=0;i<n;i++)
		{
			//R
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==0 || j==(n-1)&& i<=(n-1)/2 || i==(n-1)/2 || i-j==(n-1)/2)
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
				if(j==0 || i==0 || j==n-1 || i==(n-1)/2)
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
				if(j==0  || j==n-1 || i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//J
			System.out.print(" ");
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(i==0  || j==(n-1)/2 || i==(n-1) && j<=(n-1)/2 || j==0 && i>=(n-1)/2)
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
				if(j==0 || i==0 || j==n-1 || i==(n-1)/2)
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
				if(j==0  || j==n-1 || i==j)
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
				if(j==0 || i==0 || j==n-1 || i==(n-1)/2)
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
