import java.util.Scanner;


public class Exersize1 
{
	public Exersize1()
	{
		
	}
	
	public boolean isEven(int input)
	{
		if(input%2 == 0)
		{
			return true ;
		}
		return false;
		
	}
	public boolean isPrime(int input2)
	{
		if(input2%1 == 0 && input2%input2 == 0 && (input2 % 2 != 0 ))
		{
			return true ;
		}
		return false;
	}
	public boolean isPalindrome(int input3)
	{
		int palindrome = input3 ;
		int reverse = 0;
		
		while(palindrome != 0)
		{
			int remainder = palindrome % 10 ;
			reverse = reverse * 10 + remainder ;
			palindrome = palindrome/10 ;
		}
		if(input3 == reverse)
		{
			return true ;
		}
		return false ;
	}
	
	public static void main(String args[])
	{
		Exersize1 test = new Exersize1();
		System.out.println("" + test.isEven(8));
		System.out.println("" + test.isPrime(12));
		System.out.println("" + test.isPalindrome(323));
	}
}

