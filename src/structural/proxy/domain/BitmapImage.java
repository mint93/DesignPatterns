package structural.proxy.domain;

import java.awt.Point;

//Our concrete class providing actual functionality
public class BitmapImage implements Image {
	
	private Point location;
	private String name;
	
	public BitmapImage(String filename) {
		//Loads image from file on disk
		System.out.println("Loaded from disk:"+filename);
		name = filename;
	}
	
	@Override
	public void setLocation(Point point2d) {
		location = point2d;
	}

	@Override
	public Point getLocation() {
		return location;
	}

	@Override
	public void render() {
		//renders to screen
		System.out.println("Rendered "+this.name);
	}
	
}
