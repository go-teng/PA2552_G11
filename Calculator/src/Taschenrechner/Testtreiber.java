package Taschenrechner;

import java.util.Scanner;

public class Testtreiber {
	
	public static void main(String[] args) {
		
		String input1;
		String input2;
		String opInput; 

		Scanner s = new Scanner(System.in);
		StringBuffer str = new StringBuffer("");
		
		
		
		
		try {
			// Menge 1
			System.out.println("test - gaik");
			System.out.println("SET OPERATIONS CALCULATOR \n\nIn Mathematics, sets are a collection of well-defined objects or elements. For example, the set {1, 5, 8} has the elements 1, 5 and 8.\nWith this calculator, you can perform mathematical operations on sets of your choice.\n");
			System.out.println("Please enter your first set of numbers separated with commas like so:\t1, 2, 3, 4, 5");
			input1 = s.nextLine();
			if(input1.isEmpty()) {
				System.out.println("Calculator is shutting down...");
				System.exit(0);
			} else {
				str.append(Rechnungen.scanInput(input1));		// str = [...]
			}
			System.out.println(str);		
		
		
		
			// Menge 2
			System.out.println("Please enter your second of numbers separated with commas like so:\t1, 2, 3, 4, 5");
			input2 = s.nextLine();
			if(input2.isEmpty()) {
				System.out.println("Calculator is shutting down...");
				System.exit(0);
			} else {
				str.append(Rechnungen.scanInput(input2));	// str = [...][...]
			}
				System.out.println(str);
			 
		
		
			// Operation: Vereinigung, Durchschnitt oder Differenz
			System.out.println("Please choose a mathematical operation: ");
			System.out.println("[+]\t\tUnion\n[*]\t\tIntersection\n[-]\t\tDifference\n[*ENTER key]\tEnd Program");
			System.out.println("Operation: ");
			opInput = s.nextLine();
			str.append(opInput);
			System.out.println(str);
		
			// Casting string -> char
			char c = opInput.charAt(0);
		
			switch(c) {
			case '+':
				System.out.println("Union: ");
				System.out.println(Rechnungen.rechneVereinigung(input1, input2));
				break;
			case '*':
				System.out.println("Intersection: ");
				System.out.println(Rechnungen.rechneDurchschnitt(input1, input2));
				break;
			case '-':
				System.out.println("Difference: ");
				System.out.println(Rechnungen.rechneDifferenz(input1, input2));
				break;
			case ' ':
				System.out.println("Calculator is shutting down...");
				System.exit(0);
			default: 
				System.out.println("Error: operation unknown");
			}
			
		} catch (Exception e) {
			System.out.println("Sorry, something went wrong.");
		}
		
		
		System.out.println("To continue, please enter any kind of input. Otherwise, please enter an empty line.");
		opInput = s.nextLine();
		
		
		if (opInput.isEmpty()) {
			// wenn Eingabetaste gedrückte wird
			System.out.println("Calculator is shutting down...");
			System.exit(0);			// exit code 0 markiert eine erfolgreiche Durchführung des Programmes
		} else {
			// sonst eine beliebige Input
			System.out.println("Calculator is restarting...");
			restart(args);
		}
		
		
	}
	
	
	
	// neustarten wenn Eingabetaste gedrückt wird / leere Zeile eingegeben wird 
	private static void restart(String[] strArr)
    {
        main(strArr);				// ruft main wieder an 
    }

}
