import java.util.Scanner;
class Rectangle
{
	float length;
	float breadth;
	float area;
	
	 public void input()
	{
		System.out.println("Calculation of Rectangle Area");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Rectangle = ");
		length=scan.nextFloat();
		System.out.println("Enter the breadth of Rectangle = ");
		breadth=scan.nextFloat();
	}
	public void compute()
	{
		area=length * breadth;
	}
	
	 public void disp()
	{
		System.out.println("Area of Rectangle = "+ area);
	}
}
class Square
{
	float length;
	float area;
	
	 public void input()
	{
		System.out.println("Calculation of Square Area");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Square = ");
		length=scan.nextFloat();
	}
	public void compute()
	{
		area=length * length;
	}
	
	 public void disp()
	{
		System.out.println("Area of Square = "+ area);
	}
}
class Circle
{
	float Radius;
	float area;
	
	 public void input()
	{
		System.out.println("Calculation of Circle Area");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Radius of Circle = ");
		Radius=scan.nextFloat();
	}
	public void compute()
	{
		area=(3.14f*Radius*Radius);
	}
	
	 public void disp()
	{
		System.out.println("Area of Circle = "+ area);
	}
}

public class Revision_class_of_oops {

	public static void main(String[] args) {
		

		Rectangle r=new Rectangle();//<-- tight coupling
		r.input();
		r.compute();
		r.disp();
		Square sq=new Square();
		sq.input();
		sq.compute();
		sq.disp();
		Circle c=new Circle();
		c.input();
		c.compute();
		c.disp();
		
	}

}
