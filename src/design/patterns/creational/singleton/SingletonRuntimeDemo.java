package design.patterns.creational.singleton;

public class SingletonRuntimeDemo {

	public static void main(String[] args) {

		Runtime firstRuntime = Runtime.getRuntime();
		System.out.println(firstRuntime);
		firstRuntime.gc();

		Runtime secondRuntime = Runtime.getRuntime();
		System.out.println(secondRuntime);
		secondRuntime.gc();

		if (firstRuntime == secondRuntime) {
			System.out.println("Runtime is Singleton.");
		}

	}

}
