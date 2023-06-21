class staticExample
{
	static int  a;  //<--1
	static int b;
	
	int m;
	int n; //<<--3
	
	static 
	{
		a=10;   //<--2
		b=20;
		System.out.println("Control in staic block: ");
	}
	
	{
		m=100;   //<--4
		n=200;
		System.out.println("Control in non static block: ");
	}
	
	static void disp1()   //<---5
	{
		System.out.println("value of static value; " +a);
		System.out.println("value of static value; " +b);
	}
	 void disp2() // <--6
	{
		System.out.println("value of instance  " +m);
		System.out.println("value of instance; " +n);
	}
}
public class ExampleStatic {

	public static void main(String[] args) {
	staticExample d=new staticExample();
		staticExample.disp1();
		d.disp2();
	}

}
