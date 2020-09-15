
public class SingletonClass {
//	static variable single_instance of type singleton
	 private static SingletonClass single_instance = null;
	 public String s;
	 private SingletonClass() {
		 s = "Hello I am a aprt of Singleton Class";
	 }
//	 static method  to create instance of Singleton

	 public static SingletonClass getInstance() {
		 if (single_instance == null) {
			 single_instance = new SingletonClass();
			
		 } return single_instance;
	 }
}
