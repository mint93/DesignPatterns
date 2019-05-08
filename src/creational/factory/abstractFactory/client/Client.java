package creational.factory.abstractFactory.client;

import creational.factory.abstractFactory.domain.Instance;
import creational.factory.abstractFactory.domain.Storage;
import creational.factory.abstractFactory.domain.Instance.Capacity;
import creational.factory.abstractFactory.pattern.AwsResourceFactory;
import creational.factory.abstractFactory.pattern.GoogleResourceFactory;
import creational.factory.abstractFactory.pattern.ResourceFactory;

public class Client {
	
	private ResourceFactory factory;
	
	public Client(ResourceFactory factory) {
		this.factory = factory;
	}

	public Instance createServer(Instance.Capacity capacity, int storageMib) {
		Instance instance = factory.createInstance(capacity);
		Storage storage = factory.createStorage(storageMib);
		instance.attachStorage(storage);
		return instance;
	}
	
	public static void main(String[] args) {
		Client aws = new Client(new AwsResourceFactory());
		Instance i1 = aws.createServer(Capacity.micro, 20480);
		i1.start();
		i1.stop();
		
		System.out.println("-----------------------------------------");
		
		Client google = new Client(new GoogleResourceFactory());
		i1 = google.createServer(Capacity.micro, 20480);
		i1.start();
		i1.stop();
	}

}
