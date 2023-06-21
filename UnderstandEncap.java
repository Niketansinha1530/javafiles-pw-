class Encap
{
	private int pgNo;

	
	public void setPgNo(int x) {  //private member use karkay hum uspay control rakh sactay hai for properuse.
		if(x>0)
		pgNo = x;
		else {
			System.out.println("Pagal hai kya bencho");
		}
	}
	public int getPgNo() {
		return pgNo;
	}

	

}
public class UnderstandEncap {
public static void main(String[] args) {
	Encap obj = new Encap();
	obj.setPgNo(-100);
	int pageNo=obj.getPgNo();
	System.out.println(pageNo);
}
}
