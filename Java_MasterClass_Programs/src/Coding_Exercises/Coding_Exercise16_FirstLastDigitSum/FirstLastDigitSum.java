package Coding_Exercises.Coding_Exercise16_FirstLastDigitSum;

public class FirstLastDigitSum {
	
	public static int sumFirstAndLastDigit(int number)
	{
		if(number < 0)
			return -1;
		else if(number < 10)
			return number+number;
		else
		{
			int last = number % 10;
			int first = 0;
			int rev = 0,rem;
			while(number > 0)
			{
				first = number;
				rem = number % 10;
				rev = rev * 10 + rem;
				number = number / 10;
			}
			
			return (first+last);
		}
	}

}
