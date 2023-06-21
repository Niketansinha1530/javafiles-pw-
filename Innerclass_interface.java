class person
{
	 public void show()
	{
		System.out.println("in show: ");
	}
	class address
	{
	static void disp()
		{
			System.out.println("in Disp: ");
		}
	}
}
public class Innerclass_interface {

	public static void main(String[] args) {
		person obj=new person();
		obj.show();
		
		person.address obj1= obj.new address();//<--obj1 object of address.
        obj1.disp();
        
		//person.address obj1=new person.address();
        
	
	}

}
