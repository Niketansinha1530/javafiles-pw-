class myException1 extends Exception//<-- custome exception handling.
{
	public myException1(){}
	
	public myException1(String s)
	{
		super(s);
	}
	}

public class ExceptionHandling_customeblock {

	public static void main(String[] args) {
		int num1=12;
		int num2=0;
		int result=0;
		try
		{
			if(num2<0)
			{
			Exception e=new myException1("negative no: ");//<for printling statement inside quote.
			throw e;		
			}
			else {
				result=num1/num2;
			}
		
		}
		catch(Exception e)
		{
			System.out.println("Enter valid no: " +e.getMessage());
			
			
		}

		System.out.println(result);

	}

}
