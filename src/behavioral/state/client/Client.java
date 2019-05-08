package behavioral.state.client;

import behavioral.state.pattern.Order;

public class Client {
	public static void main(String[] args) {
		Order order = new Order();
		
		//order.cancel();
		
		order.paymentSuccessful();
		order.dispatched();
		order.cancel();
	}
}
