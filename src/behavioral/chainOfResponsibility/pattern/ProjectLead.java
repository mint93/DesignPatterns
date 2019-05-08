package behavioral.chainOfResponsibility.pattern;

import behavioral.chainOfResponsibility.domain.LeaveApplication;

//A concrete handler
public class ProjectLead extends Employee{

	public ProjectLead(LeaveApprover nextApprover) {
		super("Project Lead", nextApprover);
	}
	
	@Override
	protected boolean processRequest(LeaveApplication application) {
		//type is sick leave & duration is less than or equal to 2 days
		if(application.getType() == LeaveApplication.Type.Sick
				&& application.getNoOfDays() <= 2) {
			application.approve(getApproverRole());
				return true;
		}
		return false;
	}

	
	
}
