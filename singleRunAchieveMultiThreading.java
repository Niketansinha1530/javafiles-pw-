import java.util.Scanner;

class Mythread3 extends Thread
{
	public void run()
	{
   String name=  Thread.currentThread().getName();
   if(name.equals("calc"))
   {
	   calc();
   }
   else {
	   {
		   message();
	   }
}
	}
	public void calc()
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
	
	public void message()
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


public class singleRunAchieveMultiThreading {

	public static void main(String[] args) {
	
		
		Mythread3 t=new Mythread3();
		Mythread3 t1=new Mythread3();
		
		t.setName("calc");
		t1.setName("Message");

		t.start();
		t1.start();
	}

}
