interface A25
{
	//all method are abstract inside interface.
	int age=12; //<-- by default it is public static final.
	void show() ;//<-- by default it is public abstract.
		
	
}

public class interface01 {

	public static void main(String[] args) {
		
		System.out.println(A25.age);
	
		//A obj=new A();//we can't initiate the object of interface.
	}
}
