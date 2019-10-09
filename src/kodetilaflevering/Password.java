package kodetilaflevering;
import java.util.Scanner;
public class Password {

	public static void main (String[] args) {
		//Først introduceres en scanner
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();

		//Her undersøges baseret på kommende kriterier, passwordets styrke
		//Hvis længden er under 7
		if (s.length() <7) {
			System.out.print("unacceptable");
			//Hvis længde over 9, min 1 lille, min 1 stort, min 1 tal, min 1 ikkealfa
		} else if (s.length() >= 9 && småBogstav (s) >= 1 && storeBogstav (s) >= 1 && Num (s) >= 1 && ikkeAlfaNumerisk (s) >= 1) {
			System.out.print("strong");
			//Hvis længde over 7, min 1 lille, min 1 stort, min 1 tal
		} else if (s.length() >= 7 && småBogstav (s) >= 1 && storeBogstav (s) >= 1 && Num (s) >= 1)  {
			System.out.print("acceptable");
			//Hvis længde over 7, min 1 lille, min 1 stort, min 1 ikkealfa
		} else if (s.length() >= 7 && småBogstav (s) >= 1 && storeBogstav (s) >= 1 && ikkeAlfaNumerisk (s) >= 1) {
			System.out.print("acceptable");
		}	
		//Hvis ingen kriterier passer, er den uacceptabel
		else {
			System.out.print("unacceptable");
		}
	}

	//Her undersøges om string indeholder små bostaver
	public static int småBogstav(String s) {
		int småBogstav = 0;
		for (int i = 0; i < s.length(); i++) {
			char små = s.charAt(i);
			if (Character.isLowerCase(små)) {
				småBogstav ++;	
			}		
		}
		return småBogstav;
	}

	//Her undersøges om string inderholder storebogstaver
	public static int storeBogstav(String s) {
		int storeBogstav = 0;
		for (int i = 0; i < s.length(); i++) {
			char store = s.charAt(i);
			if (Character.isUpperCase(store)) {
				storeBogstav ++;	
			}		
		}
		return storeBogstav;
	}

	//Her undersøges om string indeholder tal
	public static int Num(String s) {
		int Num = 0;
		for (int i = 0; i < s.length(); i++) {
			char tal = s.charAt(i); 
			if (Character.isDigit(tal)) {
				Num ++;	
			}		
		}
		return Num;
	}

	//Her undersøges om string indeholder ikkealfanumeriske tegn
	public static int ikkeAlfaNumerisk (String s) {
		int ikkeAlfaNumerisk = 0;
		for (int i = 0; i < s.length(); i++) {
			char ikke = s.charAt(i);
			//Dette undersøges ved at se om strign indeholder noget som hverken er bogstav eller tal
			if (Character.isLetter(ikke) || Character.isDigit(ikke)) {
			}
			else {
				ikkeAlfaNumerisk ++;
			}
		}
		return ikkeAlfaNumerisk;
	}
}
