package passByValueReference;

public class Main {
//	Pass by Value - All the primitive datatypes are pass by value
//	Pass by reference - Objects are always pass by  reference
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
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) {
//		pass by  value
//		int a=5;
//		System.out.println("Before the function a: "+a);
//		displayPrimitive(a);
//		System.out.println("After the function a :" +a);
		int arr[] = {2,2,3};
		System.out.println("Before the function");
		for(int i=0;i<3;i++) {
			System.out.print(arr[i]+ " ");
		}
		displayArray(arr);
		System.out.println("\n After the function");
		for(int i=0;i<3;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
