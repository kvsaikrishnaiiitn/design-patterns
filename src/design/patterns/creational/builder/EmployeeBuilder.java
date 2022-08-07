package design.patterns.creational.builder;

public class EmployeeBuilder {

	public EmployeeBuilder(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.salary = builder.salary;
		this.department = builder.department;
	}

	private Long id;
	private String name;
	private Long salary;
	private String department;

	public static class Builder {
		private Long id;
		private String name;
		private Long salary;
		private String department;

		public Builder() {
		}

		public Builder id(Long id) {
			this.id = id;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder salary(Long salary) {
			this.salary = salary;
			return this;
		}

		public Builder department(String department) {
			this.department = department;
			return this;
		}

		public EmployeeBuilder build() {
			return new EmployeeBuilder(this);
		}
	}

	@Override
	public String toString() {
		return "EmployeeBuilder [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ "]";
	}
}
