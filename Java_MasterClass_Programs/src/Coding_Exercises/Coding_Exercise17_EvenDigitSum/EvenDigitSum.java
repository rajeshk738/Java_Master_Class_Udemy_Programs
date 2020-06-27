package Coding_Exercises.Coding_Exercise17_EvenDigitSum;

public class EvenDigitSum {
	
	public static int getEvenDigitSum(int number)
	{
		int sum = 0,rem;
		
		if(number < 0)
			return -1;
		
		while(number > 0)
		{
			rem = number % 10;
			
			if(rem % 2 == 0)
			   sum += rem;
			
			number = number / 10;
			
		}
		
		return sum;
			
	}
}
