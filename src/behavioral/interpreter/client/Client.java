package behavioral.interpreter.client;

import behavioral.interpreter.domain.Report;
import behavioral.interpreter.pattern.ExpressionBuilder;
import behavioral.interpreter.pattern.PermissionExpression;
import behavioral.interpreter.pattern.User;

public class Client {

	public static void main(String[] args) {
		Report report1  = new Report("Cashflow report", "FINANCE_ADMIN OR NOT ADMIN");
		ExpressionBuilder builder = new ExpressionBuilder();
		
		PermissionExpression exp = builder.build(report1);
		System.out.println(exp);
		
		User user1 = new User("Dave", "USER", "ADMIN");
		
		System.out.println("User access report:"+ exp.interpret(user1));
	}

}
