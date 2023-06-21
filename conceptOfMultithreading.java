import java.util.*;
public class conceptOfMultithreading {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Calucation started ");
		
		System.out.println("Enter first no: ");
		int num1=scan.nextInt();
		System.out.println("Enter second no: ");
		int num2=scan.nextInt();
		
		int res=num1+num2;
		System.out.println("Result = "+res);
		
		System.out.println("Calculation Ending: ");
		System.out.println("******************************************************************************************");
		
		System.out.println("Printing stars: ");
		
		for(int i=0;i<4;i++)
		{
			System.out.println("*");
		}
		
		System.out.println("******************************************************************************************");
		
		System.out.println("Importan msg prints: ");
		
		
		for(int i=0;i<4;i++)
		{
			System.out.println("Focus is a important for sucess: ");
		}
		
		System.out.println("Important msg print ends: ");
		
		
		
	}
}
