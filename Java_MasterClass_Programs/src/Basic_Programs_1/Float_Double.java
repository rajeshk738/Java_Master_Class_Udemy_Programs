package Basic_Programs_1;

public class Float_Double {

	public static void main(String[] args) {
		
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float minimum value = "+myMinFloatValue);
		System.out.println("Float Maximum value = "+myMaxFloatValue);

		double myMindoubleValue = Double.MIN_VALUE;
		double myMaxdoubleValue = Double.MAX_VALUE;
		System.out.println("double minimum value = "+myMindoubleValue);
		System.out.println("double Maximum value = "+myMaxdoubleValue);		
		
		int myIntValue = 5;
		
//	 float myFloatValue = 5.25;	 // ---> If we don't specify 'f' then it treats as double then error conversion from double to float.
		
//		float myFloatValue = 5.2; // ---> If we don't specify 'f' then it treats as double then error conversion from double to float.
	
//	 float myFloatValue = (float) 5.25;	  ---> No error Casting to float.
		float myFloatValue = 5.25f;   // ---> easier to look.
		
		double myDoubleValue = 5d;
		
		System.out.println("myIntValue: "+myIntValue);
		System.out.println("myFloatValue: "+myFloatValue);
		System.out.println("myDoubleValue: "+myDoubleValue);

		int myIntValue1 = 5 / 3;		// returns only integer part
		float myFloatValue1 = 5f / 3f;		
		double myDoubleValue1 = 5d / 3d;
		
		System.out.println("myIntValue div: "+myIntValue1);
		System.out.println("myFloatValue div: "+myFloatValue1);
		System.out.println("myDoubleValue div: "+myDoubleValue1);
		
	}

}
