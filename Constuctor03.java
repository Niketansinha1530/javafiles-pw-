class Bacha
{
	int age;
	String name;
	 Bacha()
	{
		System.out.println("Default constructor: ");
		age=18;
		name="Niketan";
	}
	 public Bacha(String name)
	{
		this.name=name;
		age=19;
	}
 public	Bacha(int age , String name )
	{
		this.age=age;
		this.name=name;
	}
	
	void disp()
	{
	System.out.println("Name : "+name);
	System.out.println("Age : "+age);
	}
}
public class Constuctor03 {

	public static void main(String[] args) {
	
		//constructor overloading concept;
		Bacha st1=new Bacha();
		st1.disp();
		
		Bacha st2=new Bacha("Shweta");
		st2.disp();
		
		Bacha st3=new Bacha(18,"Ranjana");
		st3.disp();
		
}
}
