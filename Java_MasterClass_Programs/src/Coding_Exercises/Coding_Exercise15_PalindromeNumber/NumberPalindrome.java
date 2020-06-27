package Coding_Exercises.Coding_Exercise15_PalindromeNumber;

public class NumberPalindrome {
	
	public static boolean isPalindrome(int number)
	{
		
		int reverse = 0;
		int remainder;
		
		int n = Math.abs(number);
		
		while(n > 0)
		{
			remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;
			
		}
		
		if(Math.abs(number) == reverse)
			return true;
		else
			return false;
	}

}
