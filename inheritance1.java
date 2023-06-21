
//simple concept on inheritance
class human //parent//base class//Super class
{
	int age;
	void sleep()
	{
		age=20;
		System.out.println("Human needs to sleep");
		System.out.println(age);
	}
}

class niketan extends human //sub class//child class //derived class
{
	
}
public class inheritance1 {
	
public static void main(String[] args) {
	
	niketan st =new niketan();
	st.sleep();
	
}
}
