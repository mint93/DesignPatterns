package structural.composite.pattern;

//The component base class for composite pattern
//defines operations applicable both leaf & composite 
public abstract class File {

	private String name;

	public File(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void ls();
	
	//These 3 methods are only applicable for composite, not for leaf
	//You can remove these methods from File (component class) and move it directly to Directory (composite class)
	public abstract void addFile(File file);

	public abstract File[] getFiles();
	
	public abstract boolean removeFile(File file);
}
