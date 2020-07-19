package Basics;


public class InheritanceJava {
	int age=22;
	String name =  "Chhaya";
	String profession = "Software Engineer";
	protected String displayAddress() {
		return "Kamothe, Mumbai";
	}
}
class Child extends InheritanceJava{
	String sex = "Female";
	//overriding parent class method
	protected String displayAddress() {
		return "Athlone";
	}
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.age);
		System.out.println(c.name);
		System.out.println(c.profession);
		System.out.println(c.sex);
		System.out.println(c.displayAddress());
	}
}
