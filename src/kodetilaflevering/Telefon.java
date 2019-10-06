package kodetilaflevering;

import java.util.Scanner;

public class Telefon {
	public static void main(String[] args) {
		Scanner consol = new Scanner(System.in);
		String n = consol.nextLine();
		
		System.out.print(phoneTestet(n));
		
		
	}

	public static String phoneTestet(String n) {
		int k = n.length();
		String ret = "+45 ";
		String j = "";
		String h = "";
		if(k >= 8) {
			j = n.replaceAll("\\s","");
		}else {
		}
		if(j.startsWith("+45") ) {
			j = j.replaceAll("\\+45", "");
		}else {
			//ret = "Fejl";
		}
		if(j.matches("[0-9]+")) {
			
		}else {
			j = "fegl";
		}
		if(h.length() == 8) {
			
		}else {
			ret = "Fejl";
		}
		

		return j;
	}
}