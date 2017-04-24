package utest;

import scratch.MyThing;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyThingTest {
	
	@Test
	public void testConcatenate() {
		scratch.MyThing myThing = new MyThing();
		assertEquals("onetwo", myThing.concatenate("one", "two"));
	}

	@Test
	public void testConcatenateWithSpace() {
		scratch.MyThing myThing = new MyThing();
		assertEquals("one two", myThing.concatenateWithSpace("one", "two"));
	}

}
