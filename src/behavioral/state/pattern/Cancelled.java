package behavioral.state.pattern;

public class Cancelled implements OrderState {

	@Override
	public double handleCalcellation() {
		throw new IllegalStateException("Cancelled order. Can't cancel anymore");
	}

}
