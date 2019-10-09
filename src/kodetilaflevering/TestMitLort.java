package kodetilaflevering;

import java.util.Random;

public class TestMitLort {
	public static void main(String[] args) {
		int n = 30;
		int s = 5;
		int t = 100;

		runSimulation(n, s, t);
	}

	public static void runSimulation(int n, int s, int t) {
		System.out.printf("n=%d s=%d t=%d\n", n, s, t);

		if (!tjekParametre(n, s, t)) {
			System.out.println("Illegal Parameters!");
			return;
		}
		int p = n / 2;

		int kat[] = {0, 0};
		int mus[] = {p, p};
		
		for (int i = 0; i < t; i++) {
			System.out.printf("[%d;%d] [%d;%d]\n", mus[0], mus[1], kat[0], kat[1]);
			if (kat[0] == mus[0] && kat[1] == mus[1]) {
				System.out.println("Catch!");
				return;
			}

			moveMus(n, s, mus);
			moveKat(n, s, mus, kat);
		}
	}

	public static boolean tjekParametre(int n, int s, int t) {
		if (n > 0 && 0 <= s && s <= n && t >= 0) {
			return true;
		} else {
			return false;
		}
	}
	private static int randomInt(Random r, int min, int max) {
		return r.nextInt(max + 1 - min) + min;
	}

	public static void moveKat(int n, int s, int[] m, int[] k) {
		// Vi går gennem hver koordinat og ændrer s for at vise hvor mange "move points" der er tilbage.
		for (int i = 0; i < k.length; i++) {
			// Vi gider ikke gøre noget, hvis de to koordinater allerede er ens
			if (k[i] != m[i]) {
				// Vi finder så forskellen på de to koordinater
				int d = m[i] - k[i];
				// Hvis denne forskel er større end det antal moves vi har tilbage
				// Gør vi d lige så stor som s
				if (Math.abs(d) > s) {
					// d altså ligemed s men hvor vi bevarer ds fortegn
					// Sådan at vi beholder retningen
					d = Integer.signum(d) * s;
					// Nu er der ikke flere moves tilbage
					s = 0;
				} else {
					// Træk det antal moves vi bruger nu fra s, så næste koordinat 
					// ved hvor mange moves, der er tilbage
					s -= Math.abs(d);
				}
				// Ændr nuværende koordinat
				k[i] += d;
			}
			// Hvis vi ikke har flere moves tilbage, så bare break
			if (s <= 0) break;
		}
	}

	// n er bredden og højden på griddet, `s` antal spaces den skal move, `t` er antal iterations
	public static void moveMus(int n, int s, int[] m) {
		Random r = new Random();

		int minX = Math.max(0, m[0]-s);
		int maxX = Math.min(n-1, m[0]+s);
		// Musen bevæger sig en tilfældig afstand i x.
		int dx = randomInt(r, minX, maxX)-m[0];

		int remainingS = s - Math.abs(dx);
		// musen bevæger sig altid s, så den afstand som den skal bevæge sig i y, er
		int dy;
		if (remainingS > m[1]) {
			dy = remainingS;
		} else if (remainingS + m[1] > n - 1) {
			dy = -remainingS;
		} else {
			dy = remainingS;
			// Randomly make negative
			if (r.nextBoolean()) {
				dy = -dy;
			}
		}
		m[0] += dx;
		m[1] += dy;
	}
}
