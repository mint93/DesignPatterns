package behavioral.iterator.client;

import behavioral.iterator.pattern.Iterator;
import behavioral.iterator.pattern.ThemeColor;

public class Client {

	public static void main(String[] args) {
		Iterator<ThemeColor> iter = ThemeColor.getIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
