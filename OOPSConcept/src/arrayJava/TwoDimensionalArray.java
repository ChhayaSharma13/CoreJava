package arrayJava;

public class TwoDimensionalArray {
	static int[][] a = {{10,20,30},{1,2}};
	public static void displayarray() {
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
	}
	public static void main(String[] args) {
		System.out.println(a[1][1]);
		System.out.println(a[0].length);
		System.out.println(a.length);
		displayarray();
	}

}
