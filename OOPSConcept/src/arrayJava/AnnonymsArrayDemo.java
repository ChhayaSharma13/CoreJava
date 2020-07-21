package arrayJava;

public class AnnonymsArrayDemo {
	public static int sum(int[][] a) {
		int total = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				total = total + a[i][j];
			}
		}
		return total;
	}
	public static void main(String[] args) {
		System.out.println(sum(new int[][] {{2,4,0},{2, 3,4,5}}));

	}

}
