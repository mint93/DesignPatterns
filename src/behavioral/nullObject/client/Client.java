package behavioral.nullObject.client;

import behavioral.nullObject.domain.ComplexService;
import behavioral.nullObject.pattern.NullStorageService;

public class Client {

	public static void main(String[] args) {
		ComplexService service = new ComplexService("Simple report 2",new NullStorageService());
		service.generateReport();
	}

}
