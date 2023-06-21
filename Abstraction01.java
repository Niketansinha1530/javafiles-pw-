abstract class Aeroplane3 {
	abstract public void takeoff();

//	{
//		System.out.println("Aeroplane is takeoff : ");
//	}
	abstract public void fly();

//	{
//		System.out.println("Aeroplane fly: ");
//	}
	public void landing()

	{
		System.out.println("Aeroplane is landing: ");
	}

}

class CargoPlane3 extends Aeroplane3 {

	public void takeoff() {
		System.out.println(" CargoPlane required long runway:");
	}

	public void fly() {
		System.out.println("CargoPlane fly at higher height: ");
	}

	public void alert() {
		System.out.println("Alert");
	}

}

class PassengerPlane3 extends Aeroplane3 {

	public void takeoff() {
		System.out.println("PassengerPlane required medim runway:  ");
	}

	public void fly() {
		System.out.println("PassengerPlane fly at middle height: ");
	}

}

public class Abstraction01 {

	public static void main(String[] args) {

		Aeroplane3 ref1 = new CargoPlane3();
		ref1.takeoff();// <---overridden method
		ref1.fly();// <---overridden method
		ref1.landing();// <--inherited method
		((CargoPlane3) ref1).alert(); // <-- specialized method of child class.(down casting).
		System.out.println("<---------------------------------------->");

		Aeroplane3 ref3 = new PassengerPlane3();
		ref3.takeoff();
		ref3.fly();
		ref3.landing();

		// Aeroplane3 ref=new Aeroplane3();//<-- can't initate the object of abstract
		// class;

	}

}
