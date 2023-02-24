
public class typecasting {

	public static void main(String[] args) {
		int a=45;
		double b;
		b=a;//implicite casting
		System.out.println(b);

		double num1=45.25;
		int num2;
		num2=(int)num1;//explicite typecasting
		System.out.println(num2);
		
		int n1=18;
		int n2=4;
		float res=n1/n2;//truncation after decimal value are removed
		System.out.println(res);
	}

}
