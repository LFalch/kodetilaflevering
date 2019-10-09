package kodetilaflevering;
//Vi importerer scanner biblioteket 
import java.util.Scanner;

//lav klassen og main fuktionen
public class Telefon {
	public static void main(String[] args) {
		Scanner consol = new Scanner(System.in);
		String n = consol.nextLine();
		consol.close();
		//kalder funktionen phoneTestet. med en string n.
		System.out.print(phoneTestet(n));
		
	}

	public static String phoneTestet(String n) {
		//vi indf�rer en variable for l�ngden af n, vi bruger kun den her �n gang, s� det er lidt overfl�digt.
		//Det f�r det f�rste if-statement til at se lidt p�nere ud, men...
		int k = n.length();
		//vi tjekker om l�ngden er mere end eller lig med 8, hvis den er, s� fjerner vi alt whitespace, det vil sige mellemrum osv.
		if(k >= 8) {
			n = n.replaceAll("\\s","");
		}else {
			//Hvis den er mindre end 8, kan vi allerede konkludere nu, at det ikke er et dansk-telefonnummer
			return "fejl";
		}
		//vi kigger om stringen nu starter med +45, og s� fjerner vi det
		if(n.startsWith("+45") ) {
			n = n.replaceAll("\\+45", "");
		}
		//Vi kigger p� om det starter med 0
		if(n.startsWith("0")) {
			return "fejl";
		}
		//vi unders�ger om stringen indeholder andet end tal nu
		if(n.matches("[0-9]+")) {
		}else {
			return "fejl";
		}
		//nu burde l�ngden kun v�re 8, s� det tjekker vi lige
		if(n.length() == 8) {
		}else {
			return "fejl";
		}
		//Funktionen ville stoppe, s� snart den kommer til et "return", s� hvis den ikke er stoppet...
		//...ved vi at det m� v�re et dansk telefonnummer. Vi kan nu retunerer det �nskede resultat.

		return "+45 "+n;
	}
}