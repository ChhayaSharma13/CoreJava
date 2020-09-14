package collectionJava;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("Java");
		v.add(1);
		v.add("Java");
		v.add(1);v.add("Java");
		v.add(1);v.add("Java");
		v.add(1);v.add("Java");
		v.add(1);v.add("Java");
		v.add(1);v.add("Java");
		v.add(1);v.add("Java");
		v.add(1);v.add("Java");
		v.add(1);v.add("Java");
		v.add(1);
		Iterator i = v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next()+ " ");
		}
		System.out.println();
				
	}
}
