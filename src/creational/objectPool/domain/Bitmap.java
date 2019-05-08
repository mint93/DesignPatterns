package creational.objectPool.domain;

import java.awt.Point;

//concrete reusable
public class Bitmap implements Image {

    private Point location;

    private String name;

    public Bitmap(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing "+name+" @ "+location);
    }

    @Override
    public Point getLocation() {
        return location;
    }

    @Override
    public void setLocation(Point location) {
        this.location = location;
    }

	@Override
	public void reset() {
		location = null;
		System.out.println("Bitmap is reset");
	}

}
