class calc
{
	public int add(int num[])
	{
		int result=0;
		for(int n: num)
		{
			result=result + n;
		}
		return result;
	}
}
public class AnonymousArray {

	public static void main(String[] args) {
		
		calc obj=new calc();
		//int num[]= {2,4,6,8};
		//int result=obj.add(num);
		int result=obj.add( new int[]{2,4,6,8});//Anonymous array work
		System.out.println(result);
	}

}
