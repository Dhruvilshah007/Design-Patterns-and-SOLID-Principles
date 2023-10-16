package com.company.depinv;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		Message msg = new Message("This is a message again...");
		MessagePrinter printer = new MessagePrinter();

//		try (PrintWriter writer = new PrintWriter(new FileWriter("test_msg.txt"))) {
//			printer.writeMessage(msg, new JSONFormatter(), writer);
//		}
		
		//SOwe can get messag in console easily
		// we can also change formatter to TextFormatter()
		// In spring boot autowiring and spring beans all use it.
		
		try (PrintWriter writer = new PrintWriter(System.out)) {
			printer.writeMessage(msg, new JSONFormatter(), writer);
		}

	}
}
