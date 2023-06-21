
class library12 implements Runnable {

	String res1 = new String("JAVA");
	String res2 = new String("SQL");
	String res3 = new String("DSA");

	public void run() {

		String name = Thread.currentThread().getName();

		if (name.equals("STUDENT1")) {
			try {
				Thread.sleep(2000);
				synchronized (res1) {
					System.out.println("Student1 accure" + res1);
					Thread.sleep(2000);
					synchronized (res2) {
						System.out.println("Student1 accure" + res2);
						Thread.sleep(2000);
						synchronized (res3) {
							System.out.println("Student1 accure" + res3);
							Thread.sleep(2000);

						}
					}
				}

			} catch (Exception e) {
				System.out.println("Some problem: ");
			}

		} else {

			try {
				Thread.sleep(2000);
				synchronized (res3) {
					System.out.println("Student2 accure" + res3);
					Thread.sleep(2000);
					synchronized (res2) {
						System.out.println("Student2 accure" + res2);
						Thread.sleep(2000);
						synchronized (res1
								) {
							System.out.println("Student2 accure" + res1);
							Thread.sleep(2000);

						}
					}
				}

			} catch (Exception e) {
				System.out.println("Some problem: ");
			}

		}

	}
}

public class deadLockInMultiThreading {

	public static void main(String[] args) {

		library12 lb = new library12();

		Thread t1 = new Thread(lb);
		Thread t2 = new Thread(lb);

		t1.setName("STUDENT1");
		t2.setName("STUDENT2");

		t1.start();
		t2.start();

	}

}
