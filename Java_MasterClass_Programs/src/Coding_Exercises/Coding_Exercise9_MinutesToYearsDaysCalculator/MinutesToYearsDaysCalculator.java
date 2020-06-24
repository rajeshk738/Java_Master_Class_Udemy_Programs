package Coding_Exercises.Coding_Exercise9_MinutesToYearsDaysCalculator;

public class MinutesToYearsDaysCalculator {
	
	public static void printYearsAndDays(long minutes) 
	{
		if(minutes < 0)
			System.out.println("Invalid Value");
		else
		{
			long yearMin = (365 * 24 * 60);
			long years = (minutes / yearMin);
			long days = (minutes % yearMin) / 1440;
			
			System.out.println(minutes+" min = "+years+" y and "+days+" d");
		}
	}
}
