
public class array2d {

	public static void main(String[] args) {
		//first way to declare array value
	/*	int ar[][]= {
				{2,3},{7,5},{5,8}
		            };
*/
	// -->	//2nd way to declare array;
		/*
		int ar[][]=new int[3][2];
		ar[0][0]=2;
		ar[0][1]=3;
		ar[1][0]=7;
		ar[1][1]=5;
		ar[2][0]=5;
		ar[2][1]=8;
		*/
		/*
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print(ar[i][j] + " ");
		}
		System.out.println();
	}
	*/
		
		// -->//jagged array
		
		int ar[][]= {
				{2,3,1,6},{7,5},{5,8,7}
		            };
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j] + " ");
			}
		     	System.out.println();
	    }
	
		/*
		int ar[][]=new int[3][];
		ar[0] =new int [4]; //-- >size of first row
		ar[1] =new int[2];//-- >size of second row
		ar[2]=new int [3];//-- >size of third row
		*/
}
}

