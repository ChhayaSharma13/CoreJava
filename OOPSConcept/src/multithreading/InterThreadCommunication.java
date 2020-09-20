package multithreading;
class A{
	int num;
	boolean valueSet = false;
//	Thread.sleep is  used when want to sleep the thread for some specific time and it will start to execute again automatically
//	Wait() needs some thread to notify it for further execution 
//	to avoid any conflicts between threads use Synchronized
//	it is responsibility of both the threads to individually notify other thread that it can execute now
//	one thread will wait other will notify
//	*********wait() and notify() belong to object class********
	public synchronized void put(int num) {
		while(valueSet) {
			try {wait();}catch(Exception ex) {};
		}
		System.out.println("Put: "+num);
		this.num = num;
		valueSet = true;
		notify();
	}
	public synchronized void get() {
		while(!valueSet) {
			try {wait();}catch(Exception e) {};
		}
		System.out.println("Get: " +num);
		valueSet =false;
		notify();
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
			try {Thread.sleep(2000);}catch(Exception e) {};
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
