package design.patterns.creational.singleton;

public class DbSingletonDemo {

	public static void main(String[] args) {
		
		DbSingleton firstInstance = DbSingleton.getInstance();
		System.out.println(firstInstance);

		DbSingleton secondInstance = DbSingleton.getInstance();
		System.out.println(secondInstance);

		if (firstInstance == secondInstance) {
			System.out.println("DbSingleton is Singleton.");
		}
	}

}
