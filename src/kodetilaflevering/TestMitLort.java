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
	 
	 moveKat();
	 
 }
  
 public static boolean tjekParametre(int n, int s, int t) {
	 if(n > 0 || 0 <= s || s <= n || t>=0) {
		 return true;		 
	 }else {
		 return false;
	 }
 }
 
 public static void moveMus(int n, int s, int t, int[] m) {
	 Random randMus = new Random();
	 int dx = randMus.nextInt(s);
	 int dy = s-dx;
	 int o = 0;
	 Random plusMinus = new Random();
		int randMusX = plusMinus.nextInt(1);
		int randMusY = plusMinus.nextInt(1);

		if(randMusX == 0) {
			if(m[0] < dx) {
				m[0] = m[0] - m[0];
				o = dx - m[0];
			}else {
				m[0] = m[0] - dx;
			}
		}else {
			if(m[0] < n)
		}
		if(randMusY == 0) {
			if(m[1] < dy) {
				
			}
		}
	 
	 
	 }
}
 

