import java.util.Scanner;
public class salaryCalculator {
public static void main(String []argu) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your salary: ");
	int salary=scan.nextInt();
	
	System.out.println("Enter No's of days in month: ");
	int days=scan.nextInt();
	
	double salaryOfOneDay=salary/days;
	System.out.println("Salary of one day is: "+salaryOfOneDay);
	
	double salaryOfOneHour=salaryOfOneDay/8;
	System.out.println("Salary of one hour is: Rs"+salaryOfOneHour);
	
	System.out.println("Enter overtime in Hour: ");
	int overTime=scan.nextInt();
	
	System.out.println("Enter no of days for calculating month overtime: ");
	int daysForoverTime=scan.nextInt();
	double overTimeMoney=salary/daysForoverTime;
	
	double totalSalary=salary+overTimeMoney;
	System.out.println("Total salary ="+totalSalary);
	
    }
}
