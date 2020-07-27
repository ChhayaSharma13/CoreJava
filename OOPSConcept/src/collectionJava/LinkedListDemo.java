package collectionJava;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("BMW");
		cars.add("AUDI");
		cars.add("Mercedes");
		cars.add("Ford");
		System.out.println(cars);
		System.out.println(cars.get(0));
		cars.set(1, "Ferrari");
		System.out.println(cars);
//		cars.remove();
//		cars.clear();
		System.out.println(cars);
		for(int i=0; i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
	}

}
