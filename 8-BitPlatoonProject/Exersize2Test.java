import static org.junit.Assert.*;

import org.junit.Test;


public class Exersize2Test 
{

	@Test
	public void testReverseString() 
	{
		Exersize2 check = new Exersize2();//create new exersize2 object
		assertEquals("dlroW olleH",check.ReverseString("Hello World"));//compare actual against real result
	}
	
	@Test
	public void testReverseString() 
	{
		Exersize2 check = new Exersize2();//create new exersize2 object
		assertEquals("yad doog",check.ReverseString("Good Day"));//compare actual against real result
	}

}
