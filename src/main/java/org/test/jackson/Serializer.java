package org.test.jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class Serializer {
	private ObjectMapper mapper;

	public Serializer() {
		mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		SimpleModule sm = new SimpleModule("PIF deserialization");
		mapper.registerModule(sm);
	}

	public void writeUser(File filename, User user) throws IOException {
		mapper.writeValue(filename, user);
	}

	public User readUser(File filename) throws IOException {
		return mapper.readValue(filename, User.class);
	}
}