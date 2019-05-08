package structural.adapter.client;

import structural.adapter.domain.BusinessCardDesigner;
import structural.adapter.domain.Employee;
import structural.adapter.pattern.classAdapter.EmployeeClassAdapter;
import structural.adapter.pattern.objectAdapter.EmployeeObjectAdapter;

public class Client {

	public static void main(String[] args) {
		BusinessCardDesigner designer = new BusinessCardDesigner();
		String card = "";
		
		/** Using Class/Two-way adapter **/ 
		EmployeeClassAdapter classAdapter = new EmployeeClassAdapter();
		populateEmployeeData(classAdapter);	// That's why it is called two-way adapter, because we are using adapter as a adapter and as a Emloyee (adaptee) in this example
		card = designer.designCard(classAdapter);
		System.out.println(card);
		
		
		System.out.println("-------------------------------------------------------");
		/** Using Object Adapter **/
		Employee employee = new Employee();
		populateEmployeeData(employee);
		EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
		card = designer.designCard(objectAdapter);
		System.out.println(card);
	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
