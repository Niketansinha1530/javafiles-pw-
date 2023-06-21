
public class ExceptionHandling_throw_keyword {

	public static void main(String[] args) {
		
		int num1=12;
		int num2=-2;
		int result=0;
		try
		{
			if(num2<0)
			{
			Exception e=new Exception("negative no");//<for printling statement inside quote.
			throw e;		
			}
			else {
				result=num1/num2;
				System.out.println(result);
			}
		
		}
		catch(Exception e)
		{
			System.out.println("Enter valid no: " +e.getMessage());
		}

		
	}

}
