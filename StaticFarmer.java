import java.util.Scanner;
class farmer
{
	float principal;
	float time;
	float SI;
	static float RateI; // for Rate only once memory allocate: due static keyword;
	
	 static
	 {
		 RateI=8.5f;
	 }
	void input()
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter pricipal amount: ");
		principal=scan.nextFloat();
		System.out.println("Enter time duration of Loan: ");
		time=scan.nextFloat();
	}
	void compute()
	{
		SI=(principal*time*RateI)/100;
	}
	void display()
	{
		System.out.println("Simple intrest: "+ SI);
	}
}
public class StaticFarmer {

	public static void main(String[] args) {
		
		farmer f=new farmer();
		f.input();
		f.compute();
		f.display();
		farmer f1=new farmer();
		f1.input();
		f1.compute();
		f1.display();
	}

}
