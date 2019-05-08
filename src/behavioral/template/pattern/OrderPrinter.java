package behavioral.template.pattern;

import java.io.IOException;
import java.io.PrintWriter;

import behavioral.template.domain.Order;

//Abstract base class defines the template method
public abstract class OrderPrinter {

	// base algorithm method is final, so child classes can't modify it
	public final void printOrder(Order order, String filename) throws IOException {
		try(PrintWriter writer = new PrintWriter(filename)){
			writer.println(start());
			
			writer.println(formatOrderNumber(order));
			
			writer.println(formatItems(order));
			
			writer.println(formatTotal(order));
			
			writer.println(end());
		}
	}
	
	protected abstract String start();
	
	protected abstract String formatOrderNumber(Order order);
	
	protected abstract String formatItems(Order order);
	
	protected abstract String formatTotal(Order order);
	
	protected abstract String end();
}
