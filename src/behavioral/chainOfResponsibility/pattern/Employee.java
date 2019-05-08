package behavioral.chainOfResponsibility.pattern;

import behavioral.chainOfResponsibility.domain.LeaveApplication;

//Abstract handler
public abstract class Employee implements LeaveApprover{

	private String role;
	
	private LeaveApprover successor;
	
	public Employee(String role, LeaveApprover successor) {
		this.role = role;
		this.successor = successor;
	}
	
	@Override
	public void processLeaveApplication(LeaveApplication application) {
		// In chain of resposibility pattern we can chose if we want to
		// chain the request only if current handler can't process it (like in this example),
		// or we can chain the request implicitly (for example servlet filters)
		if(!processRequest(application) && successor != null) {
			successor.processLeaveApplication(application);
		}
	}

	protected abstract boolean processRequest(LeaveApplication application);
	
	@Override
	public String getApproverRole() {
		return role;
	}

	
}