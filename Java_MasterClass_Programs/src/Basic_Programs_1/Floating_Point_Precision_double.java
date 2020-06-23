package Basic_Programs_1;

public class Floating_Point_Precision_double {
	public static void main(String[] args) {
		
		int myIntvalue = 5 / 3;
		float myFloatValue = 5f / 3f;
		double myDoubleValue = 5d / 3d;
		
		System.out.println("MyIntValue = "+myIntvalue);
		System.out.println("MyFloatValue = "+myFloatValue);
		System.out.println("MyDoubleValue = "+myDoubleValue);
		
		
		
		float myFloatValue1 = (float) (5.0 / 3.0);
		double myDoubleValue1 = 5.00 / 3.00;
		
		
		System.out.println("MyFloatValue = "+myFloatValue1);
		System.out.println("MyDoubleValue = "+myDoubleValue1);
		
		double number = 3_000_000.5_000_517d; // use underscore for large numberst to represent
		System.out.println("Long double number = "+number);
	}

}
