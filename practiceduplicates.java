
public class practiceduplicates {

	public static void main(String[] args) {
		
		String str="niketan"
				+ "";
		StringBuilder sb=new StringBuilder();
		 char ar[]=str.toCharArray();
		 
		 for(int i=0;i<ar.length;i++)
		 {
			 boolean repeat=false;
			 for(int j=i+1;j<ar.length;j++)
			 {
				 if(ar[i]==ar[j])
				 {
					 repeat=true;
					 break;
				 }
			 }
			 if(!repeat)
			 sb.append(ar[i]);
		 }
		 System.out.println(sb);
	}

}
