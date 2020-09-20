package multithreading;
class Counter{
	int count;

//	only one thread can access a synchronized 
//	If we don't use synchronized keyword method is not thread safe i.e. multiple threads can access it at the same time 
	public synchronized void increment() {
		count++; 
	}
}

public class SynchronizationThread {
	public static void main(String[] args) throws Exception{
		Counter c = new Counter();
		Thread t1 = new Thread(new Runnable() 
		{
			public void run() {
				for(int i=1;i<=1000;i++)
				{
					c.increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() 
		{
			public void run() {
				for(int i=1;i<=1000;i++) 
				{
					c.increment();
				}
			}
		});
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Count: "+ c.count);	
	}
}
