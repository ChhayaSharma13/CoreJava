package Basics;
public class InnerClassDemo {
		int value1 = 10;
	 class Inner{
		int value2 = 3;
		public int InnerMethod() {
			return value1+10;
		}
	}
	 static class InnerStatic{
		 int value3 =30;
	 }
	public static void main(String[] args) {
		InnerClassDemo inc = new InnerClassDemo();
		System.out.println(inc.value1);
		
		InnerClassDemo.Inner inn = inc.new Inner();
		System.out.println(inn.value2);
		System.out.println("Inner method "+inn.InnerMethod());
		
//		for static inner class there is no need to use outer 
//		class object to create object of inner class
		InnerClassDemo.InnerStatic ins = new InnerClassDemo.InnerStatic();
		System.out.println(ins.value3);
	}

}
