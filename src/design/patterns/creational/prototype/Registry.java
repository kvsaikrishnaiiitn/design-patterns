package design.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<String, Item> items = new HashMap<>();

	public Registry() {
		loadItems();
	}

	public Item createItem(String type) {
		Item item = null;

		try {
			item = items.get(type).clone();
		} catch (CloneNotSupportedException cnse) {
			cnse.printStackTrace();
		}
		return item;
	}

	private void loadItems() {

		Movie movie = new Movie();
		movie.setTitle("RRR");
		movie.setPrice(350.0);
		movie.setRuntime("2:30 hours");
		items.put("Movie", movie);

		Book book = new Book();
		book.setTitle("KGF");
		book.setPrice(300.0);
		book.setNumberOfPages(100);
		items.put("Book", book);

	}

}
