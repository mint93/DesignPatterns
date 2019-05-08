package behavioral.chainOfResponsibility.pattern;
//A concrete handler

import behavioral.chainOfResponsibility.domain.LeaveApplication;

public class Manager extends Employee {

	public Manager(LeaveApprover nextApprover) {
		super("Manager", nextApprover);
	}
	
	@Override
	protected boolean processRequest(LeaveApplication application) {
		switch (application.getType()) {
		case Sick:
			application.approve(getApproverRole());
			return true;
		case PTO:
			if(application.getNoOfDays() <= 5) {
				application.approve(getApproverRole());
				return true;
			}
		}
		return false;
	}
	
}