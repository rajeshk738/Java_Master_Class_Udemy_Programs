package Control_Flows_2;

import java.util.Scanner;

public class Reading_User_Input {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int sum = 0;
		
		while(count<5)
		{
			int order  = count + 1;
			System.out.println("Enter nummber "+order+": ");
			
			boolean isAnInt = scan.hasNextInt(); // check the next entered element is integer or not.
			
			if(isAnInt)
			{
				int number = scan.nextInt();
				count++;
				sum += number;
			}
			else
			{
				System.out.println("Invalid number");
				break;
				
			}
		}
		scan.close();
		System.out.println("sum = "+sum);
	}

}
