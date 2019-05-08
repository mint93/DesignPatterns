package structural.facade.domain.mailer;

import structural.facade.domain.email.Email;

public class Mailer {

	private static final Mailer MAILER = new Mailer();
	
	public static Mailer getMailer() {
		return MAILER;
	}
	
	private Mailer() {
		
	}
	
	public boolean send(Email email) {
		return true;
	}; 
	
}
