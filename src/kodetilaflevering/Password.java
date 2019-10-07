package kodetilaflevering;

import java.util.Scanner;
public class Password {

	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		/*int småBogstav = 0;
		int storeBogstav = 0;
		int Num = 0;
		int ikkeAlfa = 0; */

		if (s.length() <= 9 && småBogstav >= 1 && storeBogstav >= 1 && Num >= 1 && ikkeAlfa >= 1) {
			System.out.print("strong");
		} else if (s.length() == 8 && småBogstav >= 1 && storeBogstav >= 1 && Num >= 1 && ikkeAlfa >= 1) {
			System.out.print("acceptable");
		} else if (s.length() == 7 && småBogstav >= 1 && storeBogstav >= 1 && Num >= 1 && ikkeAlfa >= 1) {
			System.out.print("acceptable");
		} else if (s.length() <7) {
			System.out.print("unacceptable");
		}	
	}

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

	public static int ikkeAlfaNumerisk (String s) {
		int ikkeAlfa = 0;
		for (int i = 0; i < s.length(); i++) {
			char ikke = s.charAt(i);
			if (Character.isDigit(ikke) || Character.isDigit(ikke)) {

			}
			else {
				ikkeAlfa ++;
			}
		}
		return ikkeAlfa;
	}

	/*public static String tjekStyrke (String s) {
		if (s.length() <= 9 && småBogstav >= 1 && storeBogstav >= 1 && Num >= 1 && ikkeAlfa >= 1) {
			System.out.print("strong");
		} else if (s.length() == 8 && småBogstav >= 1 && storeBogstav >= 1 && Num >= 1 && ikkeAlfa >= 1) {
			System.out.print("acceptable");
		} else if (s.length() == 7 && småBogstav >= 1 && storeBogstav >= 1 && Num >= 1 && ikkeAlfa >= 1) {
			System.out.print("acceptable");
		} else if (s.length() <7) {
			System.out.print("unacceptable");
		}	
		return s;
	} */
}