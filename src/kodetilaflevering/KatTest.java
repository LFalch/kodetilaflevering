package kodetilaflevering;
import java.util.Random;
public class KatTest {

	public static void main (String [] args) {
		//musBevægelse(2);
		katBevægelse(4);
	}
	//public static int 
	public static int musBevægelse (int s) {
		int musx = 12;
		int musy = 12;
		for (int i = 0; i <= 10; i++) {

			Random r = new Random();

			
			int a = r.nextInt(s);
			int x = r.nextInt(s);
			int y = s-x;

			if (x + y == s) {
				int x01 = r.nextInt(4);
				if (x01 == 1 ) { //x01 == 3) {
					x = x * -1;
				} else {
					//x = x;
				}

				int y01 = r.nextInt(4);
				if (y01 == 1 ) { //y01 == 3) {
					y = y * -1;
				} else {
					//y = y;
				}

				System.out.println("x: " + x);
				System.out.println("y: " + y);
				//System.out.println(x01 = r.nextInt(4));
				musx = musx + x;
				musy = musy + y;
			}
		}
		System.out.println("MUS-X: " + musx);
		System.out.println("MUS-Y: " + musy);

		return s;

	}


	public static int katBevægelse (int s) {
		//int n = 24;
		int katx = 0;
		int katy = 0;
		int musx = 30;
		int musy = 30;

		//Kattens Bevægelse
		while (katx != musx && katy != musy) {
			Random r = new Random();
			int x = r.nextInt(s);
			int y = s-x;
			System.out.println("X: " + x);
			System.out.println("Y: " + y);
			//if (katx)
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
			} else if (katx < musx && katy == musy) {
				katx += x;
			} else if (katx > musx && katy == musy) {
				katx -= x;
			} else if (katx == musx && katy < musy) {
				katy =+ y;
			} else if (katx == musx && katy > musy) {
				katy -= y;
			}
			katx = katx + x;
			katy = katy + y;
			System.out.println(katx);
			System.out.println(katy);
			System.out.println("NÆSTE");
		}

		System.out.println("Catch");
		System.out.println(katx);
		System.out.println(katy);

		return s;
	}

}
