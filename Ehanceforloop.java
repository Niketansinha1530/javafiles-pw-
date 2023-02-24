
public class Ehanceforloop {

	public static void main(String[] args) {
		
		//int arr[]= {25,26,27,28};
		
		int arr[][]= {
				{1,2,3,4}, {5,6,8,6},{7,8,9,1}
		};
		
		for(int n[]: arr)
		{
			for(int b: n)
			{
			System.out.print(b);
		}
	System.out.println();
	}

}
}
