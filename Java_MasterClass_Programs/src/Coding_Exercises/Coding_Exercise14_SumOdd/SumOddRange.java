package Coding_Exercises.Coding_Exercise14_SumOdd;

public class SumOddRange {
	
	public static boolean isOdd(int number)
	{
		if(number <= 0)
			return false;
		if(number % 2 != 0)
			return true;
		else
			return false;
	}
	
	public static int sumOdd(int start,int end)
	{
		int sum = 0;
		
		if(start < 1 || end < 1)
			return -1;
		
		if(start > end)
			return -1;
		
		for(int i=start;i<=end;i++)
		{
			if(isOdd(i))
				sum += i;
		}
		
		return sum;
	}
}
