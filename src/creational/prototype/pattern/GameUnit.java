package creational.prototype.pattern;



/**
 * This class represents an abstract prototype & defines the clone method
 */
public abstract class GameUnit implements Cloneable{
	
	private int position;
	
	public GameUnit() {
		position = 0;
	}
	
	public GameUnit(int position) {
		this.position = position;
	}
	
	// when ovveriding visibility can be changed , but only increased, and return type can be changed, but only for more specific
	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		// shallow copy
		GameUnit unit = (GameUnit) super.clone();
		unit.initiallize();
		return unit;
	}
	
	protected void initiallize() {
		this.position = 0;
		reset();
	}
	
	protected abstract void reset();

	public void move(int distance) {
		position = position + distance;
	}
	
	public int getPosition() {
		return position;
	}
}
