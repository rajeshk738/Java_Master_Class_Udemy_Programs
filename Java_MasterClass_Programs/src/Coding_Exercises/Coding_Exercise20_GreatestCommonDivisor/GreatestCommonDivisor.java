package Coding_Exercises.Coding_Exercise20_GreatestCommonDivisor;

public class GreatestCommonDivisor {
	
	public static int getGreatestCommonDivisor(int a,int b)
	{
		int end;
		
		if(a < 10 || b < 10)
			return -1;
		else
		{
			if(a < b)
			    end = a;
			else
				end = b;
			
			while(end > 0)
			{
				if((a % end == 0) && (b % end == 0))
					return end;
				else
					end--;
			}
		}
		return -1;
	}

}
