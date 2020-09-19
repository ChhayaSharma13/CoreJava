package multithreading;
class Hey implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Hey");
		}
	}	
}
class  Namaste implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Namaste");
		}
	}	
}
public class ThreadRunnableInterface{
	public static void main(String[] args) {
		
	}
}
