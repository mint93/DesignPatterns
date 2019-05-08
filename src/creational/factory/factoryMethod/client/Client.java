package creational.factory.factoryMethod.client;

import creational.factory.factoryMethod.domain.Message;
import creational.factory.factoryMethod.pattern.JSONMessageCreator;
import creational.factory.factoryMethod.pattern.MessageCreator;
import creational.factory.factoryMethod.pattern.TextMessageCreator;

public class Client {

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
		printMessage(new TextMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		Message message = creator.getMessage();
		System.out.println(message);
	}
}
