package multithreading;
class Hey implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Hey");
			try {Thread.sleep(1000);}catch(Exception ex) {};
		}
	}	
}
class  Namaste implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Namaste");
			try {Thread.sleep(1000);}catch(Exception ex) {};
		}
	}	
}
public class ThreadRunnableInterface{
	public static void main(String[] args) {
		Runnable h1 = new Hey();
		Runnable n = new Namaste();
//		Provide objects of Runnable as argument to object of Thread
		Thread t1 = new Thread(h1);
		Thread t2 = new Thread(n);
		
		t1.start();
		try {Thread.sleep(10);}catch(Exception ex) {};
		t2.start();
	}
}
