package org.test.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	private String gender;
	private String name;

	@JsonCreator
	public User(@JsonProperty(value = "name", required = true) String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [gender=" + gender + ", name=" + name + "]";
	}

}