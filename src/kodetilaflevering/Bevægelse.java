package kodetilaflevering;
import java.util.Random;
public class Bevægelse {



	public static void main (String [] args) {
		int n = 24;
		int katx = 0;
		int katy = 0;
		int musx = 12;
		int musy = 12;
		int s = 4;

		//Random r = new Random();
		//int x = r.nextInt(s);
		while (katx != musx && katy != musy) {
			Random r = new Random();
			int x = r.nextInt(s);
			if (katx < musx && katy < musy) {
				katx += x;
				katy += s-x;
			}  else if (katx > musx && katy < musy) {
				katx -= x;
				katy += s-x;
			}   else if (katx > musx && katy > musy) {
				katx -= x;
				katy -= s-x;
			} 	else if (katx < musx && katy > musy) {
				katx += x;
				katy -= s-x;
			}
			System.out.println(x);
			System.out.println(s-x);
			System.out.println("NÆSTE");
		}
		System.out.println("Catch");
	}
}
