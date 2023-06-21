/*for understanding niketan
class bus
{
	static
	{
		System.out.println("hi i am in bus class");
	}
}
*/
public class Static7th {

	static int age;
	static
	{
		age=28;
		System.out.println(age);
		System.out.println("Static block first");
	}
	static  void display()
	{
		System.out.println(" This method excute after  main method after calling in main method: ");
	}
	public static void main(String[] args) {

		System.out.println("main method");
		display();
		
//bus r=new bus();
		
	}
}
