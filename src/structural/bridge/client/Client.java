package structural.bridge.client;

import structural.bridge.pattern.abstraction.FifoCollection;
import structural.bridge.pattern.abstraction.Queue;
import structural.bridge.pattern.implementor.SinglyLinkedList;

public class Client {

	public static void main(String[] args) {
		FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());
		collection.offer(10);
		collection.offer(40);
		collection.offer(99);
		
		System.out.println(collection.poll());
		System.out.println(collection.poll());
		System.out.println(collection.poll());
		System.out.println(collection.poll());		
	}

}
