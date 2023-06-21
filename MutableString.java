
public class MutableString {

	public static void main(String[] args) {
		/*StringBuffer sd=new StringBuffer("virat");
		System.out.println(sd);
		sd.append("kohli");
		System.out.println(sd);
		//StringBuffer sd="raj";//invaid syntax inside java
      */
		/*
		StringBuilder sd=new StringBuilder("virat");
		System.out.println(sd);
		sd.append("kohli");
		System.out.println(sd);
	*/
		/*
		//final keyword
		int a=90;
		a=44;
		System.out.println(a);//if we not use final keyword then output is 44.
		*/
		/*
		final int a=90;
		a=44;
		System.out.println(a);
		*/
	/*	//before final
		StringBuilder sd=new StringBuilder("virat");
		sd.append("kohli");
		System.out.println(sd);
		 sd=new StringBuilder("Sachin");
		System.out.println(sd);
	*/	
		//after final
		 final StringBuilder sd=new StringBuilder("virat");
		sd.append("kohli");
		//System.out.println(sd);
		//sd=new StringBuilder("Sachin");//not support.hum jod sactay hai lakin assign nahi kar sactay hai.
		System.out.println(sd);
		
	}

}
