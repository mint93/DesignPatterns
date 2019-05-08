package structural.proxy.domain;

import java.awt.Point;

//Interface implemented by proxy and concrete objects
public interface Image {

	void setLocation(Point point2d);
	
	Point getLocation();
	
	void render();
	
}
