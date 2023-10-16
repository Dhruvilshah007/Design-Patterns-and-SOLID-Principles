package com.company.depinv;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	// Writes message to a file
	public void writeMessage(Message msg, Formatter formatter, PrintWriter writer)
			throws IOException {
		//SO now we are asking our caller(client) to give us dependency
		//So we have only business rules
		writer.println(formatter.format(msg)); // formats and writes message
		writer.flush();

	}
}
