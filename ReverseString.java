
public class ReverseString {

	public static void main(String[] args) {
	//Q1	
		String str="pwskill java";
		String str2="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			str2=str2+str.charAt(i);
		}
		System.out.println("Before Reversing : "+str);
		System.out.println("After Reversing : "+str2);

		/*Q2
		String str="Pwskill java";
		String str2="";
		String sarr[]=str.split(" ");
		
		for(int i=sarr.length-1;i>=0;i--)
		{
			str2=str2+ sarr[i] + " ";
		}
		System.out.println(str2);
		*/
		/*
		String str="pwskill java";
		String str2="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			str2=str2+str.charAt(i);
		}
		
		String str3=" ";
		String sarr[]=str2.split(" ");
		for(int i=sarr.length-1;i>=0;i--)
		{
			str3=str3+sarr[i] + " ";  
			
		}
		System.out.println("Before Reversing : "+str);
		System.out.println("After Reversing : "+str3);
				*/
	}

}
