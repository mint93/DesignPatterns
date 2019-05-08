package behavioral.state.pattern;

public class InTransit implements OrderState{

	@Override
	public double handleCalcellation() {
		System.out.println("Contacting courier service for cancellation");
		System.out.println("Contacting payment gateway for transation rollback");
		return 20;
	}

}
