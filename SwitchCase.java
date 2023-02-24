import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Month no:");
		int month=scan.nextInt();
		
		switch(month)
		{
		case 1: System.out.println("january month,31 days");
		break;
		case 2: System.out.println("february month,28,29 days");
		break;
		case 3: System.out.println("march month,31 days");
		break;
		case 4: System.out.println("april month,30 days");
		break;
		case 5: System.out.println("may month,31 days");
		break;
		case 6: System.out.println("june month,30 days");
		break;
		case 7: System.out.println("july month,31 days");
		break;
		case 8: System.out.println("august month,31 days");
		break;
		case 9: System.out.println("september month,30 days");
		break;
		case 10: System.out.println("october month,31 days");
		break;
		case 11: System.out.println("november month,30 days");
		break;
		case 12: System.out.println("december month,31 days");
		break;
		default : System.out.println("wrong Month no:");
		}

	}

}
