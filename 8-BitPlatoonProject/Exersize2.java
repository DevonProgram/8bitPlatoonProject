
public class Exersize2 
{
	public Exersize2()
	{
	}
	
	public String ReverseString(String input)//methos to reverse a string
	{
		String reverse = "";//create object for reversed string
		int length = input.length();//get the length of the inputted string
		for(int i = length - 1 ; i >= 0 ; i--)//loop to reverse the string by putting it back from the last letter of the string
		{
			reverse = reverse + input.charAt(i);
		}
		
		return reverse ;//returns the reversed string
	}
	
	public static void main(String args[])
	{
		Exersize2 test = new Exersize2();
		System.out.println(test.ReverseString("Hello"));
	}
}
