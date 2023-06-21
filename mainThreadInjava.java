

public class mainThreadInjava {

	public static void main(String[] args) {
	
		System.out.println("Main thread: ");
		System.out.println("Before changing");
		
		String name=Thread.currentThread().getName();
		System.out.println("The main thread Name is "+name);
		System.out.println("The main thread priority is "+Thread.currentThread().getPriority());
		System.out.println("After changing: ");
		Thread t= Thread.currentThread();
		t.setName("Niketan");
		t.setPriority(1);
		String name1=Thread.currentThread().getName();
		System.out.println("The main thread Name is "+name1);
		System.out.println("The main thread priority is "+Thread.currentThread().getPriority());
	}

}
