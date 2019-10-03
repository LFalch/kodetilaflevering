package kodetilaflevering;

public class NextSquare {
    public static void main(String[] args) {
        System.out.print(nextSquare(-16));
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
//hej
        
    }
    
    
    

}
