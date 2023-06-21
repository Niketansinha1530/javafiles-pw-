//constrctor execution in case of inheritance.
class Demo1
{
	int a,b;
	Demo1()
	{
		System.out.println("Parent class constructor: ");
	}
	Demo1(int x,int y)
	{
		System.out.println("Parmetrized  parent class consturctor: ");
		a=x;
		b=y;
	}
}
class Demo2 extends Demo1
{
	int m,n;
	Demo2()
	{
		System.out.println("child class constructor: ");
	}
	Demo2(int x,int y)
	{
		//this();
		//super(25,54);
		System.out.println("Parmetrized  child class consturctor: ");
		m=x;
		n=y;
	}
}
public class inheritance06 {

	public static void main(String[] args) {
	
		//Demo2 d=new Demo2();
		Demo2 d1=new Demo2(10,20);
		
		
	}

}
