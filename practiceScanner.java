import java.util.Scanner;      //import first to take input from console;
public class practiceScanner {
 public static void main(String []argu)
 {
	 Scanner scan= new Scanner(System.in);//add this argument;
	 System.out.println("Enter name");
	 String name=scan.next();//scan is object and next is input type of string;
	 System.out.println("Enter roll no:");
	 int rollNo=scan.nextInt();
 }
}
