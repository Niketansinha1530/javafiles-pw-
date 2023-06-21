
class Mythread12 implements Runnable

{
	public void run() {
		try {
			for (int i = 1; i < 3; i++) {
				System.out.println("printing process.....");
				Thread.sleep(4000);
			}
		} catch (Exception e) {
			System.out.println("Something is problem....");
		}

		
	}

}

public class joinAndIsAliveMethod {

	public static void main(String[] args) throws Exception {

		System.out.println("Main thread starts ");
		Mythread12 d = new Mythread12();

		Thread t = new Thread(d);
		System.out.println(t.isAlive());//false becasue of it in not in not in Runnable state.
		t.start();
		System.out.println(t.isAlive());//now its in running state.//true
		t.join(); //wait for thread to complete their work come back then it go with main thread. //<--it throws Exception we need to handle it by ducking.
		System.out.println("Main thread finished ");

	}

}
