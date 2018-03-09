package org.test.jackson;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Serializer serializer = new Serializer();
		try {
			User result = serializer.readUser(new File("user.json"));
			System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
