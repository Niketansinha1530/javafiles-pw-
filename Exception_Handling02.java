//multiple try and catch exception handling.

public class Exception_Handling02 {

	public static void main(String[] args) {
		int num1=12;
		int num2=3;
		int result=0;
		int ar[]= {12,36,24,48};
		String name=null;
				
		System.out.println("Your result");
		try
		{
		 result=num1/num2;
		 //System.out.println(ar[6]);
		 result =num1/name.length();
		
		 System.out.println("No exception:");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't devided by zero" +e.getMessage());//e gives whats the reason of exception .
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array size out of limit " +e.getMessage());//e gives whats the reason of exception .
		}
		catch(Exception e)
		{
			System.out.println("Still processing....." +e.getMessage());//e gives whats the reason of exception .
		}
		
		
		System.out.println("Result = "+result);
		System.out.println("bye");

	}

}
