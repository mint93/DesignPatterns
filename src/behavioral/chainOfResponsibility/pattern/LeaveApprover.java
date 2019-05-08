package behavioral.chainOfResponsibility.pattern;

import behavioral.chainOfResponsibility.domain.LeaveApplication;

//This represents a handler in chain of responsibility
public interface LeaveApprover {

	void processLeaveApplication(LeaveApplication application);
	
	String getApproverRole();
}
