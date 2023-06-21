interface A5
{
	void show();
	 default void config()//non static method
	{
		
	}
	 static void abc()
	 {
		 System.out.println("in abc: ");
	 }
}

class B4 implements A5
{
	public void show()
	{
		System.out.println("in show: ");
	}
}

public class interface_java8 {

	public static void main(String[] args) {
		A5.abc();//<--static method of interface can invoked  only with interface refrences.
		//for non static method we requires class for invoked the methods.
		A5 obj= new B4();
		obj.show();
		obj.config();//non static method//  A5.config();<--not work.
		//obj.abc();

	}

}
