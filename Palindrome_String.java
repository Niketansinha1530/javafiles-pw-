import java.util.Arrays;
import java.util.Scanner;
public class Palindrome_String {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		/* palindrome.
		System.out.println("Enter any String: ");
		String str=scan.next();
		String str2="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str2=str2+ str.charAt(i);
		}
		//System.out.println(str2);
		if(str.equals(str2)) {
			System.out.println("It is palindrome: ");
		}
		else
		{
			System.out.println("It is not a palindrome: ");
		}
       */
		//Q2Anagram.
		/*
		String str1="The Classroom";
		String str2="School Master java";
		//remove space. <-- we can remove this step if there is only one word.
		str1=str1.replace(" ", "");
		str2=str2.replace(" ", "");
		//covertintolowercase.<-- we can remove this step if all letter in small case.
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		//convert into array.
		char []ar1=str1.toCharArray();
		char []ar2=str2.toCharArray();
		//sorting array
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		if(Arrays.equals(ar1,ar2))
		{
			System.out.println("it is an anagram");
		}
		else {
		System.out.println("not an anagram: ");	
		}
		*/
		/*Q3
		boolean flag=false;
		String str="THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
		str=str.replace(" ", "");
		char ch[]=str.toCharArray();
		int ar[]=new int[26];
	
		for(int i=0;i<ch.length;i++)
		{
			ar[ch[i]-65]++;
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				System.out.println("Not panagram:");
				flag=true;
			}
		}
		
		if(flag==false)
		{
			System.out.println(" panagram:");	
		}
		*/
		/*
		String s= "Hello world"; s.trim();

		int i = s.indexOf(" "); 

		System.out.println(i);
		*/
		/*
		System.out.print(""=="");
		System.out.print(" ");
		System.out.print("A"=="A"); 
		System.out.print("a==A");
		*/
		/*
		String fName = "James";
		String lName = "Gosling"; 
		System.out.println(fName=lName);
		*/
		/*
		String str =" ";
	    str.trim();
		System.out.println(str.equals("")+ " " + str.isEmpty());
		*/
		
	}

}
