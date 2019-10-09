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
	 tjekParametre(n, s, t);
	 
	 int kat[] = new int[2];
	 int mus[] = new int[2];
	 
	 int p = n/2;
	 
		kat[0]=0;
		kat[1]=0;
		
		mus[0]=p;
		mus[1]=p;
	 
	 moveMus(n, s, t, mus);
	 
	// moveKat();
	 
 }
  
 public static boolean tjekParametre(int n, int s, int t) {
	 if(n > 0 || 0 <= s || s <= n || t>=0) {
		 return true;		 
	 }else {
		 return false;
	 }
 }
 
 public static void moveMus(int n, int s, int t, int[] m) {
	 for(int i = 0; i != 100; i++) {
		 Random randMus = new Random();
		 int dx = randMus.nextInt(s+1); //Musen bevæger sig en tilfældig afstand i x.
		 int dy = s-dx; //musen bevæger sig altid s, så den afstand som den skal bevæge sig i y, er resten af stykket fra x.
		 int o = 0; //overflow variabel for x til y.
		 int OY = 0; // overflow variabel fra y til x.
		 int p = n/2; //vi laver igen en p.
		 
		 //vi gør det tilfældigt om musen bevæger sig pos eller neg i y og x
		 Random plusMinus = new Random();
			int randMusX = plusMinus.nextInt(4);
			int randMusY = plusMinus.nextInt(4);
			
			//nu bestemmer vi hvilken retning musen skal bevæge sig, alt efeter hvad tilfædigheden gav
			if(randMusX == 1 || randMusX == 3) {
				//vi kan få tallene 0 og 1, så hvis den er nul, bevæger musen sig neg x, vi tjekker først,
				//om den afstand som musen VIL bevæge sig i x, er større end den afstan som den har hen til
				//kanten, den vil sige dens x-koordinat
				if(m[0] < dx) {
					//den kan så kun bevæge sig sin egen afstand
					m[0] = m[0] - m[0];
					//vi har så en rest, som er den afstand den nu 	SKAL bevæge sig ekstra i y
					o = dx - m[0];
				}else {
					m[0] = m[0] - dx;
					o = 0;
				}
			}else {
				if(m[0] < n) {
					int e = n - m[0];
					if(e < dx) {
						m[0] = m[0] + e;
						o = dx - e;
					}else {
						m[0] = m[0] + dx;
						o = 0;
					}
				}
			}
			//vi siger nu at den afstand som musen kan bevæge sig, må være dy + o
			dy = dy + o;
			
			if(randMusY == 0) {
				if(m[1] < dy) {
					m[1] = m[1] - m[1];
					OY = dy - m[1];
					if(m[0] > p) {
						m[0] = m[0] - OY;
					}else {
						m[0] = m[0] + OY;
					}
				}else {
					m[1] = m[1] - dy;
					OY = 0;
				}
			}else {
				if(m[1] < n) {
					int w = n -m[1];
					if(w < dy) {
						m[1] = m[1] + w;
						OY = dy - w;
						if(m[1] > p) {
							m[1] = m[1] - OY;
						}else {
							m[1] = m[1] + OY;
						}
					}else {
						m[1] = m[1] + dy;
						OY = 0;
					}
				}
			}
		 for(int x : m) {
			 System.out.print(x + " ");
		 }
		 System.out.println("");
		 }
	 }
	 
}
 

