//multilevel inheritance
class demo011
{
	public void disp()
	{
		System.out.println("Parent class: ");
	}
}
class demo21 extends demo011
{
	
}
class demo3 extends demo21
{
	
}
public class inheritance3 {
	public static void main(String[] args) {
		
		demo3 d=new demo3();
		d.disp();
	}

}
