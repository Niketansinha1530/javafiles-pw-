//practice java interface
interface car25
{
	void show();
	
	default void wheel()
	{
		System.out.println("tubeless tyre of MRF: ");
	}
	static void seats() {
		System.out.println("primum leather of tiger: ");
	}
	
}
class Tata implements car25
{
	public void show()
	{
		System.out.println("The luxuries car: ");
	}
	
}
public class interface05 {

	public static void main(String[] args) {
		
		car25 obj=new Tata();
		obj.show();
		obj.wheel();
		//obj.seats();
	//	car25.seats();
	}
}
