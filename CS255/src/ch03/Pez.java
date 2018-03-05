/**
 * 
 */
package ch03;
import ch03.stacks.*;
import java.util.Scanner;
/**
 * @author Steve Cardone
 * 
 * This Class simulates a pez dispenser using the ArrayStack.
 *
 */
public class Pez {

	 // I made this ArrayStack at class level so i can use it in other methods.
	static ArrayStack<String> myPez = new ArrayStack<String>();

	public static void main(String[] args) {
		
		// fill my pez dispensor
		populatePez();
		
		do {
			// List what is in pez dispenser
			System.out.println("Contents (Bottom to Top): " + myPez.toString());
			// let user choose what color they want.
			String userChoice = getUserChoice();
			System.out.println();
			
			// determine if that color piece exists in the dispenser
			if (getPieceLocation(userChoice) == -1) {
				System.out.println("There are no more pieces of that color");
			} else {
				// If the piece is in dispensor, pull that piece out
				pullPice(getPieceLocation(userChoice));
				
				System.out.println("Here is your " + userChoice + " piece.");
			}
			
			
		} while (!myPez.isEmpty());
		
		System.out.println();
		System.out.println("There are no more pieces of Pez in your Dispensor!");

	}

	private static String getUserChoice() {
		
		Scanner s = new Scanner(System.in);
		String choice = "";
		System.out.print("Please type the color of pez you want: ");
		choice = s.nextLine();
		choice.toLowerCase();
		return choice;
	}

	private static void populatePez() {
		myPez.push("red");
		myPez.push("blue");
		myPez.push("yellow");
		myPez.push("red");
		myPez.push("orange");
		myPez.push("yellow");
		myPez.push("blue");
		myPez.push("purple");
		myPez.push("orange");
		myPez.push("yellow");		
	}
	
	public static int getPieceLocation(String color) {
		
		int colorLocation = -1;
		for (int x = 1 ; x <= myPez.getTopIndex()+1 ; x++) {
			// if the color of piece at x location equals the color from user then return that location
			if(myPez.inspector(x).equals(color)) {
				colorLocation = x;
				return colorLocation;
			}
		}

			return colorLocation;
	
	}
	
	
	private static void pullPice(int loc) {

		
		// ** I would like to use the popSome() method from arraySatck class but can't because i wouldn't be
		//able to recover the pieces that get poped off. Therefore I use the code below.
		
		String topOfStack = null;
		ArrayStack<String> tempStack = new ArrayStack<String>();
		
				// pop off pieces of pez and put them into a temp stack.
				for (int x = 1 ; x <= loc ; x++){
					topOfStack = myPez.top();
					myPez.pop();
					
					tempStack.push(topOfStack);
				  
				}
			  
				for(int x = 1 ; x <= loc-1 ; x++){
					// pop the first one off because this is the piece of pezz the user eats
					// so we dont put it back in.
					if (x == 1) {
						tempStack.pop();
					}
					
					// add the rest of the pieces the user doesn't eat back in the stack.
					String addBack = tempStack.top();
					myPez.push(addBack);
					tempStack.pop();
				}
			
	}

}
