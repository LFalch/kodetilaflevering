package kodetilaflevering;

public class NextSquare {
    public static void main(String[] args) {
        System.out.print(nextSquare(-8));
    }
    
    public static int nextSquare(int n) {
        //Her laver vi en casting. Det er gjort fordi kvadrartrodden normalt retunere en double
        int h = (int)Math.sqrt(n);
        int g = h+1;
        return(g*g);
//hej
        
    }
    
    
    

}
