package creational.factory.factoryMethod.pattern;

import creational.factory.factoryMethod.domain.Message;
import creational.factory.factoryMethod.domain.TextMessage;

public class TextMessageCreator extends MessageCreator{

	@Override
	public Message createMessage() {
		return new TextMessage();
	}

}
