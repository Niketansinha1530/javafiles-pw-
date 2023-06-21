//for understanding.
class papa
{
	public void sweet()
	{
		System.out.println("He is too sweet: ");
	}
	beta b=new beta();
}
class beta
{
	public void brave()
	{
		System.out.println("he is too brave");
	}
}
public class HasARelationship1 {

	public static void main(String[] args) {
		
		papa p=new papa();
		p.sweet();
		p.b.brave();
	}

}
