
public class increAndDecre {
public static void main(String []argu)
{
	int a=5;
	
	//a++;//increment
	//a--;//decrement
	
	//System.out.println(a);
	//System.out.println(a);
	int b;
	//b=a++;//postincrement
	//b=++a;//preincrement;
	//System.out.println(b);
	
	//b=a--;
	//b=--a;
	//System.out.println(b);
	b=a++ + ++a + --a;
	System.out.println(b);
	
}
}
