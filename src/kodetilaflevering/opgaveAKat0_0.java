package kodetilaflevering;

import java.util.Random;
import java.util.Scanner;
public class opgaveAKat0_0 {

	public static void main(String[] args) {
		// runs a test
		int n = 25;
		int catX = 0;
		int catY = 0;
		int mouseX = 12;
		int mouseY = 12;
		runCatAndMouse(n, catX, catY, mouseX, mouseY);
	}
	// method here
	public static void runCatAndMouse(int n, int catX, int catY, int mouseX,int mouseY) {
		// print user input
		System.out.println(n+" ["+catX+";"+catY+"]"+" ["+mouseX+";"+mouseY+"]");
		int k = 0;
		int bevægelse = 2;
		//Random random = new Random();
		// checks for valid input
		if ( catX < 0 || catY < 0 || mouseX < 0 || mouseY < 0 || n < 0 ||catX > n || catY > n || mouseX > n || mouseY > n) {
			System.out.println("ERROR - must place within positive grid");
		}
		else {
			while ( catX != mouseX || catY != mouseY) {
				Random r = new Random();	

				//int randomint = r.nextInt();
				//Skal have musen til at bevæge sig negativ retning også
				int mX = r.nextInt(2-2)-2;
				int mY = r.nextInt(2-2)-2;
				if (mX < 0) {
					mX = mX * -1;
				}
				if (mY < 0) {
					mY = mY * -1;
				}
				int sum = mX + mY;
				if (sum == 2) {
					int mbevægelseX = mX;
					int mbevægelseY = mY;

					k ++;
					/*int mouseMovement = 2;
						if ( mouseMovement == 1 && mouseX < n) {
							mouseX ++;
						}
						else if ( mouseMovement == 2 && mouseY < n) {
							mouseY ++;
						}
						else if ( mouseMovement == 3 && mouseX > 0) {
							mouseX --;
						}
						else if ( mouseMovement == 4 && mouseY > 0) {
							mouseY --;
						}
					 */
					// cat
					if ( catX < mouseX && catY < mouseY){
						catX += bevægelse;
						catY += bevægelse;
						mouseX += mbevægelseX;
						mouseY += mbevægelseY;
						//Den samlede mængde den bevæger sig skal være 2 i x- og y-retning
					}
					else if ( catX > mouseX && catY > mouseY) {
						catX -= bevægelse;
						catY -= bevægelse;
						mouseX += mbevægelseX;
						mouseY += mbevægelseY;
					}
					else if ( catX < mouseX && catY > mouseY) {
						catX += bevægelse;
						catY -= bevægelse;
						mouseX += mbevægelseX;
						mouseY += mbevægelseY;
					}
					else if ( catX > mouseX && catY < mouseY) {
						catX -= bevægelse;
						catY += bevægelse;
						mouseX += mbevægelseX;
						mouseY += mbevægelseY;
					}/*
						else if ( catX == mouseX+1) {
							catX += bevægelse;
							mouseX += mbevægelseX;
							mouseY += mbevægelseY;
						}
						else if ( catY == mouseY+1) {
							catY += bevægelse;
							mouseX += mbevægelseX;
							mouseY += mbevægelseY;
						}
						else if ( catX == mouseX-1) {
							catX -= bevægelse;
							mouseX += mbevægelseX;
							mouseY += mbevægelseY;
						}
						else if ( catY == mouseY-1) {
							catY -= bevægelse;
							mouseX += mbevægelseX;
							mouseY += mbevægelseY;
						}
						else if ( catX < mouseX) {
							catX += bevægelse;
							mouseX += mbevægelseX;
							mouseY += mbevægelseY;
						}
						else if ( catY < mouseY) {
							catY +=bevægelse;
							mouseX += mbevægelseX;
							mouseY += mbevægelseY;
						}
						else if ( catX > mouseX) {
							catX -= bevægelse;
							mouseX += mbevægelseX;
							mouseY += mbevægelseY;
						}
						else if ( catY > mouseY) {
							catY -= bevægelse;
							mouseX += mbevægelseX;
							mouseY += mbevægelseY;
						} */
					System.out.println("move "+k+" ["+catX+";"+catY+"]"+" ["+mouseX+";"+mouseY+"]");
				}
				System.out.println("Catch");
			}
		}
	}
}
