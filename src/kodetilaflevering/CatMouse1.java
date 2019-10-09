package kodetilaflevering;
import java.util.Random;
public class CatMouse1 {

	public static void main (String [] args) {
		int n = 4;
		int s = 2;
		int t = 80;		

		runRandomSimulation(n,s,t);

	}

	public static boolean parametertjek (int n, int s, int t) {
		if (n > 0 && s >=0 && s <= n && t > 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void runRandomSimulation (int n, int s, int t) {
			System.out.println("n=" + n + " s=" + s + " t=" + t);
			if (parametertjek(n,s,t) == true) {
				
			Random r = new Random();

			int musx = (n/2);
			int musy = (n/2);
			int katx = 0;
			int katy = 0;
			double s2 = s/2;
			int dx = musx - katx;
			int dy = musy - katy;

			System.out.println("[" + musx + ";" + musy + "]  [" + katx + ";" + katy + "]");
			
			for (int i = 0; i <= t; i++) {
				int x = r.nextInt(s);
				int y = ((s)-x);
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
				if (musx >= n-1) {
					musx = n-1;
				}
				musy += y;
				if (musy >= n-1) {
					musy = n-1;
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
				System.out.println("[" + musx + ";" + musy + "]  [" + katx + ";" + katy + "]");
				if (katx == musx && katy == musy) {
					System.out.println("Catch!");
					break;
				}
			}
		} else {
			System.out.println("Illegal Parameters!");
		}
	}
}