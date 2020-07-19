package Basics;
import java.util.Scanner;

public class PrintfStringSpace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
              String s1=sc.next();
              int x=sc.nextInt();
              String s2=sc.next();
              int x2=sc.nextInt();
              String s3=sc.next();
              int x3=sc.nextInt();
		
		  System.out.printf("%-15s %d%n", s1, x);
		  System.out.printf("%-15s %d%n", s2, x2);
		  System.out.printf("%-15s %d%n", s3, x3);
		  
	}
}
