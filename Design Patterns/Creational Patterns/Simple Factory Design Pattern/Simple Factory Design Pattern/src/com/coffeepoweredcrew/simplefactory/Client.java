package com.coffeepoweredcrew.simplefactory;

public class Client {

	public static void main(String[] args) {

		Post post = PostFactory.createPost("blog");
//		Post post = PostFactory.createPost("news");
//		Post post = PostFactory.createPost("product");

		System.out.println(post);

	}

}
