package collectionJava;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		//Default vector size increases by 10 but if want to changes size to sth. else we can specify vector(size) 
//		we can also use vector(size, incr) size is initial size and incr will increase it by incr each time vector is resize upwards
//		vector(collection c) is used to pass collection as an argument
		Vector v = new Vector(8,5);
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
		v.add(10, "C++");
		Iterator i = v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next()+ " ");
		}
		System.out.println();
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(1);
		v1.add((int) 2.3);
		Iterator<Integer> i1 = v1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next()+" ");
		}
		
//		If increment is specified, vector will expand to it in each allocation cycle but if not vecator's capacity gets doubled in each allocation cycle.
		
//		Vector defined three protected data member:
//		int capacityIncrement:  contains increment value
//		int elementCount: number of elements currently in vector stored in it.
//		object elementData[]: Array that holds the vector  in it.
		
		}
}
