
public class String_part2 {

	public static void main(String[] args) {
		/*
		//concatination
		String s1="pw";
	   // s1.concat("Skill");
		//System.out.println(s1);
		s1=s1.concat("Skill");//memory reference change
		System.out.println(s1);*/
		//Q2
		/*
		String s1="pwjava";
		String s2=s1.concat("skill");
		String s3=new String("pwjava");
		s3=s3.concat("Skill");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		*/
		//Q3
		String s1="pw";
		String s2="pw"+"skill";
		String s3="pw"+ "java"+"skill";
		String s4=s1+s2;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		String str="pw"+100+99;
		System.out.println(str);
	}

}
