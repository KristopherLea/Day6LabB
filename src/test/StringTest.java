package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Strings;

@DisplayName("Show Name")
class StringTest {
	
	
	@BeforeEach
	void init() {
		Strings strings = new Strings();
	}
	@Test
	@DisplayName("Name")
	void addName() {
		Strings strings = new Strings();
		
		String expected = "Hello World";
		System.out.println(expected);
		String actual = strings.name("Hello", "World");
		System.out.println(actual);
		assertEquals(strings.name("Hello", "World"), "Hello World");
	}

}
