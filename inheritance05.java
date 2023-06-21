//rules to override method in child class.
class animal1
{
	public void eats()
	{
		System.out.println("Animals eat everyday: ");
	}
}
class tiger1
{
	public void eats()
	{
		System.out.println("Tiger eats meat: ");
	}
//	void eats()//<-- error visiblity not be decreased.only increased.
//	{
//		System.out.println("Tiger eats meat: ");
//	}
//int eats()//<-- error returntype not change.
//	{
//		System.out.println("Tiger eats meat: ");
//	}
//public void  eats(int x)//<-- error not change parameter if we change concept of overloading is use.
//	{
//		System.out.println("Tiger eats meat: ");
//	}
}
public class inheritance05 {

	public static void main(String[] args) {
	
		tiger1 t=new tiger1();
		t.eats();
		

	}

}
