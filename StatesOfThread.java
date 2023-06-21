class Demo30 implements Runnable {
	public void run() {
		System.out.println("child thread Executed");//running state.
		try {
			Thread.sleep(4000); // blocked state
		} catch (Exception e) {
			System.out.println("Some problem: ");
		}
		System.out.println("child thread completed"); // dead state
	}
}

public class StatesOfThread {

	public static void main(String[] args) {

		System.out.println("Main thread started: ");
		Demo30 d = new Demo30();
		Thread t = new Thread(d); // new /born state

		t.start(); // runnable states
	}

}
