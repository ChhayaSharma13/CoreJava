package multithreading;

public class ThreadPriority {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() ->{
			for(int i=0;i<=5;i++) {
				System.out.println("Hello and Thread Priority is: " + Thread.currentThread().getPriority());
				try {Thread.sleep(1000);}catch(Exception ex) {};
			}
		});
		Thread t2 = new Thread(() ->{
			for(int i=0;i<=5;i++) {
				System.out.println("Namaste");
				try {Thread.sleep(1000);}catch(Exception ex) {};
			}
		});
		t1.start();
//		t1.setName("Hello Thread");
//		System.out.println(t1.getName());
//		System.out.println("2nd Thread: "+t2.getName());
		try {Thread.sleep(100);}catch(Exception ex) {};
		t2.start();
		
//		Thread Priority ranges from lowest to highest as 1 to 10 respectively
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		
		t1.join();
		t2.join();
		System.out.println("Bye");
	}
}
