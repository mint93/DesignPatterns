package behavioral.template.client;

import java.io.IOException;

import behavioral.template.domain.Order;
import behavioral.template.pattern.HtmlPrinter;
import behavioral.template.pattern.OrderPrinter;

public class Client {

	public static void main(String[] args) throws IOException {
		Order order = new Order("1001");
		
		order.addItem("Soda", 2.50);
		order.addItem("Sandwitch", 11.95);
		order.addItem("Pizza", 15.95);
		
		OrderPrinter printer = new HtmlPrinter();
		printer.printOrder(order, "1001.html");
	}
}