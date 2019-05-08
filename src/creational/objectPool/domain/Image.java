package creational.objectPool.domain;

import java.awt.Point;

import creational.objectPool.pattern.Poolable;

//Represents our abstract reusable
public interface Image extends Poolable {

    void draw();

    Point getLocation();

    void setLocation(Point location);
}
