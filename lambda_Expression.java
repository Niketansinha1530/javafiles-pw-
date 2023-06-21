
//lambda expression. lambda expression is use for reduce the code of ananymous inner class code.
@FunctionalInterface
interface car2
{
	//void show(int avg , int ts);
	//void show();
	void show(int avg );
	
}
public class lambda_Expression {

	public static void main(String[] args) {
	
		car2 obj=avg ->{
		System.out.println("display......"+avg); //<<-- lambda expression programm.
		};
		obj.show(16);//we can pass parameter inside it .
	}

}
