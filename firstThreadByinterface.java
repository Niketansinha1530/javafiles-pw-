//multithreading is implementing by Runnable interface.
import java.util.Scanner;
class calculate implements Runnable
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
class message2 implements Runnable
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

public class firstThreadByinterface {

	public static void main(String[] args) {
		
		calculate c=new calculate();
		message2 m=new message2();
		
		Thread t1=new Thread(c);
		Thread t2=new Thread(m);
		
		t1.start();
		t2.start();

	}

}
