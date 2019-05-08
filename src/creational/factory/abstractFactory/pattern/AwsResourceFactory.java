package creational.factory.abstractFactory.pattern;

import creational.factory.abstractFactory.domain.Ec2Instance;
import creational.factory.abstractFactory.domain.Instance;
import creational.factory.abstractFactory.domain.S3Storage;
import creational.factory.abstractFactory.domain.Storage;
import creational.factory.abstractFactory.domain.Instance.Capacity;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capacityMib) {
		return new S3Storage(capacityMib);
	}


}
