package kodetilaflevering;

import java.util.Scanner;

public class NextSquare {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
        System.out.print(nextSquare(n));
    }
    
    public static int nextSquare(int n) {
    	if (n < 0) {
    		int h = (int)Math.sqrt(n*-1);
    		int g = h+1;
    		return(g*g);
    	}
        //Her laver vi en casting. Det er gjort fordi kvadrartrodden normalt retunere en double
        int h = (int)Math.sqrt(n);
        int g = h+1;
        return(g*g);

        
    }
}
