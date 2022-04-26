package design.patterns.creational.prototype;

import java.util.List;

public class Statement implements Cloneable {

	private String sql;
	private List<String> parameters;
	private Record record;

	public Statement(String sql, List<String> parameters, Record record) {
		super();
		this.sql = sql;
		this.parameters = parameters;
		this.record = record;
	}

	@Override
	protected Statement clone() throws CloneNotSupportedException {
		return (Statement) super.clone();
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public List<String> getParameters() {
		return parameters;
	}

	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

	@Override
	public String toString() {
		return "Statement [sql=" + sql + ", parameters=" + parameters + ", record=" + record + "]";
	}

}
