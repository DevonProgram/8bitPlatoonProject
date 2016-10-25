import java.util.Scanner;


public class Exersize1 
{
	public Exersize1()//constructor
	{
		
	}
	
	public boolean isEven(int input)//isEven method checks if entered int is even or not
	{
		if(input%2 == 0)//test if there is a remainder by using modules opperator if there is no remainder it is even
		{
			return true ;//if true in if statement returns true
		}
		return false;//if false in if statment returns false
		
	}
	public boolean isPrime(int input2)//isPrime method checks if entered int is a prime number or not
	{
		if(input2%1 == 0 && input2%input2 == 0 && (input2 % 2 != 0 ))//test if there is a remainder by using modules opperator if there is no remainder when it is divded by 1 and itself but there is a remainder when divided by 2 is is a prime number
		{
			return true ;//if true in if statement returns true
		}
		return false;//if false in if statment returns false
	}
	public boolean isPalindrome(int input3)//isPalindrome method checks if entered int is a palindrome number or not
	{
		int palindrome = input3 ;//create object of entered int
		int reverse = 0;//create object for reversed number
		
		while(palindrome != 0)
		{
			int remainder = palindrome % 10 ;//check what is the remainder to use for reversed number
			reverse = reverse * 10 + remainder ;
			palindrome = palindrome/10 ;//dived by 10 to get reversed number
		}
		if(input3 == reverse)//test to see if int is palindrome
		{
			return true ;//returns true if ,if statment is true
		}
		return false ;//returns false if ,if statment is false
	}
	
	public static void main(String args[])
	{
		Exersize1 test = new Exersize1();
		System.out.println("" + test.isEven(8));
		System.out.println("" + test.isPrime(12));
		System.out.println("" + test.isPalindrome(323));
	}
}

