package behavioral.state.pattern;

public class New implements OrderState{

	@Override
	public double handleCalcellation() {
		System.out.println("It's a new Order. No processing done");
		return 0;
	}

}
