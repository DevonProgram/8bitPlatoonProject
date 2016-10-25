import static org.junit.Assert.*;

import org.junit.Test;


public class Exersize1Test 
{
//	private Exersize1 check ;
//	
//	public void setUp() throws Exception
//	{
//		check =  new Exersize1();
//	}
	@Test
	public void testIsEvenIsTrue() 
	{
		Exersize1 check = new Exersize1();
		boolean expected = true ;
		boolean result = check.isEven(4);
		assertEquals(expected, result);
	}
	public void testIsEvenIsFalse() 
	{
		Exersize1 check = new Exersize1();
		assertEquals(false , check.isEven(3));
	}
	
	public void testIsPrimeIsTrue() 
	{
		Exersize1 check = new Exersize1();
		assertEquals(true , check.isPrime(7));
	}
	public void testIsPrimeIsFalse() 
	{
		Exersize1 check = new Exersize1();
		assertEquals(false , check.isPrime(4));
	}
	
	public void testIsPalindromeIsTrue() 
	{
		Exersize1 check = new Exersize1();
		assertEquals(true , check.isPalindrome(121));
	}
	public void testIsPalindromeIsFalse() 
	{
		Exersize1 check = new Exersize1();
		assertEquals( false, check.isPalindrome(110));
	}

}
