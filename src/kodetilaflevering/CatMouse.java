package kodetilaflevering;

import java.util.Scanner;
import java.util.Random;

public class CatMouse {
	public static void main(String[] args) {
		/*Scanner consol = new Scanner(System.in);
		int n = consol.nextInt();
		consol.close();
		Random tilfeld = new Random();
		 */
		int n = 30; //gridsize
		int s = 5;  //antal moves
		int t = 100;

		runSimulation(n, s, t);
	}

	//public static String(int n, int s, int t) {

	//}

	public static void runSimulation(int n, int s, int t) {
		//tjekParametre(n, s ,t);

		//få p til at beskrive musens start pos, det vil sige n/2, eller den nærmeste helr int. vi skal lige beslutte om den skal gå op eller ned
		int p = n/2;

		int kat[] = new int[2];
		int mus[] = new int[2];

		kat[0]=0;
		kat[1]=0;

		mus[0]=p;
		mus[1]=p;

		//for(int r = 0; r != 100; r++) {
		while( (kat[0] != mus[0] || kat[1] != mus[1])) {
			Random movingMus = new Random();

			int musMoveX = movingMus.nextInt(s);
			int musMoveY = s-musMoveX;

			Random movingKatX = new Random();
			int katMoveX = s-movingKatX.nextInt(s);
			Random movingKatY = new Random();
			int katMoveY = movingKatY.nextInt(katMoveX);

			Random plusMinus = new Random();
			int randMusX = plusMinus.nextInt(1);
			int randMusY = plusMinus.nextInt(1);

			if(randMusX == 0 ) {
				//		if()
				mus[0] = mus[0] + musMoveX;
			}else {
				mus[0] = mus[0] - musMoveX;
			}

			if(randMusY == 0) {
				mus[1] = mus[1] + musMoveY;
			}else {
				mus[1] = mus[1] - musMoveY;
			}
			int dX = mus[0] - kat[0];
			if(dX < s) {
				s = dX;
			}else {
				s = s;
			}



			int g = 0;
			int h = 0;
			System.out.println("S:" + s);
			if(dX == 0) {
				kat[0] = kat[0];
				g = s;
			}else if(dX < 0){
				Random katten = new Random();
				if(dX<0) {
					int v = dX * (-1);
				}
				int bevegelseKatten = katten.nextInt(s);
				if(bevegelseKatten > kat[0]) {
					kat[0] = kat[0] - kat[0];
				}else {
					kat[0] = kat[0] - bevegelseKatten;
					g = s - bevegelseKatten;
				}
			}else {
				Random katten = new Random();
				int bevegelseKatten = katten.nextInt(s);
				kat[0] = kat[0] + bevegelseKatten;
				g = s - bevegelseKatten;
			}
			System.out.println(dX);

			int dY = mus[1] - kat[1];
			if(dY == 0) {
				kat[1] = kat[1];
			}else if(dY < 0) {
				if(g > kat[1]) {
					kat[1] = kat[1] - kat[1];
				}else {
					kat[1] = kat[1] - g;
				}
			}else {
				kat[1] = kat[1] + g;
			}

			if(mus[0] > n) {
				mus[0] = n;
			}
			if(mus[1] > n) {
				mus[1] = n;
			}
			if(kat[0] > n) {
				kat[0] = n;
			}
			if(kat[1] > n) {
				kat[1] = n;
				//mus[1] = mus[1] + musMoveY;
			}
			for(int i : mus) {
				System.out.print("m"+i);
			}
			System.out.println("");
			for(int i : kat) {
				System.out.print("k"+i);
			}
			System.out.println();
		}
		System.out.print("Catch");
		/*	while(kat[0] != mus[0] && kat[1] != mus[1]) {
			Random movingMus = new Random();
			int musMoveX = movingMus.nextInt(s);
			int musMoveY = s-musMoveX;

			Random movingKat = new Random();
			int katMoveX = movingKat.nextInt();
			int katMoveY = s-katMoveX;

			mus[0] = mus[0] + musMoveX;
			mus[1] = mus[1] + musMoveY;

			kat[0] = kat[0] + katMoveX;
			kat[1] = kat[1] + katMoveY;

			if(mus[0] > n) {
				mus[0] = n;
			}
			if(mus[1] > n) {
				mus[1] = n;
			}
			if(kat[0] > n) {
				kat[0] = n;
			}
			if(kat[1] > n) {
				kat[1] = n;
			}
		 */

		/*for(int i : mus) {
				System.out.println(i);
			}

			System.out.println(musMoveX);
			System.out.println(musMoveY);
		 */

	}
}	

/*System.out.print(p);
		for(int i : mus) {
			System.out.println(i);
		}

		for(int i : kat) {
			System.out.println(i);
		}
 */
//if()

/*int[][] gitter = new int[n][n];
		for(int y=0; y<n; y++) {
			for(int x=0; x<n; x++) {
				gitter[x][y] = 0;
			}
		}
		for(int i = 0; i < n; i++) {
			int grid = 0;
			for(int f = 0; f < n; f++) {
				grid= gitter[f][i];
			}
			System.out.println(grid);
		}*/



