//Run time polymorphism:
class Aeroplane1
{
	public  void takeoff() 
	{
		System.out.println("Aeroplane is takeoff : ");
	}
	public void fly()
	{
		System.out.println("Aeroplane fly: ");
	}
}
class CargoPlane1 extends Aeroplane1
{
	
	public  void takeoff() 
	{
		System.out.println(" CargoPlane required long runway:");
	}
	
	public void fly()
	{
		System.out.println("CargoPlane fly at higher height: ");
	}
	
}
class PassengerPlane1 extends Aeroplane1
{
	
	public  void takeoff() 
	{
		System.out.println("PassengerPlane required medim runway:  ");
	} 
	
	public void fly()
	{
		System.out.println("PassengerPlane fly at middle height: ");
	}
	
}

public class polymorphism1 {

	public static void main(String[] args) {
		
		CargoPlane1 cp=new CargoPlane1();
		
		PassengerPlane1 pp=new PassengerPlane1();
		
		Aeroplane1 ref;  //<-- aeroplane is parent class it can only hold the child class object refrence:
		
		//pp=cp; <-=subclass not take refrence of other obj:
		//runtime polymorhism 
		
		ref=cp;
		ref.takeoff();
		ref.fly();
		
		System.out.println("<------------------------------------------------------------>");
		
		ref=pp;
		ref.takeoff();
		ref.fly();
		/*
		cp.takeoff();
		cp.fly();
		
		pp.takeoff();
		pp.fly();
		*/
	}

}
