package creational.objectPool.pattern;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ObjectPool<T extends Poolable> {

	private BlockingQueue<T> availablePool;
	
	public ObjectPool(Supplier<T> creator, int count) {
		availablePool = new LinkedBlockingQueue<>();
		IntStream.range(0, count).forEach(i -> availablePool.offer(creator.get()));
	}
	
	public T get() {
		try {
			return availablePool.take();
		} catch(InterruptedException e) {
			System.out.println("take() was interrupted");
		}
		return null;
	}
	
	public void release(T object) {
		object.reset();
		try {
			availablePool.put(object);
		} catch (InterruptedException e) {
			System.out.println("put() was interrupted");
		}
	}
	
}