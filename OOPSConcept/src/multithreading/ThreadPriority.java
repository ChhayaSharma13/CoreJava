package multithreading;

public class ThreadPriority {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() ->{
			for(int i=0;i<=5;i++) {
				System.out.println("Hello");
				try {Thread.sleep(1000);}catch(Exception ex) {};
			}
		});
		Thread t2 = new Thread(() ->{
			for(int i=0;i<=5;i++) {
				System.out.println("Namaste");
				try {Thread.sleep(1000);}catch(Exception ex) {};
			}
		}, "Namaste Thread");
		t1.start();
		t1.setName("Hello Thread");
		System.out.println(t1.getName());
		System.out.println("2nd Thread: "+t2.getName());
		try {Thread.sleep(100);}catch(Exception ex) {};
		t2.start();
		System.out.println("Bye");
	}
}
