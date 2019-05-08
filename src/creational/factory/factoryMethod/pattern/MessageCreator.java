package creational.factory.factoryMethod.pattern;

import creational.factory.factoryMethod.domain.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

	public Message getMessage() {
		Message message = createMessage();
		message.addDefaultHeaders();
		message.encrypt();
		
		return message;
	}
	
	protected abstract Message createMessage();
	
}
