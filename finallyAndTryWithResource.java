import java.util.Scanner;
public class finallyAndTryWithResource {

	public static void main(String[] args) {
		int num=0;
		int nu[]= {1,2,3,4};
		Scanner sc=new Scanner(System.in);
		try
		{
			num=sc.nextInt();
			System.out.println(nu[6]);
		}
		catch(Exception e)
		{
			System.out.println("Enterd number "+e.getMessage());
		}
		finally//<--this blocked is written after try and catch block.
		{
			System.out.println("Hello");
		    sc.close();//<--this blocked execute definitely
			//example=bank login page after power cut.
		}
		
		System.out.println(num);
	}

}
