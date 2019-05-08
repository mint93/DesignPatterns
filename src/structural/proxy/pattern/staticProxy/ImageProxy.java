package structural.proxy.pattern.staticProxy;

import java.awt.Point;

import structural.proxy.domain.BitmapImage;
import structural.proxy.domain.Image;

//Proxy class.
//this is virual proxy - it will hold on with creation of object as long as possible
//in this proxy we dont create new object when constructing if (like in original object),
//but we are waiting till somebody want to render it
//even if our normal object is not instantiated,
//for the rest of methods, functionalities are provided if it is possible
//if it is not possible, object must be created (render method)
public class ImageProxy implements Image {

	private String name;
	
	private BitmapImage image;
	
	private Point location;

	//constructor of proxy object matches with the constructor of normal object
	public ImageProxy(String name) {
		this.name = name;
	}
	
	@Override
	public void setLocation(Point point2d) {
		if(image != null) {
			image.setLocation(point2d);
		} else {
			location = point2d;
		}
	}

	@Override
	public Point getLocation() {
		if(image != null) {
			return image.getLocation();
		}
		return location;
	}

	@Override
	public void render() {
		if(image == null) {
			image = new BitmapImage(name);
			if(location != null) {
				image.setLocation(location);
			}
		}
		image.render();
		
	}
		
}
