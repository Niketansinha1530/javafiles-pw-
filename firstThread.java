import java.util.Scanner;
import java.util.*;
class calculation extends Thread
{
	public void run()
	{
      Scanner  scan= new Scanner(System.in);
		
		System.out.println("Calucation started ");
		
		System.out.println("Enter first no: ");
		int num1=scan.nextInt();
		System.out.println("Enter second no: ");
		int num2=scan.nextInt();
		
		int res=num1+num2;
		System.out.println("Result = "+res);
		
		System.out.println("Calculation Ending: ");
		System.out.println("******************************************************************************************");
		
	}
}
class message extends Thread
{
	public void run()
	{
	System.out.println("Importan msg prints: ");
		
		try {
			for(int i=0;i<4;i++)
			{
				System.out.println("Focus is a important for sucess: ");
				Thread.sleep(2000);//<--here InterruptedExceptionis coming.<<--- so we need to handle this by exception handling.
			}	
		}
		catch(Exception e)
		{
			System.out.println("waiting will........");
		}
		
		System.out.println("Important msg print ends: ");
		
		
	}
}
public class firstThread {

	public static void main(String[] args) {
		
		calculation t1=new calculation();
		message t2=new message();
		
		t1.start();
		t2.start();
		
		

	}

}
