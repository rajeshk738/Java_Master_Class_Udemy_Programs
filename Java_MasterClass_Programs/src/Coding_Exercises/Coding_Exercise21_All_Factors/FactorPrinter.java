package Coding_Exercises.Coding_Exercise21_All_Factors;

public class FactorPrinter {
	
	public static void printFactors(int number)
	{
		if(number < 1)
			System.out.println("Invalid Value");
		else
		{
			int i = 1;
			
			while(i <= number)
			{
				if(number % i == 0)
					System.out.println(i);
				i++;
			}	
		}
	}

}
