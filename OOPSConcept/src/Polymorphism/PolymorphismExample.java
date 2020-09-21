package Polymorphism;

public class PolymorphismExample {
	void add(int x,int  y) {
		System.out.println("Addition is: "+ (x+y));
	}
	void add(int x, int y, int z) {
		System.out.println("Addition is: "+ (x+y+z));
	}
	public static void main(String[] args) {
		PolymorphismExample obj1 = new PolymorphismExample();
		obj1.add(20, 89);
		obj1.add(2, 4,5);
	}
}
