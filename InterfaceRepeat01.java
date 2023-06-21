
interface A
{
	int num=6;//<-Static variable
	void show();
	
}
public class InterfaceRepeat01 {

	public static void main(String[] args) {
		
		//A a=new A();
		System.out.println(A.num);//Static variable not required any object and we can't create interface object
	}

}
