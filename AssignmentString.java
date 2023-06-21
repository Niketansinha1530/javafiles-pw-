import java.util.*;
public class AssignmentString {

	public static void main(String[] args) {
	/*	Q1
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str=scan.next();
		System.out.println(str);
		*/
		/*Q2
		String s1="Niketan";
		String s2="sinhaa";
		s1=s1.concat(s2);
		System.out.println(s1);
*/
		/*Q4
		String str="Hello, have a goodday";
		System.out.println(str.length());
		*/
		/*Q5
		String s1="Ram";
		String s2="Ram";
		System.out.println(s1.equals(s2));
				*/
		String s1="umbrella";
		char ch=0;
		for(int i=0;i<s1.length();i++)
		{
			  ch=s1.charAt(i);
			if('e'==ch)
			{
			System.out.println("Letter is founded");	
			break;
			}
		}
	}

}
