package creational.prototype.client;

import creational.prototype.pattern.Swordsman;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Swordsman swordsman1 = new Swordsman();
		swordsman1.move(20);
		swordsman1.attack();
		System.out.println(swordsman1);
		
		Swordsman swordsman2 = (Swordsman) swordsman1.clone();
		System.out.println("Cloned: " + swordsman2);
		
	}

}
