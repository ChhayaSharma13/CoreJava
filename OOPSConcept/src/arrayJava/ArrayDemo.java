package arrayJava;

public class ArrayDemo {
	static int[] a = new int[10];
	
	
	public static void displayArray() {
		for(int i=1; i<= a.length;i++) {
			System.out.print(a[i-1]+ " ");
		}
	}
	public static void forEachDisplay() {
		System.out.println("\nArray by ForEach :");
		for(int i:a) {
			System.out.print(i +" ");
		}
	}
	public static void whileLoop() {
		System.out.println("\nWhile Loop for Array Display: ");
		int i=0;
		while( i<a.length) {
			System.out.print(a[i]+ " ");
			i++;
		}
	}
	public static void doWhile() {
		System.out.println("\nDo while loop");
		int i=0;
		do {
			System.out.print(a[i]+" ");
			i++;
		}while(i<a.length);
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
		forEachDisplay();
		whileLoop();
		doWhile();
	}

}
