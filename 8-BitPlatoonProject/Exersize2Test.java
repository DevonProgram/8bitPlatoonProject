import static org.junit.Assert.*;

import org.junit.Test;


public class Exersize2Test 
{

	@Test
	public void testReverseString() 
	{
		Exersize2 check = new Exersize2();
		assertEquals("dlroW olleH",check.ReverseString("Hello World"));
	}

}
