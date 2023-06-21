class st
{
	private int age;
	private String name;
	
	st (int age,String name) // <---first parametrized  constructor .
	{
		this.age=age;
		this.name=name;
	}
	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public void setName(String name) {
//		this.name = name;
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}
public class Constructor01 {

	public static void main(String[] args) {
		
		
		st obj=new st(25,"Rahul");
//		obj.setAge(25);
//		obj.setName("Niketan");
		int age=0;
		String name=null;
		age=obj.getAge();
		name=obj.getName();
		System.out.println("Age :"+age);
		System.out.println("Name :"+name);

	}

}
