package behavioral.strategy.pattern;

import java.util.LinkedList;

import behavioral.strategy.domain.Order;

//Context 
public class PrintService {

	private OrderPrinter printer;
	
    public PrintService(OrderPrinter printer) {
    	this.printer = printer;
    }

    public void printOrders(LinkedList<Order> orders) {
        printer.print(orders);
    }
}
