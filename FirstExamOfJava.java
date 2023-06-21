
import java.util.Scanner;

class ThisKeyword {

    private int a = 4;

   private int b = 1;

void getSum(int a, int b) {

     this.a = a;

     this.b = b;

     System.out.println(this.a + this.b);

   }

}

 


public class FirstExamOfJava{

   public static void main(String args[]) {
	 
	   Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
	   System.out.print("Enter a string: ");  
	   String str= sc.nextLine();              //reads string   
	   System.out.print("You have entered: "+str);    
  }

}