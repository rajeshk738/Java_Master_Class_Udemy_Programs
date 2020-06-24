package Coding_Exercises.Coding_Exercise3_BarkingDog;

public class BarkingDog {
	
	public static boolean shouldWakeUp(boolean barking,int hourOfDay)
	{
		if(hourOfDay < 0 || hourOfDay > 23)
			return false;
		else if(barking)
		{
			if(hourOfDay < 8 || hourOfDay > 22)
				return true;
			else
				return false;
		}
		else
			return false;
	}

}
