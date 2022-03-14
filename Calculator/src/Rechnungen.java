package Taschenrechner;

import java.util.ArrayList;


public class Rechnungen {
	
	int result = 0;
	
	/*
	 * EINGABE LESEN: 
	 * split() durch reguläre Ausdrücke (regex)
	 * ArrayList von Eingabe erzeugen
	 */
	
	public static ArrayList<Integer> scanInput(String input) {
		
		
		// Mein Ziel war die [] Symbolen mit einem Escape \ Symbol zu erzielen, scheint aber nicht zu klappen...
		String regex1 = "[,; \\Q[]\\E]+";		// ',; ' und alles zwischen \\Q und \\E werden nicht in ArrayList inkludiert
		String regex2 = "[,; ]+";				// Alles zwischen [] werden erzielt, inklusiv das leere Symbol. '+' bedeutet eine oder mehrere Vorkommen des gezielten Symbols
		String regex3 = "[,; \\[\\]]+";
		String regex4 = "[^0-9]";				// alle nicht-numerische chars werden gesplittet
		
		// Regex scheint nicht zu funktionieren, obwohl [ und ] mit dem Escape-char markiert geworden sind
		
		
		
		
		// Eingabe des Users zu einer finalen Listen konvertieren
		ArrayList<Integer> intList = new ArrayList<Integer>();
		String inputArray[] = input.split(regex2);
		
		for (String s: inputArray) {
			int a = Integer.parseInt(s);		// String -> int
			intList.add(a);
		}
		
		return intList;
	}
	
	
	
	/*
	 * OPERATIONEN: 
	 * Vereinigung
	 * Durchschnitt
	 * Differenz
	 */
	
	public static ArrayList<Integer> rechneVereinigung(String input1, String input2) {
		
		ArrayList<Integer> intList1 = scanInput(input1);
		ArrayList<Integer> intList2 = scanInput(input2);
		ArrayList<Integer> temp = new ArrayList<Integer>();
		//ArrayList<Integer> durchschnitt = rechneDurchschnittList(input1, input2);
		
		
		temp.addAll(intList1);
		temp.addAll(intList2);
		
		// löscht doppeltes Vorkommen einer Zahl in temp
		// Vereinigung = A + B - durchschnitt(A, B)
		for(int i = 0; i < temp.size(); i++) {
			for(int j = 0; j < temp.size(); j++) {
				if(temp.get(j) == temp.get(i) && i != j)
					temp.remove(j);
			}
		}
		
		return temp;
	}
	
	
	
		public static ArrayList<Integer> rechneDurchschnitt(String input1, String input2) {
			
			ArrayList<Integer> intList1 = scanInput(input1);
			ArrayList<Integer> intList2 = scanInput(input2);
			ArrayList<Integer> temp = new ArrayList<Integer>();

			
			for (int i = 0; i < intList1.size(); i++) {
				for (int j = 0; j < intList2.size(); j++) {
					// falls ein Element sich in beiden ArrayListen befindet, wird es zum Ergebnis hinzugefügt
					if (intList1.get(i) == intList2.get(j)) {
						temp.add(intList1.get(i));
					}
				}
			}
		
			return temp;
		}
	
	
	public static ArrayList<Integer> rechneDifferenz(String input1, String input2) {
		
		ArrayList<Integer> intList1 = scanInput(input1);
		ArrayList<Integer> intList2 = scanInput(input2);
		ArrayList<Integer> temp = new ArrayList<Integer>();
		ArrayList<Integer> durchschnitt = rechneDurchschnitt(input1, input2);
		
		// Differenz = alle, die in Durchschnitt vorkommen, werden vom Ergebnis gelöscht
		temp.addAll(intList1);
		temp.addAll(intList2);
		temp.removeAll(durchschnitt);

		return temp;
	}

}
