package creational.singleton.initializationHolder;

// lazy loading without worring about synchronization
public class LazyRegistryIODH {
	
	private LazyRegistryIODH() {
		System.out.println("In LazyRegistryIODH singleton");
	}
	
	private static class RegistryHolder {
		private static final LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
	}
	
	public static LazyRegistryIODH getInstance() {
		// in this method we make the first reference to RegistryHolder class, so only then our static INSTANCE is initialized, so because of that, this is lazy initialization
		return RegistryHolder.INSTANCE;
	}
	
}
