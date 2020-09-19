package multithreading;

public class LambdaThread{
	public static void main(String[] args) { 
//		Created anonymous class
//		Passed function directly as object
		Thread t1 = new Thread(() ->{
			for(int i=0;i<=5;i++) {
				System.out.println("Hello");
				try {Thread.sleep(1000);}catch(Exception e){};
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i=0;i<=5;i++) {
				System.out.println("Namaste");
				try {Thread.sleep(1000);}catch(Exception e){};
			}
			});
		
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {};
		t2.start();
	}
}
