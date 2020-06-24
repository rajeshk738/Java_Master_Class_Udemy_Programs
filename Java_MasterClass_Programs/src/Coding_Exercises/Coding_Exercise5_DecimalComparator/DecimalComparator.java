package Coding_Exercises.Coding_Exercise5_DecimalComparator;

public class DecimalComparator {
	
	public static boolean areEqualByThreeDecimalPlaces(double a,double b)
	{
		a = a * 1000;
		int c = (int) a;
		
		b = b * 1000;
		int d = (int) b;
		
		
		if(c == d)
			return true;
		else
			return false;
	}
}
