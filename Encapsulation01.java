 class student
{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Encapsulation01 {

	public static void main(String[] args) {
		
		student obj=new student();
		obj.setAge(25);
		obj.setName("Niketan");
		int age;
		String name;
		age=obj.getAge();
		name=obj.getName();
		System.out.println("Age :"+age);
		System.out.println("Name :"+name);
		
	}

}
