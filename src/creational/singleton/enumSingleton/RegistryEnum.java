package creational.singleton.enumSingleton;

// advantages in case of enum pattern:
// - we can't extend from enum
// - you can't create objects of enum
// - enum handles serialization/deserialization issues (when you serialize enum class and then deserialize, it will create second object of singleton)
public enum RegistryEnum {
	INSTANCE;
	
	public void getConfiguration() {
		
	}
}
