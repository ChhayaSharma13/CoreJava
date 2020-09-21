package Polymorphism;

class SuperClass{
	void showClass() {
		System.out.println("Super class");
	}
}

public class BaseClass extends SuperClass {

	@Override
	void showClass() {
		System.out.println("Base Class");
	}
	
	public static void main(String[] args) {
		BaseClass obj = new BaseClass();
		obj.showClass();
		SuperClass obj1 = new SuperClass();
		obj1.showClass();
//		SuperClass obj2 = new BaseClass();
		 obj1 = new BaseClass();
		obj.showClass();
	}
}

