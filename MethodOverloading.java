class demo{
	/*//method overloading
	public int add(int n1,int n2)
	{
		
		int result=n1+n2;
		return result;
	}
	
	public int add(int n1,int n2,int n3) //same name but different no of parameters.
	{
		
		int result=n1+n2+n3;
		return result;
	}
	
	public double add(double n1,double n2)//same name but different type of parameters. double
	{
		
		double result=n1+n2;
		return result;
	}
	*/
	/* if byte not there then print short
	public void show(byte n)
	{
		System.out.println("byte "+n);
	}
	*/
	/*
	public void show(short n)
	{
		System.out.println("short "+n);
	}
	*/
	public void show(int n)
	{
		System.out.println("int "+n);
	}
	/*if char is not present then going into int.
	public void show(char n)
	{
		System.out.println("char "+n);
	}
	*/
	public void show(double n)
	{
		System.out.println("double "+n);
	}
	
	
}
public class MethodOverloading {

	public static void main(String[] args) {
		demo obj= new demo();
		/*
	//	methodoverloading
		int result=obj.add(4,6);
		int resl=obj.add(4,6,7);
		double resl2=obj.add(4.5, 5.9);
		System.out.println(result);
		System.out.println(resl);
		System.out.println(resl2);
		*/
		//Automatic promotion in overloading
		byte b=8;
		obj.show('t');
	}

}
