
//Handling vs ducking the exception.
class ducking
{
	public void a()throws Exception
	{
		b();
	}
	
	public void b()throws Exception
	{
		int num1=45;
		int num2=0;
		int result=0;
		result=num1/num2;
		System.out.println("your result: ");
		System.out.println(result);
	}
}
public class ExceptionHandlin_Ducking {

	public static void main(String[] args)
	{
		ducking d=new ducking();
		try
		{
			d.a();
		}
		catch(Exception e)
		{
			System.out.println("lol" +e.getMessage());
		}
		

		
	}

}
