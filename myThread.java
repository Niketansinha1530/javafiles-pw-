//creation of our own Thread by extending The thread class.
class myThread1 extends Thread {
	public void run()
	{
		System.out.println("Child class");
		
	}

}

public class myThread {

	public static void main(String[] args) {

		System.out.println("Main Thread");

		myThread1 t = new myThread1();// <--object creation of our own thread.
		t.start();
	}

}
