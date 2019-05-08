package behavioral.visitor.domain;

import java.util.Collection;

import behavioral.visitor.pattern.Visitor;

public interface Employee {

	int getPerformanceRating();
	
	void setPerformanceRating(int rating);
	
	Collection<Employee> getDirectReports();
	
	int getEmployeeId();
	
	void accept(Visitor visitor);
	
}
