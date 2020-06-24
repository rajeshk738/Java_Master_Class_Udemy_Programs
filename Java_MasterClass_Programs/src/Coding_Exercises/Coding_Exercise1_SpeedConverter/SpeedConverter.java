package Coding_Exercises.Coding_Exercise1_SpeedConverter;

public class SpeedConverter {
	
	public static long toMilesPerHour(double kiloMetersPerHour)
	{
		if(kiloMetersPerHour < 0)
			return -1;
		else
		{
			long miles = Math.round(kiloMetersPerHour / 1.609);
			return miles;
		}
			
	}
	
	public static void printConversion(double kiloMetersPerHour)
	{
		long miles = toMilesPerHour(kiloMetersPerHour);
		
		if(miles == -1)
			System.out.println("Invalid Value");
		else
		    System.out.println(kiloMetersPerHour+" km/h = "+miles+" mi/h");
		
	}
	
	
	
}
