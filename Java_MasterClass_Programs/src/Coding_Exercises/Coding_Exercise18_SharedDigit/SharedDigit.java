package Coding_Exercises.Coding_Exercise18_SharedDigit;

public class SharedDigit {
	
	public static boolean hasSharedDigit(int a,int b)
	{
		if((a < 10 || a > 99) || (b < 10 || b > 99))
			return false;
		
		int lastDigitA = a % 10;
		a = a / 10;
		
		int lastDigitB = b % 10;
		b = b / 10;
		
		if((lastDigitA == b || lastDigitA == lastDigitB) || (a == b || a == lastDigitB))
			return true;
		else
			return false;
		
	}

}
