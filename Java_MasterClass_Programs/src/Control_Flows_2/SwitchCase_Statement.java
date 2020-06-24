package Control_Flows_2;

public class SwitchCase_Statement {

	public static void main(String[] args) {
		int switchvalue = 3;
		
		switch(switchvalue) {
		case 1:System.out.println("1 found");
		break;
		case 2:System.out.println(" 2 found");
		break;
		case 3:
		case 4:
		case 5: System.out.println("3 or 4 or 5 found");
		break;
		default:System.out.println("Nothing Found");
		
		}
	}

}
