package structural.proxy.client;

import java.awt.Point;

import structural.proxy.domain.Image;
import structural.proxy.pattern.staticProxy.ImageFactory;

public class Client {

	public static void main(String[] args) {
		//static proxy
		Image img = ImageFactory.getImage("A1.bmp");
		
		img.setLocation(new Point(10,10));
		System.out.println("Image location :"+img.getLocation());
		System.out.println("rendering image now.....");
		img.render();
		
		System.out.println("------------------------------------\n");
		
		//dynamic proxy
		Image img2 = structural.proxy.pattern.dynamicProxy.ImageFactory.getImage("A2.bmp");
		img2.setLocation(new Point(-10, 0));
		System.out.println(img2.getLocation());
		System.out.println("*****************************");
		img2.render();
	}

}
