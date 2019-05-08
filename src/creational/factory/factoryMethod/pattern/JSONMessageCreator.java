package creational.factory.factoryMethod.pattern;

import creational.factory.factoryMethod.domain.JSONMessage;
import creational.factory.factoryMethod.domain.Message;

public class JSONMessageCreator extends MessageCreator{

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

}
