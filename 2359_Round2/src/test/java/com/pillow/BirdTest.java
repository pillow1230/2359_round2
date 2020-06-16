package com.pillow;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class BirdTest extends TestCase {
	
	private Chicken chicken;
	private Duck duck;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUp(){
		chicken = new Chicken();
		duck = new Duck();
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void testSing() {
		chicken.action("sing", chicken);
		assertEquals("i am singing\n",outContent.toString());
		
		outContent.reset();
		chicken.action("fly", chicken);
		assertEquals("i am walking\n",outContent.toString());
		
		outContent.reset();
		chicken.action("asd",chicken);
		assertEquals("i am walking\n",outContent.toString());
		
		outContent.reset();
		chicken.action("walking", chicken);
		assertEquals("i am walking\n",outContent.toString());
		
		outContent.reset();
		chicken.action("", chicken);
		assertEquals("i am walking\n",outContent.toString());
		
		outContent.reset();
		chicken.action("swim", duck);
		assertEquals("i am swimming\n",outContent.toString());
		
		outContent.reset();
		chicken.say();
		assertEquals("Cluck, cluck\n",outContent.toString());
		
		outContent.reset();
		duck.say();
		assertEquals("Quack, quack\n",outContent.toString());
	}
	
	@Test(expected = NullPointerException.class)
	public void whenExceptionThrown_thenExpectationSatisfied() {
		outContent.reset();
		chicken.action(null, chicken);
	}
	
}
