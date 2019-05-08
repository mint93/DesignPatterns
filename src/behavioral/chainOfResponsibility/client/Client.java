package behavioral.chainOfResponsibility.client;

import java.time.LocalDate;

import behavioral.chainOfResponsibility.domain.LeaveApplication;
import behavioral.chainOfResponsibility.domain.LeaveApplication.Type;
import behavioral.chainOfResponsibility.pattern.Director;
import behavioral.chainOfResponsibility.pattern.LeaveApprover;
import behavioral.chainOfResponsibility.pattern.Manager;
import behavioral.chainOfResponsibility.pattern.ProjectLead;


public class Client {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
	    LeaveApplication application = LeaveApplication.getBuilder()
			   							.withType(Type.Sick)
			   							.from(currentDate)
			   							.to(currentDate.plusDays(10))
			   							.build();
	    System.out.println(application);
	    System.out.println("**************************************************");
	    LeaveApprover approver = createChain();
	    approver.processLeaveApplication(application);
	    System.out.println(application);
	    
	    System.out.println("\n--------------------------------------------------\n");
	    
	    LeaveApplication application2 = LeaveApplication.getBuilder()
			   							.withType(Type.PTO)
			   							.from(currentDate)
			   							.to(currentDate.plusDays(14))
			   							.build();
	    System.out.println(application2);
	    System.out.println("**************************************************");
	    approver.processLeaveApplication(application2);
	    System.out.println(application2);
	}

	private static LeaveApprover createChain() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead lead = new ProjectLead(manager);
		return lead;
	}
	
}
