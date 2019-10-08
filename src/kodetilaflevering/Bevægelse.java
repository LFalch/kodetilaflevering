package kodetilaflevering;
import java.util.Random;
public class Bevægelse {



	public static void main (String [] args) {
		musBevægelse(2);
		katBevægelse(4);
	}

	public static int musBevægelse (int s) {
		for (int i = 0; i <= 10; i++) {
			Random r = new Random();
			int a = r.nextInt(s);
			int x = r.nextInt(s);
			int y = s-x;

			if (x + y == s) {
				int x01 = r.nextInt(4);
				if (x01 == 1 || x01 == 3) {
					x = x * -1;
				} else {
					//x = x;
				}

				int y01 = r.nextInt(4);
				if (y01 == 1 || y01 == 3) {
					y = y * -1;
				} else {
					//y = y;
				}
				System.out.println("x: " + x);
				System.out.println("y: " + y);
				//System.out.println(x01 = r.nextInt(4));
			}
		}
		return s;

	}

	
	public static int katBevægelse (int s) {
		//int n = 24;
		int katx = 0;
		int katy = 0;
		int musx = 12;
		int musy = 12;

		//Kattens Bevægelse
		while (katx != musx && katy != musy) {
			Random r = new Random();
			int x = r.nextInt(s);
			int y = s-x;
			if (katx < musx && katy < musy) {
				katx += x;
				katy += y;
			}  else if (katx > musx && katy < musy) {
				katx -= x;
				katy += y;
			}   else if (katx > musx && katy > musy) {
				katx -= x;
				katy -= y;
			} 	else if (katx < musx && katy > musy) {
				katx += x;
				katy -= y;
			}
			System.out.println(x);
			System.out.println(s-x);
			System.out.println("NÆSTE");
		}
		System.out.println("Catch");
		return s;
	}
	 
}
