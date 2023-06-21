
class cons
{
	private int a;
	private int b;
	
//	cons()<--this is automatically called behind the scene.
//	{
//		System.out.println("Default constructor");
//	}
	cons()
	{
		System.out.println("zero parametrized constructor by programmer ");
	}
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
	}
	cons(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
}
public class Constructor02 {

	public static void main(String[] args) {
		
   
		cons obj=new cons();
		obj.disp();
		
		cons obj1=new cons(5,6);
		obj1.disp();
		
		
	}

}
