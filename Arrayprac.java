import java.util.Scanner;
public class Arrayprac {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		/*
		int num1[]= {5,10,15,20,25};
      
		for(int i=0;i<5;i++)
		{
	
		System.out.println(num1[i]);
        }
        */
		/*
		int num1[]=new int[5];
		num1[0]=5;
		num1[1]=10;
		num1[2]=15;
		num1[3]=20;
		num1[4]=25;
		
		for(int i=0;i<5;i++)
		{
	
		System.out.println(num1[i]);
        }
        */
		/*
		System.out.println("Enter Values: ");
		int num1[]=new int[5];
		
		for(int i=0;i<5;i++)
		{
		num1[i]=scan.nextInt();        
    	}
	
    	for(int i=0;i<5;i++)
	    {
         System.out.println(num1[i]);
        }
        */
		/*
  int num2[][]= { {1,2,3},{3,2,1},{8,5,2}};
  for(int i=0;i<3;i++)
  {for(int j=0;j<3;j++)
  {
   System.out.print(num2[i][j] + " ");
  }
  System.out.println();
  }
       */
		/*
		int num2[][]=new int[3][2];
		num2[0][0]=22;
		num2[0][1]=42;
		num2[1][0]=62;
		num2[1][1]=82;
		num2[2][0]=10;
		num2[2][1]=12;
		 for(int i=0;i<3;i++)
		  {for(int j=0;j<2;j++)
		  {
		   System.out.print(num2[i][j] + " ");
		  }
		  System.out.println();
		  }
		 */
	//jagged array
		/*
		  int num2[][]= { {1,2,3,8},{3,2},{8,5,2}};
		  for(int i=0;i<3;i++)
		  {for(int j=0;j<num2[i].length;j++)
		  {
		   System.out.print(num2[i][j] + " ");
		  }
		  System.out.println();
		  }
		  */

		int num1[]= {5,10,15,20,25};
	      
		for(int a: num1)
		{
			System.out.print(a + " ");
        }
        
}
}
