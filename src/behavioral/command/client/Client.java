package behavioral.command.client;

import behavioral.command.pattern.AddMemberCommand;
import behavioral.command.pattern.Command;
import behavioral.command.pattern.EWSService;
import behavioral.command.pattern.MailTasksRunner;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		EWSService service = new EWSService();
		
		Command c1 = new AddMemberCommand("spam1@email.com", "spam", service);
		MailTasksRunner.getInstance().addCommand(c1);
		
		Command c2 = new AddMemberCommand("spam2@email.com", "spam", service);
		MailTasksRunner.getInstance().addCommand(c2);
		
		Thread.sleep(3000);
		MailTasksRunner.getInstance().shutdown();
	}

}
