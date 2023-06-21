//single level inheritance

class human2
{
	int age;
	private String name;
	
	human2()
	{
		System.out.println("Human class constructor: ");
	}
	void sleep()
	{
		age=20;
		System.out.println("Human needs good sleep: ");
		System.out.println(age);
	}
}
class student2 extends human2
{
	/*
	student2() //default constructor call itself behind the scene
	{
		super();
	}
	*/
	void disp()
	{
		System.out.println("Student class: ");
		System.out.println("The age is : "+age);
		//System.out.println("The name is : "+name);//name in not inherited in another class because of private data members.
	}
}
public class inheritance2 {

	public static void main(String[] args) {
		
		student2 st=new student2();
		st.sleep();
		st.disp();
		

	}

}
