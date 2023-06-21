//Errors are three type. syntax,logical,runtime error.
import java.util.Scanner;
public class Exception_Handling {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first no: ");
		int num1=scan.nextInt();
		System.out.println("Enter second no: ");
		int num2=scan.nextInt();
		float result=0;
		System.out.println("Your result");
		try
		{
		 result=num1/num2;//it is critical statement . exception may be come.//when exception occure inside try then it throw to catch.
		 System.out.println("No exception:");
		 
		}
		catch(Exception e)
		{
			System.out.println("Still processing....." +e);//e gives whats the reason of exception .
			System.out.println("bye");
		}
		
		System.out.println("Result = "+result);
		

	}

}
