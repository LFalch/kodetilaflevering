package kodetilaflevering;

public class NextPrime {

	public static void main (String [] args) {
		System.out.println(isPrime(0));
		System.out.println(nextPrime(-17));
	}

	public static boolean isPrime (int n) {	
		boolean a = false;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
			if (count == 2) {
				a =  true;
			}
			else {
				a = false;
			}
		}
		return a;
	}
	public static int nextPrime (int n) {
		int prime = 0;
		int q =Integer.MAX_VALUE;
		if (n == 0 || n < 0) {
			return 2;
		} else {
			for (int j = n+1; j < q; j++) {
				int count = 0;
				for (int i=2; i <= j/2; i++) {
					if (j%i==0 ) {
						count++;
					}
				}	
				if (count == 0) {
					prime = j;
					break;
				}
			}
			//Problem med prime efter tallet 0, det bliver til 1
			return prime;
		}
	}
}