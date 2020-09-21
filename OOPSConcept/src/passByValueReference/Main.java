package passByValueReference;

public class Main {
//	Pass by Value - All the primitive dataTypes are pass by value
//	Pass by reference - Objects are always pass by  reference
//	Reference id is stored in stack while value is stored in Heap
	static void displayPrimitive(int a) {
		System.out.println("Inside Display Primitive Method");
		a = a+5;
		System.out.println("a: "+ a);
	}
//	Pass by reference example
	static void displayArray(int[] a) {
		System.out.println("\n Inside display array method:");
		a[0]=0; a[1]=0; a[2]=0;
		for(int i=0;i<3;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
//		pass by  value
		int a=5;
		System.out.println("Before the function a: "+a);
		displayPrimitive(a);
//		A separate copy is created 
		System.out.println("After the function a :" +a);
		int arr[] = {2,2,3};
		System.out.println("Before the function");
		for(int i=0;i<3;i++) {
			System.out.print(arr[i]+ " ");
		}
//		new reference variable is created which will point to same array in Heap memory
		displayArray(arr);
		System.out.println("\n After the function");
//		Since the value of original array is changed in memory due to reference variable
		for(int i=0;i<3;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
