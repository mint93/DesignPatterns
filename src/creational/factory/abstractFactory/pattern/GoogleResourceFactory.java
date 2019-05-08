package creational.factory.abstractFactory.pattern;

import creational.factory.abstractFactory.domain.GoogleCloudStorage;
import creational.factory.abstractFactory.domain.GoogleComputeEngineInstance;
import creational.factory.abstractFactory.domain.Instance;
import creational.factory.abstractFactory.domain.Storage;
import creational.factory.abstractFactory.domain.Instance.Capacity;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capacityMib) {
		return new GoogleCloudStorage(capacityMib);
	}


}
