package multithreading;

public class JoinIsAlive {
	
	public static void main(String[] args) throws Exception {
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
		});
		t1.start();
		try {Thread.sleep(100);}catch(Exception ex) {};
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println("Bye");
		
		
	}
}
