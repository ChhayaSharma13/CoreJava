package multithreading;
class A{
	int num;
	public void put(int num) {
		this.num = num;
	}
	public int get() {
		return num;
	}
}
class Producer implements Runnable{
	A a;

	public Producer(A a) {
//		super();
		this.a = a;
		Thread t = new Thread(this,"Producer");
		t.start();
	}
	public void run() {
		int i=0;
//		infinite loop
		while(true) {
			a.put(i++);
			try {Thread.sleep(1000);}catch(Exception e) {};
		}
	}
}
class Consumer implements Runnable{
	A a;
	public void run() {
		
	}
	public Consumer(A a) {
//		super();
		this.a = a;
		Thread t = new Thread(this,"Consumer");
		t.start();
	}
	
}
public class InterThreadCommunication {
	public static void main(String[] args) {
		
	}
}
