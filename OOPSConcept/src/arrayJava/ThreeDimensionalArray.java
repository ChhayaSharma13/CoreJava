package arrayJava;

public class ThreeDimensionalArray {
	static int[][][] a = {{{3},{4},{6},{67},{89},{56}},{{34},{45}}};
	public static void displayArray() {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println(a[i][j][k]);
				}
			}
		}
	}
	public static void main(String[] args) {
		displayArray();

	}

}
