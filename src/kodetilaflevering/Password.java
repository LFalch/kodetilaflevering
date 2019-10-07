package kodetilaflevering;

import java.util.Scanner;
public class Password {

	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter your password: ");
		String s = scan.nextLine();
		int length = s.length();
		int tal = 0;
		int småBogstav = 0;
		int storeBogstav = 0;
		int count = 0;
		int ikkeAlfa = 0;
		char ch;

		if (length >= 7)
		{
			while (count < length)
			{
				ch = s.charAt(count);
				if (Character.isDigit(ch)) {
					tal = tal + 1;
				}
				if (Character.isLowerCase(ch)) {
					småBogstav = småBogstav + 1;
				}
				if (Character.isUpperCase(ch)) {				
					storeBogstav = storeBogstav + 1;
				}
				if (s.matches("^[a-zA-Z0-9]+$")) {
					ikkeAlfa = ikkeAlfa + 1;
				}
				count = count + 1;
			}
		}
		if (length < 7) {
			System.out.println("unacceptable");
		} else {
			if (length == 7 && småBogstav >=1 && storeBogstav >= 1 && ikkeAlfa >= 1) {
				System.out.println("acceptable");
			} else { 
				if (length == 8 && småBogstav >=1 && storeBogstav >= 1 && ikkeAlfa >= 1) {
					System.out.println("acceptable");
				} else {
					if (length >=9 && småBogstav >=1 && storeBogstav >= 1&& ikkeAlfa >= 1) {
						System.out.println("strong");
					}
				}
			}
		}
	}
}
//Der skal fikses så der tages højde for ikke alfanumerisk
//Fix input ved kode som: ABCD!#$&