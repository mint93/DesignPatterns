package behavioral.visitor.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import behavioral.visitor.pattern.Visitor;

public class VicePresident extends AbstractEmployee {
	private List<Employee> directReports = new ArrayList<>();
	
	public VicePresident(String name, Employee ...employees) {
		super(name);
		Arrays.stream(employees).forEach(directReports::add);
	}
	
	@Override
	public Collection<Employee> getDirectReports() {
		return directReports;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);	
	}
}