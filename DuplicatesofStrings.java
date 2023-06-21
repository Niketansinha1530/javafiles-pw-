
public class DuplicatesofStrings {

	public static void main(String[] args) {
		String str="programing";
		//approach1
		/*
		StringBuilder sb = new StringBuilder();
				
				for(int i=0;i<str.length();i++)
				{
					char ch=str.charAt(i);
					int indx=str.indexOf(ch, i+1);
					if(indx==-1)
					{
						sb.append(ch);
					}
	
				}
			System.out.println(sb);
			*/
		/*
		StringBuilder sb=new StringBuilder();
		char arr[]=str.toCharArray();
		//System.out.println(arr.length);
		for(int i=0;i<arr.length-1
				;i++)
		{
			boolean repeat=false;
			for(int j=i+1;i<arr.length-1;j++)
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
}
	

}
