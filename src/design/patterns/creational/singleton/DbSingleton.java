package design.patterns.creational.singleton;

public class DbSingleton {

	// Eager loading
	// private static DbSingleton instance = new DbSingleton();

	// Lazy loading
	private static volatile DbSingleton instance = null;

	// Protection from Reflection API
	private DbSingleton() {
		if (instance != null) {
			throw new RuntimeException("Use getInstance() to get instance.");
		}
	}

	public static DbSingleton getInstance() {
		// Lazy loading
		if (instance == null) {
			// Thread safe
			synchronized (DbSingleton.class) {
				if (instance == null) {
					instance = new DbSingleton();
				}
			}
		}
		return instance;
	}

}
