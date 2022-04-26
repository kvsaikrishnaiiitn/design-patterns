package design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeStatementDemo {

	public static void main(String[] args) {
		String sql = "select * from movies where title = ?";
		
		List<String> parameters = new ArrayList<>();
		parameters.add("RRR");
		
		Record record = new Record();
		
		Statement firstStatement = new Statement(sql, parameters, record);
		System.out.println(firstStatement);
		
		Statement secondStatement = new Statement(sql, parameters, record);
		System.out.println(secondStatement);
		
	}

}
