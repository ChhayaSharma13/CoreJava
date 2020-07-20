package arrayJava;

public class ArrayDemo {
	static int[] a = new int[10];
	int[] b = new int[10];
	
	public static void displayArray() {
		for(int i=1; i< a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
	
		for(int i=1; i< a.length;i++) {
			a[i] = 2 *(i);
		}	
		displayArray();
		
	}

}
