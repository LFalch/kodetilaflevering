package kodetilaflevering;

import java.util.Scanner;

public class Telefon {
	public static void main(String[] args) {
		Scanner consol = new Scanner(System.in);
		String n = consol.next();
		int k = n.length();
		//int i;
		if(k >= 8) {
			String j = n.replaceAll("hej","din mor");
			System.out.print(j);
		}
		System.out.println(n.startsWith("+45"));
		
		
		
		/*
		for (i = 0; i < k; i++) {
			char c = n.charAt(i);
			boolean b = n.contentEquals("+45");
			System.out.println(c);
			System.out.print(b);
		}*/
		
		phoneTestet(n);
		
		
	}

	public static String phoneTestet(String n) {
		
		int length = n.length();
		System.out.print(length);
		
		
		
		String h = "Hej";
		return(h);
	}
}