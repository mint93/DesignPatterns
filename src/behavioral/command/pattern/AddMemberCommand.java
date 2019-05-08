package behavioral.command.pattern;

//A Concrete implementation of Command.
public class AddMemberCommand implements Command{
	
	// arguments of addMemeber() method of receiver
	private String emailAddress;
	private String listName;
	
	// receiver
	private EWSService receiver;
	
	public AddMemberCommand(String email, String listName, EWSService service) {
		this.emailAddress = email;
		this.listName = listName;
		this.receiver = service;
	}
	
	@Override
	public void execute() {
		receiver.addMember(emailAddress, listName);
	}

}
