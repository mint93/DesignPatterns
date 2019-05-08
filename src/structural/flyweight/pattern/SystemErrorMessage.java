package structural.flyweight.pattern;

//A concrete Flyweight. Instance is shared
public class SystemErrorMessage implements ErrorMessage {

	// intrinsic state - shared
	private String messageTemplate;	// some error message $error-code
	private String helpUrlBase;	// http://somedomain.com/help?error=
	
	public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
		this.messageTemplate = messageTemplate;
		this.helpUrlBase = helpUrlBase;
	}

	@Override
	public String getText(String code) {
		return messageTemplate.replace("$error-code", code) + helpUrlBase + code; 
	}


}
