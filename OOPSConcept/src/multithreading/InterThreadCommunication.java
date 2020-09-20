package multithreading;
class A{
	int num;
	public void put(int num) {
		System.out.println("Put: "+num);
		this.num = num;
	}
	public void get() {
		System.out.println("Get: " +num);
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
		while(true) {
			a.get();
			try {Thread.sleep(1000);}catch(Exception e) {};
		}
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
		A a = new A();
		new Producer(a);
		new Consumer(a);
	}
}
