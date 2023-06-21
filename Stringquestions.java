import java.util.Scanner;
public class Stringquestions {

	public static void main(String[] args) {
		/*
		   StringBuilder sb=new StringBuilder("PwSkills");
		   sb.reverse();
		   System.out.println(sb);
		   */
		/*
		String str="Think Twice";
		String str2="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str2=str2 + str.charAt(i);
		}
		System.out.println(str2);
		String str3="";
		String ar[]=str2.split(" ");
		for(int i=ar.length-1;i>=0;i--)
		{
			str3=str3 +ar[i] + " ";
		}
		System.out.println(str3);
		*/
		/*
		Scanner scan=new Scanner(System.in);
		boolean flag=false;
		System.out.println("Enter any String: ");
		String s=scan.next();
		System.out.println("Ente a charchter which you want to find");
		char c=scan.next().charAt(0);
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(c==ch[i])
			{
				System.out.println("yes charachter is founded -->"+c);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Not founded");
		}
		*/
		String s1="Hello, have a goodday";
		char ch[]=s1.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' ||ch[i]=='e'|| ch[i]=='i' ||ch[i]=='o' || ch[i]=='u' || ch[i]=='A' ||ch[i]=='I'|| ch[i]=='E'|| ch[i]=='U' ||ch[i]=='O')
			{
				System.out.print(ch[i]);
			}
		}
		
		
	}

}
