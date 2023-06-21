interface computer
{
	public void compilecode();
	
}
class laptop implements computer
{
	public void compilecode()
	{
		System.out.println("its give 5 error! ");
	}
}
class desktop implements computer
{
	public void compilecode()
	{
		System.out.println("its give 5 error! faster:  ");
	}
}
class developer
{
	public void buildApp(computer obj)
	{
		System.out.println("Buildiing your app: ");
		obj.compilecode();
	}
}

/*
class computer
{
	public void compilecode()
	{
		
	}
}
class laptop extends computer
{
	public void compilecode()
	{
		System.out.println("its give 5 error! ");
	}
}
class desktop extends computer
{
	public void compilecode()
	{
		System.out.println("its give 5 error! faster:  ");
	}
}
class developer
{
	public void buildApp(computer obj)
	{
		System.out.println("Buildiing your app: ");
		obj.compilecode();
	}
}
*/
public class interface2 {

	public static void main(String[] args) {
		developer dev=new developer();
		//computer obj=new computer();
		//laptop obj=new laptop();
		//desktop obj=new desktop();
		computer obj=new desktop();
		dev.buildApp(obj);
		
		

	}

}
