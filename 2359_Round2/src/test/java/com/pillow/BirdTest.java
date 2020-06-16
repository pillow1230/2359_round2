package com.pillow;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
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
		bird.action("sing");
		assertEquals("i am singing\n",outContent.toString());
		
		outContent.reset();
		bird.action("fly");
		assertEquals("i am flying\n",outContent.toString());
		
		outContent.reset();
		bird.action("asd");
		assertEquals("i am walking\n",outContent.toString());
	}
	
}
