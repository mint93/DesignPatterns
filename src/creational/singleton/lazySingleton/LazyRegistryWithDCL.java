package creational.singleton.lazySingleton;

public class LazyRegistryWithDCL {	// DCL - double check locking

	private LazyRegistryWithDCL() {}
	
	// when multiple threads are refering to a variable, then threads will cache the value of this variable. To overcome that we have keyword volatile
	private static volatile LazyRegistryWithDCL INSTANCE;
	
	public static LazyRegistryWithDCL getInstance() {
		if(INSTANCE == null) {
			synchronized (LazyRegistryWithDCL.class) {
				if(INSTANCE == null) {
				//it may happen that: 2 threads will call getInstance() method and they will both see that instance is null, and when they hit synchronization block, and one thread will get the lock and will start executing the code inside this block. The second thread is going to wait in this synchronized line to free lock. So when lock will be free and we don't double check for null, we will have 2 object instances of singleton.
					INSTANCE = new LazyRegistryWithDCL();
				}
			}
		}
		return INSTANCE;
	}
	
}
