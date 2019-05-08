package behavioral.interpreter.pattern;

//Abstract expression
public interface PermissionExpression {

	// the final result will indicate whether the user can read report or not
	boolean interpret(User user);

}
