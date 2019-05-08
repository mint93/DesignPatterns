package creational.singleton;

import creational.singleton.eagerSingleton.EagerRegistry;
import creational.singleton.initializationHolder.LazyRegistryIODH;
import creational.singleton.lazySingleton.LazyRegistryWithDCL;

public class Client {

	public static void main(String[] args) {
		EagerRegistry registry = EagerRegistry.getInstance();
		EagerRegistry registry2 = EagerRegistry.getInstance();
		System.out.println(registry == registry2);	//true, if both references point to the same object
		
		LazyRegistryWithDCL lazyRegistry = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL lazyRegistry2 = LazyRegistryWithDCL.getInstance();
		System.out.println(lazyRegistry == lazyRegistry2);
		
		LazyRegistryIODH lazyRegistyIODH = LazyRegistryIODH.getInstance();
		LazyRegistryIODH lazyRegistyIODH2 = LazyRegistryIODH.getInstance();
		System.out.println(lazyRegistyIODH == lazyRegistyIODH2);
	}

}
