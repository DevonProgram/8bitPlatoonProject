
public class Exersize2 
{
	public Exersize2()
	{
	}
	
	public String ReverseString(String input)
	{
		String reverse = "";
		int length = input.length();
		for(int i = length - 1 ; i >= 0 ; i--)
		{
			reverse = reverse + input.charAt(i);
		}
		
		return reverse ;
	}
	
	public static void main(String args[])
	{
		Exersize2 test = new Exersize2();
		System.out.println(test.ReverseString("Hello"));
	}
}
