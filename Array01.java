import java.util.Scanner;
public class Array01 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int num[]= new int[4];//taking input from user in array.
	//	num[0]=12;
	//  num[1]=17;
	//	num[2]=14;
	//	num[3]=11;
		System.out.println("Enter values :");
		
		for(int i=0;i<=3;i++)
		{
		num[i]=scan.nextInt();
		}
		
		for(int i=0;i<=3;i++)
		{
		System.out.println(num[i]);
		}

	}

}
