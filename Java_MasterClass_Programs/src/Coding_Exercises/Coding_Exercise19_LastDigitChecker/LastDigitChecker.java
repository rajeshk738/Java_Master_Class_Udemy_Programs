package Coding_Exercises.Coding_Exercise19_LastDigitChecker;

public class LastDigitChecker {
	
	public static boolean isValid(int number)
	{
		if(number < 10 || number > 1000)
			return false;
		else
			return true;
	}
	
	public static boolean hasSameLastDigit(int a,int b,int c)
	{
		if(!(isValid(a) && isValid(b) && isValid(c)))
			return false;
		else
		{
			int last1 = a % 10;
			int last2 = b % 10;
			int last3 = c % 10;
			
			if((last1 == last2) || (last1 == last3))
				return true;
			else if((last2 == last3) || (last2 == last1))
				return true;
			else
				return false;
		}
			
	}
}
