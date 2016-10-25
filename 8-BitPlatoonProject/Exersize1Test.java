import static org.junit.Assert.*;

import org.junit.Test;


public class Exersize1Test 
{
	@Test
	public void testIsEvenIsTrue()//testing if method result is true. 
	{
		Exersize1 check = new Exersize1();//creating new exersize object
		boolean expected = true ;//expected result
		boolean result = check.isEven(4);//real result
		assertEquals(expected, result);//checking exepected against real result
	}
	public void testIsEvenIsFalse() 
	{
		Exersize1 check = new Exersize1();//creating new exersize object
		assertEquals(false , check.isEven(3));//checking exepected against real result
	}
	
	public void testIsEvenIsTrue2()//testing if method result is true. 
	{
		Exersize1 check = new Exersize1();//creating new exersize object
		assertEquals(true , check.isEven(20));//checking exepected against real result
	}
	
	public void testIsPrimeIsTrue() 
	{
		Exersize1 check = new Exersize1();//creating new exersize object
		assertEquals(true , check.isPrime(7));//checking exepected against real result
	}
	public void testIsPrimeIsFalse() 
	{
		Exersize1 check = new Exersize1();//creating new exersize object
		assertEquals(false , check.isPrime(4));//checking exepected against real result
	}
	public void testIsPrimeIsTrue2() 
	{
		Exersize1 check = new Exersize1();//creating new exersize object
		assertEquals(true , check.isPrime(13));//checking exepected against real result
	}
	public void testIsPrimeIsFalse2() 
	{
		Exersize1 check = new Exersize1;//creating new exersize object
		assertEquals(false , check.isPrime(10));//checking exepected against real result
	}
	
	public void testIsPalindromeIsTrue() 
	{
		Exersize1 check = new Exersize1();//creating new exersize object
		assertEquals(true , check.isPalindrome(121));//checking exepected against real result
	}
	public void testIsPalindromeIsFalse() 
	{
		Exersize1 check = new Exersize1();//creating new exersize object
		assertEquals( false, check.isPalindrome(110));//checking exepected against real result
	}

	public void testIsPalindromeIsTrue2() 
	{
		Exersize1 check = new Exersize1();//creating new exersize object
		assertEquals(true , check.isPalindrome(120021));//checking exepected against real result
	}
}
