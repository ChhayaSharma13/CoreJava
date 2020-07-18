package Basics;
public class VariableScope {
	String value = "Hello";
	static String value2 = "World";
	public void Hello() {
		String value = "inside my function";
		System.out.println(value);
	}
	public static void main(String[] args) {
		VariableScope v1 = new VariableScope();
		VariableScope v2 = new VariableScope();
		System.out.println(v1.value);
		System.out.println(v2.value);
		System.out.println(v1.value2);
		System.out.println(v2.value2);
		v1.Hello();
		v1.value = "Hello, I want to change the String value";
		v1.value2 = "Hello, I want to change the String value";
		System.out.println(v1.value);
		System.out.println(v2.value);
		System.out.println(v1.value2);
		System.out.println(v2.value2);
	}

}
