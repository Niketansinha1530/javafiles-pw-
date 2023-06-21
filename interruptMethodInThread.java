
class example implements Runnable
{

	
	public void run() {
		for(int i=1;i<4;i++)
		{
			try {
				System.out.println("Focus is important: ");
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				System.out.println("Intterupt is coming");// interrupt means rookawhatt honna execution tme ka samay.
			}
		}
	}
	
}
public class interruptMethodInThread {

	public static void main(String[] args) {
		System.out.println("Main started");
		example ex=new example();
		Thread t=new Thread(ex);
		t.start();
		t.interrupt();//if you call interrput method before wating state it doen't work// ya execute hi nahi karega.
		
	}
	
}
