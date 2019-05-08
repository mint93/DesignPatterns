package behavioral.visitor.pattern;

import behavioral.visitor.domain.Manager;
import behavioral.visitor.domain.Programmer;
import behavioral.visitor.domain.ProjectLead;
import behavioral.visitor.domain.VicePresident;

public interface Visitor {
	void visit(Programmer programmer);
	void visit(Manager manager);
	void visit(ProjectLead projectLead);
	void visit(VicePresident vicePresident);
}
