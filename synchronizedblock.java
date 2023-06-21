class car67 implements Runnable {

	public void run() {

		try {
			System.out.println(Thread.currentThread().getName() + "has entered in parking alot");
			Thread.sleep(2000);
			synchronized (this) {
				System.out.println(Thread.currentThread().getName() + "enter in car");
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + "start engine for for driving");
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + " come back the car in parking area");
			}
		} catch (Exception e) {
			System.out.println("Something wrong....");
		}

	}
}

public class synchronizedblock {

	public static void main(String[] args) {
		car67 c = new car67();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);

		t1.setName("SON-1");
		t2.setName("SON-2");
		t3.setName("SON-3");

		t1.start();

		t2.start();
		t3.start();

	}

}
