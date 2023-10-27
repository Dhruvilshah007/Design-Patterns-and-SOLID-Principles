package com.coffeepoweredcrew.abstractfactory2;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import org.w3c.dom.Document;

public class Client2 {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
		System.out.println("Using Factory class" + factory.getClass());

		DocumentBuilder builder = factory.newDocumentBuilder();
		System.out.println("Using Builder class" + builder.getClass());

		Document doc = builder.newDocument();
		System.out.println("Got Document class" + doc.getClass());

	}

}
