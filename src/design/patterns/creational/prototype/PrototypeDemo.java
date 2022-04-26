package design.patterns.creational.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		Registry registry = new Registry();

		Movie firstMovie = (Movie) registry.createItem("Movie");
		firstMovie.setTitle("first movie");
		System.out.println(firstMovie);
		System.out.println(firstMovie.getPrice());
		System.out.println(firstMovie.getRuntime());
		System.out.println(firstMovie.getTitle());

		Movie secondMovie = (Movie) registry.createItem("Movie");
		secondMovie.setTitle("second movie");
		System.out.println(secondMovie);
		System.out.println(secondMovie.getPrice());
		System.out.println(secondMovie.getRuntime());
		System.out.println(secondMovie.getTitle());

	}

}
