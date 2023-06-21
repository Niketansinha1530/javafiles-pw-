//Dependency injection with constructor and setter.
class student21
{
	private Heart h;
//	public student21(Heart h)
//	{
//		this.h=h;
//	}
	
	public void setHeart(Heart h)
	{
		this.h=h;
	}
	public void call()
	{
		System.out.println("teray papa ki hjagha");
		h.heartbeat();
	}
}
class Heart
{
	public void heartbeat()
	{
		System.out.println("Heart is going on: ");
	}
}
public class Dependency_Injection {

	public static void main(String[] args) {
	
		Heart h=new Heart();
		//student21 s =new student21(h);
				//s.call();
				//or
		student21 st=new student21();
		st.setHeart(h);
		st.call();
		
				

	}

}
