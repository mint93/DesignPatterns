package behavioral.nullObject.pattern;

import behavioral.nullObject.domain.Report;
import behavioral.nullObject.domain.StorageService;

public class NullStorageService extends StorageService {

	@Override
	public void save(Report report) {
		System.out.println("Null object save method. Doing nothing");
	}

	
}
