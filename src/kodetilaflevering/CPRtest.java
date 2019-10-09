package kodetilaflevering;

import java.util.Scanner;

public class CPRtest {
	public static void main (String [] args) {
		tjek("Din mor");
	}
	public static boolean tjek(String a) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		//CPR-nummer består af 10 tal, DDMMÅÅ-4tal
		//int mm = n.substring(0,2); 

		String mm = s.substring(0,2);
		System.out.println(mm);
		String dd = s.substring(2,4);
		System.out.println(dd);
		String year = s.substring(4,6);
		System.out.println(year);
		String last = s.substring(6,10);
		System.out.println(last);

		int mmt = Integer.parseInt(mm);
		int ddt = Integer.parseInt(dd);
		int yeart = Integer.parseInt(year);
		int lastt = Integer.parseInt(last);


		if (mmt == 01 & ddt >= 1 & ddt <= 31) {
			System.out.print("Januar");
			//Måned 01 Dato = 1-31) {
		} else if (mmt == 02 & ddt >= 1 & ddt <= 28) {
			System.out.print("Februar");
			//Måned 02 Dato = 1-28 {
		} else if (mmt == 03 & ddt >= 1 & ddt <= 31) {
			System.out.print("Marts");
			//Måned 03 Dato = 1-31) {
		} else if (mmt == 04 & ddt >= 1 & ddt <= 30) {
			System.out.print("April");
			//Måned 04 Dato = 1-30) {
		} else if (mmt == 05 & ddt >= 1 & ddt <= 31) {
			System.out.print("Maj");
			//Måned 05 Dato = 1-31)) {
		} else if (mmt == 06 & ddt >= 1 & ddt <= 30) {
			System.out.print("Juni");
			//Måned 06 Dato = 1-30)) {
		} else if (mmt == 07 & ddt >= 1 & ddt <= 31) {
			System.out.print("Juli");
			//Måned 7 Dato = 1-31)) {
		} else if (mmt == 8 & ddt >= 1 & ddt <= 31) {
			System.out.print("August");
			//Måned 8 Dato = 1-31)) {
		} else if (mmt == 9 & ddt >= 1 & ddt <= 30) {
			System.out.print("September");
			//Måned 9 Dato = 1-30)) {
		} else if (mmt == 10 & ddt >= 1 & ddt <= 31) {
			System.out.print("Oktober");
			//Måned 10 Dato = 1-31)) {
		} else if (mmt == 11 & ddt >= 1 & ddt <= 30) {
			System.out.print("November");
			//Måned 11 Dato = 1-30)) {
		} else if (mmt == 12 & ddt >= 1 & ddt <= 31) {
			System.out.print("December");
			//Måned 12 Dato = 1-31)){
		} else {
			System.out.print("ikke et cprnummer");
			return false;
		}
		
		String lige = s.substring(10);
		int liget = Integer.parseInt(lige);
		int ulige = liget % 2;
		if (ulige == 0) {
			System.out.print("lige");
		} else {
			System.out.print("ulige");
		}
		return true;
	}
}