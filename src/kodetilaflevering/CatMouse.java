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
		int n = 30;
		int s = 5;
		int t = 100;
		
		runSimulation(n, s, t);


		
	}

	public static void runSimulation(int n, int s, int t) {
		
		//få p til at beskrive musens start pos, det vil sige n/2, eller den nærmeste helr int. vi skal lige beslutte om den skal gå op eller ned
		int p = n/2;


		int kat[] = new int[2];
		int mus[] = new int[2];
		
		kat[0]=0;
		kat[1]=0;
		
		mus[0]=p;
		mus[1]=p;
		
		/*for(int r = 0; r != 10; r++) {
			Random movingMus = new Random();
			int musMoveX = movingMus.nextInt(s);
			int musMoveY = s-musMoveX;
			
			mus[0] = mus[0] + musMoveX;
			mus[1] = mus[1] + musMoveY;
			for(int i : mus) {
				System.out.print(i);
			}
			System.out.println("");
			
		}*/

		while(kat[0] != mus[0] && kat[1] != mus[1]) {
			Random movingMus = new Random();
			int musMoveX = movingMus.nextInt(s);
			int musMoveY = s-musMoveX;
			
			mus[0] = mus[0] + musMoveX;
			mus[1] = mus[1] + musMoveY;
			
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
			
			//for(int i : mus) {
			//	System.out.println(i);
			//}
			
			//System.out.println(musMoveX);
			//System.out.println(musMoveY);

			
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
	}
}


