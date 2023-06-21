import java.util.*;

abstract  class Shape
{
	 public float area;
	
	abstract public void input();
	abstract  public void compute();
	public void display()
	{
		System.out.println("Area of shape is ="+area);
	}
}
 class rectangle extends Shape
{
	float length;
	float breadth;
	
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
	
}
	
 class square extends Shape
 {
 	float length;
 	
 	public void input()
 	{

		System.out.println("Calculation of Square Area");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Square = ");
		length=scan.nextFloat();
 	}
 	public void compute()
 	{
 		area=length *length;
 	}
 	
 }

 class circle extends Shape
 {
 	float radius;
 	
 	public void input()
 	{

		System.out.println("Calculation of Square Area");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius of circle = ");
		radius=scan.nextFloat();
 	}
 	public void compute()
 	{
 		area=3.14f*radius *radius;
 	}
 	
 }
 class Geometry
 {
 	public void polly(Shape ref)//<-- loose coupling
 	{
 		ref.input();
 		ref.compute();
 		ref.display();
 		System.out.println("<-------------------------------------->");
 	}
 }
public class Application_on_oops {

	public static void main(String[] args) {
		rectangle r=new rectangle();
		square s=new square();
		circle c=new circle();
	
		Geometry g=new Geometry();
		g.polly(c);//<-- loose coupling
		
		

	}

}
