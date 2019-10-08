package kodetilaflevering;

import java.util.Scanner;
//AFVIS HVIS IKKE RIGTIG LÆNGDE
public class cprNummer {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		if (erbogstav (s) > 1) {
			System.out.println("ikke et cprnummer");	
		} else if (datoOgMåned(s) == false) {
			System.out.println("ikke et cprnummer");
		} else if (datoOgMåned (s) == true) {
			String lige = s.substring(9);
			int liget = Integer.parseInt(lige);
			int ulige = liget % 2;
			if (ulige == 0) {
				System.out.print("lige cprnummer");
			} else if (ulige != 0){
				System.out.print("ulige cprnummer");
			} else if (s.length() > 10 || s.length() < 10){
				System.out.println("ikke et cprnummer");
			} else {
				System.out.println("ikke et cprnummer");
			}
		}
	}
	public static int erbogstav (String s) {
		int erbogstav = 0;
		for (int i = 0; i < s.length(); i++) {
			char bogstav = s.charAt(i);
			if (Character.isLetter(bogstav)) {
				erbogstav ++;
			}
		}
		return erbogstav;
	}
	public static boolean datoOgMåned (String s) {

		String dd = s.substring(0,2);
		String mm = s.substring(2,4);
		int mmt = Integer.parseInt(mm);
		int ddt = Integer.parseInt(dd);

		if (ddt < 1 || mmt < 1) {
			return false;
		} else if(mmt == 1 & ddt <= 31) {
			return true;
			//Måned 01 Dato = 1-31
		} else if (mmt == 2 & ddt <= 28) {
			return true;
			//Måned 02 Dato = 1-28
		} else if (mmt == 3 & ddt <= 31) {
			return true;
			//Måned 03 Dato = 1-31
		} else if (mmt == 4 & ddt <= 30) {
			return true;
			//Måned 04 Dato = 1-30
		} else if (mmt == 5 & ddt <= 31) {
			return true;
			//Måned 05 Dato = 1-31
		} else if (mmt == 6 & ddt <= 30) {
			return true;
			//Måned 06 Dato = 1-30
		} else if (mmt == 7 & ddt <= 31) {
			return true;
			//Måned 7 Dato = 1-31
		} else if (mmt == 8 & ddt <= 31) {
			return true;
			//Måned 8 Dato = 1-31
		} else if (mmt == 9 & ddt <= 30) {
			return true;
			//Måned 9 Dato = 1-30
		} else if (mmt == 10 & ddt <= 31) {
			return true;
			//Måned 10 Dato = 1-31
		} else if (mmt == 11 & ddt <= 30) {
			return true;
			//Måned 11 Dato = 1-30
		} else if (mmt == 12 & ddt <= 31) {
			return true;
			//Måned 12 Dato = 1-31
		} else {
			return false;
		}
	}
}