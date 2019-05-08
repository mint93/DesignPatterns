package behavioral.strategy.pattern;

import java.util.Collection;

import behavioral.strategy.domain.Order;

//Strategy
public interface OrderPrinter {
	
	void print(Collection<Order> orders);
}
