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
			System.out.println("Bitte geben Sie Ihre erste Menge beispielsweise wie folgt ein:\t1, 2, 3, 4, 5");
			input1 = s.nextLine();
			if(input1.isEmpty()) {
				System.out.println("Taschenrechner wird heruntergefahren...");
				System.exit(0);
			} else {
				str.append(Rechnungen.scanInput(input1));		// str = [...]
			}
			System.out.println(str);		
		
		
		
			// Menge 2
			System.out.println("Bitte geben Sie Ihre zweite Menge beispielsweise wie folgt ein:\t1, 2, 3, 4, 5");
			input2 = s.nextLine();
			if(input2.isEmpty()) {
				System.out.println("Taschenrechner wird heruntergefahren...");
				System.exit(0);
			} else {
				str.append(Rechnungen.scanInput(input2));	// str = [...][...]
			}
				System.out.println(str);
			 
		
		
			// Operation: Vereinigung, Durchschnitt oder Differenz
			System.out.println("Bitte wählen Sie eine Operation aus: ");
			System.out.println("[+]\t\tVereinigung\n[*]\t\tDurchschnitt\n[-]\t\tDifferenz\n[*Eingabetaste]\t\tProgramm beenden");
			System.out.println("Operation: ");
			opInput = s.nextLine();
			str.append(opInput);
			System.out.println(str);
		
			// Casting string -> char
			char c = opInput.charAt(0);
		
			switch(c) {
			case '+':
				System.out.println("Vereinigung: ");
				System.out.println(Rechnungen.rechneVereinigung(input1, input2));
				break;
			case '*':
				System.out.println("Durchschnitt: ");
				System.out.println(Rechnungen.rechneDurchschnitt(input1, input2));
				break;
			case '-':
				System.out.println("Differenz: ");
				System.out.println(Rechnungen.rechneDifferenz(input1, input2));
				break;
			case ' ':
				System.out.println("Taschenrechner wird heruntergefahren...");
				System.exit(0);
			default: 
				System.out.println("Fehler: keine bekannte Operation");
			}
			
		} catch (Exception e) {
			System.out.println("Etwas ist schiefgegangen.");
		}
		
		
		System.out.println("Um weiterzurechnen, geben Sie ein beliebiges Input ein. Sonst, bitte geben Sie eine leere Zeile ein.");
		opInput = s.nextLine();
		
		
		if (opInput.isEmpty()) {
			// wenn Eingabetaste gedrückte wird
			System.out.println("Taschenrechner wird heruntergefahren...");
			System.exit(0);			// exit code 0 markiert eine erfolgreiche Durchführung des Programmes
		} else {
			// sonst eine beliebige Input
			System.out.println("Taschenrechner startet neu...");
			restart(args);
		}
		
		
	}
	
	
	
	// neustarten wenn Eingabetaste gedrückt wird / leere Zeile eingegeben wird 
	private static void restart(String[] strArr)
    {
        main(strArr);				// ruft main wieder an 
    }

}
