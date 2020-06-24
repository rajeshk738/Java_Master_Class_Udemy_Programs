package Control_Flows_2;

public class Parsing_String {
	public static void main(String[] args) {
		String numberAsString = "2018";
		System.out.println("numberAsString = "+numberAsString);
		
		int number = Integer.parseInt(numberAsString);
		System.out.println("number = "+number);
		
		numberAsString += 1;
		number += 1;
		System.out.println("numberAsString = "+numberAsString);
		System.out.println("number = "+number);
		
		String n = "2018.25";
		System.out.println("n = "+n);
		double n1 = Double.parseDouble(n);
		System.out.println("n1 = "+n1);
	}

}
