interface A2
{
	void show();
}

interface X
{
	void disp();
}

class B implements A2,X
{
	 public void show()
	{
		System.out.println("in show: ");
	}
	 public void disp()
	 {
		 System.out.println("display: ");
	 }
}

public class interface04 {

	public static void main(String[] args) {
		
		B obj=new B();
		
		/*
		A obj=new B();
		//obj.disp(); //<-- not defined for A
		*/
		 
		obj.show();
		obj.disp();
		

	}

}
