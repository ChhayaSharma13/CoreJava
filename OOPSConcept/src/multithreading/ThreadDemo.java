package multithreading;
class Hello extends Thread{
	public void run() {
//		run() is internal method of start() in Thread class
//		if we are extending thread we should override run() method
		for(int i=1; i<=5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Hi extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		Hello h1 = new Hello();
		Hi h2 = new Hi();
		h1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		h2.start();
	}
}
