class Aeroplane2
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
class CargoPlane2 extends Aeroplane2
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
class PassengerPlane2 extends Aeroplane2
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
class FighterPlane extends Aeroplane2
{
	
	public  void takeoff() 
	{
		System.out.println("FighterPlane required small runway:  ");
	} 
	
	public void fly()
	{
		System.out.println("FighterPlane fly at high  height: ");
	}
	
}
class Airport
{
	void calling(Aeroplane2 ref)
	{
		ref.takeoff();
		ref.fly();
		System.out.println("<-------------------------------------->");
	}
}


public class polymorphism02 {

	public static void main(String[] args) {
	
		CargoPlane2 cp=new CargoPlane2();
		PassengerPlane2 pp=new PassengerPlane2();
		FighterPlane fp=new FighterPlane();
		
		Airport Ap=new Airport();
		Ap.calling(fp);
		Ap.calling(cp);
		Ap.calling(pp);
		/*
		Aeroplane2 ref;
		ref=cp;
		ref.takeoff();
		ref.fly();
		System.out.println("<-------------------------------------->");
		ref=pp;
		ref.takeoff();
		ref.fly();
		System.out.println("<-------------------------------------->");
		ref=fp;
		ref.takeoff();
		ref.fly();
		System.out.println("<-------------------------------------->");
*/
	/*
		cp.takeoff();
		cp.fly();
		pp.takeoff();
		pp.fly();
		fp.takeoff();
		fp.fly();
		*/
	}

}
