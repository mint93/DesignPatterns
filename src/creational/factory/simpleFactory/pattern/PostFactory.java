package creational.factory.simpleFactory.pattern;

import creational.factory.simpleFactory.domain.BlogPost;
import creational.factory.simpleFactory.domain.NewsPost;
import creational.factory.simpleFactory.domain.Post;
import creational.factory.simpleFactory.domain.ProductPost;

public class PostFactory {
	public static Post createPost(String type) {
		switch(type) {
		case "blog":
			return new BlogPost();
		case "news":
			return new NewsPost();
		case "product":
			return new ProductPost();
		default:
			throw new IllegalArgumentException("Post type is unknown");
		}
	}
}
