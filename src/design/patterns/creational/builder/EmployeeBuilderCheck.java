package design.patterns.creational.builder;

public class EmployeeBuilderCheck {

	public static void main(String[] args) {

		EmployeeBuilder employee = new EmployeeBuilder.Builder().id(100L).name("Cms").salary(10000L).build();

		System.out.println("EmployeeBuilderCheck.enclosing_method()...employee:" + employee);
	}

}
