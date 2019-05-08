package creational.factory.abstractFactory.pattern;

import creational.factory.abstractFactory.domain.Instance;
import creational.factory.abstractFactory.domain.Storage;

//Abstract factory with methods defined for each object type.
public interface ResourceFactory {
	Instance createInstance(Instance.Capacity capacity);
	
	Storage createStorage(int capacityMib);
}
