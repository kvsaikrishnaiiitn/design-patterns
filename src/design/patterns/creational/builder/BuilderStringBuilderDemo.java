package design.patterns.creational.builder;

public class BuilderStringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("This is the first line.");
		stringBuilder.append(" This is the second line.");
		stringBuilder.append(" This is the third line.");
		stringBuilder.append(4);

		System.out.println(stringBuilder.toString());
	}

}
