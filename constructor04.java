class Bacha23
{
	int age;
	String name;
	 Bacha23()
	{
		 this(25,"rohit");
		System.out.println("Default constructor: ");
		age=18;
		name="Niketan";
//		System.out.println(age);
//		System.out.println(name);
	}
	 public Bacha23(String name)
	{
	    this();
		this.name=name;
		age=19;
	}
	Bacha23(int age , String name )
	{
		//System.out.println("hello2");
		this.age=age;
		this.name=name;
		System.out.println("Age="+age);
		System.out.println("Name="+name);
	}
	
	void disp()
	{
	System.out.println("Name : "+name);
	System.out.println("Age : "+age);
	}
}

public class constructor04 {

	public static void main(String[] args) {
		
//		Bacha23 st1=new Bacha23();
//   	    st1.disp();
		
	   Bacha23 st2=new Bacha23("Shweta");
		//st2.disp();
		
	}

}
