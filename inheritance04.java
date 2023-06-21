
//Types of method
class Aeroplane
{
	public  void takeoff() 
	{
		System.out.println("Aeroplane is takeoff : ");
	}
	public void fly()//overridden method
	{
		System.out.println("Aeroplane fly: ");
	}
	
}
class CargoPlane extends Aeroplane
{
	//takeoff() is inherited method
	public void fly()//overridding method
	{
		System.out.println("CargoPlance fly at lower height: ");
	}
	public void carryGoods()//specialized method.
	{
		System.out.println("CargoPlane carry goods: ");
	}
}
class PassengerPlane extends Aeroplane
{
	//takeoff() is inherited method
	public void fly()//overridding method
	{
		System.out.println("PassengerPlane fly at middle height: ");
	}
	public void carryPassengers()//specialized method.
	{
		System.out.println("PassengerPlane carry Passengers: ");
	}
}
public class inheritance04 {

	public static void main(String[] args) {
		
		
		Aeroplane A=new CargoPlane();
		A.takeoff();
		A.fly();
		
		
		
		PassengerPlane B=new PassengerPlane();
		B.takeoff();
		B.fly();
		B.carryPassengers();

	}

}
