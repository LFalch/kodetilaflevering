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
			n = n.replaceAll("\\s","");
		}else {
			return "fejl";
		}
		if(n.startsWith("+45") ) {
			n = n.replaceAll("\\+45", "");
		}else {
		}
		if(n.startsWith("0")) {
			return "fejl";
		}
		if(n.matches("[0-9]+")) {
			
		}else {
			return "fejl";
		}
		if(n.length() == 8) {
			
		}else {
			return "fejl";
		}
		

		return "+45 "+n;
	}
}