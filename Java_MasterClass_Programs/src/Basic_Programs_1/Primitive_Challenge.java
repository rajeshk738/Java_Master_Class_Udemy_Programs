package Basic_Programs_1;

public class Primitive_Challenge {

	public static void main(String[] args) {

		byte b = 125;
		short s = 150;
		int i = 40000;
		long  l = 50000L + 10L *(b+s+i);
		System.out.println(l);
		
		short shortTotal = (short) (1000 + 10 * (b+s+i));  // --> casting is required from int to short	
		System.out.println(shortTotal);

	}

}
