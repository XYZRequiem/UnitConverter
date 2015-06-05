import java.util.*;
public class mainProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initialize variable
		char Input = 'a';
		
		// Create scanner
		Scanner in = new Scanner (System.in);
		
		// Request user input
		System.out.println("Input the key for the unit you wish to convert.");
		System.out.println("\t T to convert Temperature (F/C)");
		System.out.println("\t W to convert Mass and Weight (lb/kg)");
		
		Input = in.next().charAt(0);
		
		
		//Use switch statement to check for user choice
		switch (Input) {
		
		// Temperature case
			case 't'|'T':
				char temp = 'b';
				double result = 0.0;
				
				System.out.println("Enter:");
				System.out.println(" C to convert Celsius to Fahrenheit");
				System.out.println("\t\t or");
				System.out.println(" F to convert Fahrenheit to Celsius");
				
				temp = in.next().charAt(0);
				
				while (temp != 'c' && temp != 'C' && temp != 'f' && temp != 'F') {
					System.out.println("\nYou did not enter a valid character");
					System.out.println("Try again");
					
					temp = in.next().charAt(0);
				}
				
				if (temp == ('c'|'C')) {
					double degree = 0.0;
					
					formulas code = new formulas();
					
					System.out.println("\n Enter the temperature (in degrees Celsius), you wish to convert");
					degree = in.nextDouble();
					
					result = code.CtoF(degree);
					
					System.out.println(degree + "deg Celsius = " + result + "deg Fahrenheit");
					
				} else if (temp == ('f'|'F')) {
					double degree = 0.0;
					
					formulas code = new formulas();
					
					System.out.println("\n Enter the temperature (in degrees Fahrenheit), you wish to convert");
					degree = in.nextDouble();
					
					result = code.FtoC(degree);
					
					System.out.println(degree + "deg Fahrenheit = " + result + "deg Celsius");
				}
				
				break;
				
			case 'w'|'W':
				// Initialize variables
				char weight = 'b';
				double MWresult = 0.0;
				
				// Request user input
				System.out.println("Enter:");
				System.out.println(" P to convert Pounds to Kilograms");
				System.out.println("\t\t or");
				System.out.println(" K to convert Kilograms to Pounds");
				
				weight = in.next().charAt(0);
				
				// If no valid input given try again
				while (weight != 'p' && weight != 'P' && weight != 'k' && weight != 'K') {
					System.out.println("\nYou did not enter a valid character");
					System.out.println("Try again");
					
					temp = in.next().charAt(0);
				}
				
				// If user inputs p convert from pounds to kilograms
				// If user inputs k convert from kilograms to pounds
				if (weight == ('p'|'P')) {
					double degree = 0.0;
					
					formulas code = new formulas();
					
					System.out.println("\n Enter the weight (lb), you wish to convert");
					degree = in.nextDouble();
					
					MWresult = code.LBtoM(degree);
					
					System.out.println(degree + "lb = " + MWresult + "kg");
					
				} else if (weight == ('k'|'K')) {
					double degree = 0.0;
					
					formulas code = new formulas();
					
					System.out.println("\n Enter the mass (kg), you wish to convert");
					degree = in.nextDouble();
					
					MWresult = code.MtoLB(degree);
					
					System.out.println(degree + "kg = " + MWresult + "lb");
				}
				
				break;
				
		// Default case		
			default:
				System.out.println("You did not enter a valid character");
				
				break;
		}
		in.close();
	}
	
}
