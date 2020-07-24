package exceptionHandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		System.out.println(100/2);
//		System.out.println(100/0);
		try {
		      int[] myNumbers = {1, 2, 10,3};
		      System.out.println(myNumbers[10]);
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");
		    } finally {
		      System.out.println("The 'try catch' is finished.");
		    }
	}

}
