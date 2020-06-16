package com.pillow;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class BirdTest extends TestCase {
	
	private Bird bird;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUp(){
		bird = new Bird();
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void testSing() {
		bird.sing();
		assertEquals("i am singing\n",outContent.toString());
	}
	
}
