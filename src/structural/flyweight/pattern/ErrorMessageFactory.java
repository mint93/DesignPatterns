package structural.flyweight.pattern;

import java.util.HashMap;
import java.util.Map;

//Flyweight factory. Returns shared flyweight based on key
public class ErrorMessageFactory {
	
	//This serves as key for getting flyweight instance
	public enum ErrorType {GenericSystemError, PageNotFoundError, ServerError}
	
	private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

	public static ErrorMessageFactory getInstance() {
		return FACTORY;
	}
	
	private Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();
	
	private ErrorMessageFactory() {
		errorMessages.put(ErrorType.GenericSystemError, new SystemErrorMessage("A generic error of type $error-code occured. Please refer to: \n", "http://google.com/q="));
		errorMessages.put(ErrorType.PageNotFoundError, new SystemErrorMessage("Page not found. An error of type $error-code occured. Please refer to: \n", "http://google.com/q="));
	}
	
	public SystemErrorMessage getError(ErrorType errorType) {
		return errorMessages.get(errorType);
	}
	
	public UserBannedErrorMessage getUserBannedMessage(String caseId) {
		return new UserBannedErrorMessage(caseId);
	}
}