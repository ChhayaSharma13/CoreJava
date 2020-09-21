package passByValueReference;

public class Main {
//	Pass by Value - All the primitive datatypes are pass by value
//	Pass by reference - Objects are always pass by  reference
	static void displayPrimitive(int a) {
		System.out.println("Inside Display Primitive Method");
		a = a+5;
		System.out.println("a: "+ a);
	}
	public static void main(String[] args) {
		int a=5;
		System.out.println("Before the function a: "+a);
		displayPrimitive(a);
		System.out.println("After the function a :" +a);
		
	}

}
