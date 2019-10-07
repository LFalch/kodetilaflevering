package kodetilaflevering;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NextSquare {
	public static void main(String[] args) {
		try {
			System.out.println("Indtast et tal, og se det dobbelte produkt af det næste hele tal:");
			Scanner console = new Scanner(System.in);
			int n = console.nextInt();
			console.close();
			System.out.print(nextSquare(n));
		}
		catch (InputMismatchException exception)
		{
			System.out.println("Dette er ikke et heltal");
		}
	}

	public static int nextSquare(int n) {
		/*if (n < 0) {
			int h = (int)Math.sqrt(n);
			int g = h+2;
			return(g*g);
		}*/
		//Her laver vi en casting. Det er gjort fordi kvadrartrodden normalt retunere en double
		int h = (int)Math.sqrt(n);
		int g = h+1;
		return(g*g);
	}
}
