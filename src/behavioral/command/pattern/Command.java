package behavioral.command.pattern;

//Interface implemented by all concrete command classes
public interface Command {
	// this method doesn't take any arguments, all needed informations
	// will be given to concrete command classes
	void execute();
	
}
