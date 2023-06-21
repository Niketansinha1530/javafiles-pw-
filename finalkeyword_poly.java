// final class animal2{<---class in not inherited with final.
//	
//	public void sleep()
//	{
//		System.out.println("Animal sleep: ");
//	}
//}
 abstract class animal2{
		
	final public void sleep()
	{
		System.out.println("Animal sleep: ");
	}

}
class Tiger2 extends animal2
{
//	public void sleep()  //<-- method not be modiefied.
//	{
//		System.out.println("Animal sleep: ");
//	}
}

public class finalkeyword_poly {

	public static void main(String[] args) {
	 
		Tiger2 t=new Tiger2();
		t.sleep();

	}

}
