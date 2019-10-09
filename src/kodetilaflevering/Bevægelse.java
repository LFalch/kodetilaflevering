package kodetilaflevering;
import java.util.Random;
public class Bevægelse {



	public static void main (String [] args) {
		int s = 4;
		katBevægelse(s);
	}

	/*
	public static int musBevægelse (int s) {
		//for (int i = 0; i <= 10; i++) {
		int n = 30;

		Random r = new Random();
		//int a = r.nextInt(s);
		int x = r.nextInt(s);
		int y = s-x;
		int musx = (n/2);
		int musy = (n/2);
		int x01 = r.nextInt(4); 
		if (x01 == 1 || x01 == 3) {
			x = x * -1;
		} else {
		}

		int y01 = r.nextInt(4);
		if (y01 == 1 || y01 == 3) {
			y = y * -1;
		} else {
		}
		musx += x;
		if (musx >= n) {
			musx = n;
		}
		musy += y;
		if (musy >= n) {
			musy = n;
		}
		if (musx <= 0) {
			musx = 0;
		}
		if (musy <= 0) {
			musy = 0;
		}
		/*System.out.println("x: " + x);
			System.out.println("y: " + y);
			System.out.println("x: " + musx);
			System.out.println("y: " + musy);
			System.out.println(x01 = r.nextInt(4));
	//}
	//System.out.println("x: " + musx);
	//System.out.println("y: " + musy);
	//}

	return s;
*/


	public static int katBevægelse (int s) {
		int n = 30;

		Random r = new Random();
		//int a = r.nextInt(s);
		int x = r.nextInt(s);
		int y = s-x;
		int musx = (n/2);
		int musy = (n/2);
		int katx = 0;
		int katy = 0;
		double s2 = s/2;
		int dx = musx - katx;
		int dy = musy - katy;

		while (katx != musx || katy != musy) {
			int x01 = r.nextInt(4); 
			if (x01 == 1 || x01 == 3) {
				x = x * -1;
			} else {
			}

			int y01 = r.nextInt(4);
			if (y01 == 1 || y01 == 3) {
				y = y * -1;
			} else {
			}
			musx += x;
			if (musx >= n) {
				musx = n;
			}
			musy += y;
			if (musy >= n) {
				musy = n;
			}
			if (musx <= 0) {
				musx = 0;
			}
			if (musy <= 0) {
				musy = 0;
			}

			//Kattens bevægelse hvis tæt på
			int xk = r.nextInt(s);
			int yk = s-x;

			if (dx <= 1 && dy <= 1) {
				katx += 1;
				katy += 1;
			} else if (dx <= s2 && dy > s2) {
				katx += 1;
				katy += yk;
			} else if (dx > s2 && dy <= 2) {
				katx += xk;
				katy += 1;
			}

			if (dx <= s2 && dy <= s2) {
				katx += dx;
				katy += dy;
			} else if (dx <= s2 && dy > s2) {
				katx += dx;
				katy += yk;
			} else if (dx > s2 && dy <= 2) {
				katx += xk;
				katy += dy;
			} else {

				//Kattens Bevægelse

				if (katx < musx && katy < musy) {
					katx += xk;
					katy += yk;
				}  else if (katx > musx && katy < musy) {
					katx -= xk;
					katy += yk;
				}   else if (katx > musx && katy > musy) {
					katx -= xk;
					katy -= yk;
				} 	else if (katx < musx && katy > musy) {
					katx += xk;
					katy -= yk;
				} else if (katx < musx && katy == musy) {
					katx += xk;
				} else if (katx > musx && katy == musy) {
					katx -= xk;
				} else if (katx == musx && katy < musy) {
					katy += yk;
				} else if (katx == musx && katy > musy) {
					katy -= yk;
				}
			}
		}
		System.out.println("musx: " + musx);
		System.out.println("musy: " + musy);
		System.out.println("katx: " + katx);
		System.out.println("katy: " + katy);
		System.out.println("Catch");
		return s;
	}
}
