
public class Main {
	public static void main(String[] args) {
		SingletonClass x = SingletonClass.getInstance();
		SingletonClass y = SingletonClass.getInstance();
		SingletonClass z = SingletonClass.getInstance();
		x.s = (x.s).toUpperCase();
		System.out.println("String from x is: "+x.s );
		System.out.println("String from y is: "+y.s );
		System.out.println("String from z is: "+z.s );

		
		Singleton tmp = Singleton.getInstance();
		tmp.demoMethod();
	}

}
