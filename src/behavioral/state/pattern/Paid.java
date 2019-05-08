package behavioral.state.pattern;

public class Paid implements OrderState{

	@Override
	public double handleCalcellation() {
		System.out.println("Contacting payment gateway to rollback transaction");
		return 10;
	}

}
