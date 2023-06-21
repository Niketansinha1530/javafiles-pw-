
public class duuup {

	public static void main(String[] args) {
	//Q1
		/*
		String str="Programing";
		StringBuilder sb=new StringBuilder();
		
		char arr[]=str.toCharArray();
				
		for(int i=0;i<arr.length;i++)
		{
			boolean repeat =false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					
					repeat=true;
					break;
				}
			}
			if(!repeat)
			{
				sb.append(arr[i]);
			}
		}
		System.out.println(sb);
		*/
		//Q2
		/*
		String str="Programing";
		StringBuilder sb=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		char arr[]=str.toCharArray();
				
		for(int i=0;i<arr.length;i++)
		{
			boolean repeat =false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					sb2.append(arr[i]);
					repeat=true;
					break;
				}
			}
			if(!repeat)
			{
				sb.append(arr[i]);
			}
		}
		System.out.println(sb);
		System.out.println(sb2);
		*/
		/*Q3
		String str="25852";
		String str2="";
		char ar[]=str.toCharArray();
		
		for(int i=ar.length-1;i>=0;i--)
		{
			str2=str2+ar[i];
		}
		
		if(str.equals(str2))
		{
			System.out.println("palindrome:");
		}
		else
		{
			System.out.println("Not palindrome: ");
		}
		*/
		String s1="Ranjana Rajput";
		 s1=s1.replace(" ", "");
		
		int vowels=0;
		int consonants=0;
		char ch[]=s1.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' ||ch[i]=='e'|| ch[i]=='i' ||ch[i]=='o' || ch[i]=='u' || ch[i]=='A' ||ch[i]=='I'|| ch[i]=='E'|| ch[i]=='U' ||ch[i]=='O')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		System.out.println("Vowels= "+vowels);
		System.out.println("Consonants= "+consonants);
	}

}
