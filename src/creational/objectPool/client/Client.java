package creational.objectPool.client;

import java.awt.Point;

import creational.objectPool.domain.Bitmap;
import creational.objectPool.pattern.ObjectPool;

public class Client {

	public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(() -> new Bitmap("Logo.bmp"), 5);
	
    public static void main(String[] args) {
    	Bitmap b1 = bitmapPool.get();
    	b1.setLocation(new Point(10, 10));
    	Bitmap b2 = bitmapPool.get();
    	b2.setLocation(new Point(-10, 0));
    	
    	b1.draw();
    	b2.draw();
    	
    	bitmapPool.release(b1);
    	bitmapPool.release(b2);
    }
}
