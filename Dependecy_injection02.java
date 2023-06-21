
class car4
{
	public engine e;
    public car4(engine e)
 {
	 this.e=e;
 }
 public void drive()
 {
	 e.engineStart();
 }
}
class engine
{

	public void engineStart()
	{
		System.out.println("Drive car: ");
	}
}
public class Dependecy_injection02 {

	public static void main(String[] args) {
		
engine e=new engine();
car4 c=new car4(e);
c.drive();
	}

}
