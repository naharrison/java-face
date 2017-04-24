package utest;

import scratch.MyThing;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyThingTest {
	
	@Test
	public void testConcatenate() {
		scratch.MyThing myThing = new MyThing();
		assertEquals(myThing.concatenate("one", "two"), "onetwo");
	}

	@Test
	public void testConcatenateWithSpace() {
		scratch.MyThing myThing = new MyThing();
		assertEquals(myThing.concatenateWithSpace("one", "two"), "one two");
	}

}
