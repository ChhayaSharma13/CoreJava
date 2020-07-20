package arrayJava;

public class ArrayDemo {
	static int[] a = new int[10];
	
	
	public static void displayArray() {
		for(int i=1; i<= a.length;i++) {
			System.out.println(a[i-1]);
		}
	}
	public static void main(String[] args) {
		int[] b = new int[] {1,2,5};
		for(int i=1;i<=b.length;i++) {
			System.out.println(b[i-1]);
		}
		for(int i=1; i<= a.length;i++) {
			a[i-1] = 2 *(i);
		}	
		displayArray();
		
	}

}
