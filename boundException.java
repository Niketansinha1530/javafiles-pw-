
public class boundException {

	public static void main(String[] args) {
		
		int num[]= {2,4,6,8};
		
		//System.out.println(num[num.length-1]);//<--use this for avoid exceptions.
//		for(int i=0;i<num.length;i++)//<--use this for avoid exceptions.
//		{
//			System.out.println(num[i]);
//		}
    //for array use enhance for loop;
		for(int n: num)
		{
			System.out.println(n);
		}
		
		
	}

}