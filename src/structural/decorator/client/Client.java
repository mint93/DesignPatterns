package structural.decorator.client;

import structural.decorator.domain.Message;
import structural.decorator.domain.TextMessage;
import structural.decorator.pattern.Base64EncodedMessage;
import structural.decorator.pattern.HtmlEncodedMessage;

public class Client {

	public static void main(String[] args) {
		Message m = new TextMessage("The <FORCE> is strong with this one!");
		System.out.println(m.getContent());

		Message decorator = new HtmlEncodedMessage(m);
		System.out.println(decorator.getContent());
		
		decorator = new Base64EncodedMessage(decorator);
		System.out.println(decorator.getContent());
	}
}
