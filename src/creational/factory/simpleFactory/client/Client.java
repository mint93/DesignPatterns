package creational.factory.simpleFactory.client;

import creational.factory.simpleFactory.domain.Post;
import creational.factory.simpleFactory.pattern.PostFactory;

public class Client {

	public static void main(String[] args) {
		Post post = PostFactory.createPost("news");
		System.out.println(post);

	}

}
