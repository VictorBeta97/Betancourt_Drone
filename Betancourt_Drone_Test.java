//Author Name: Victor Betancourt
//Date: 5/17/2020
//Program Name: Betancourt_Drone
//Purpose: Simulation using button, drone movement in x,y,z location
package Drone;
import java.util.Scanner;
public class Betancourt_Drone_Test {

	public static void main(String[] args) {
		//creating a drone
		Betancourt_Drone drone = new Betancourt_Drone();
		
		//setting up a Scanner
		Scanner input = new Scanner(System.in);
		String ch = "";
		
		//looping until user chooses to exit
		while(!ch.equalsIgnoreCase("H")) {
			//displaying the menu
			System.out.println("Which direction would you like to move the drone?");
			System.out.println("A - Move Up");
			System.out.println("B - Move Down");
			System.out.println("C - Move Forward");
			System.out.println("D - Move Backward");
			System.out.println("E - Turn Left");
			System.out.println("F - Turn Right");
			System.out.println("G - Display Navigation");
			System.out.println("H - Exit Navigation");
			System.out.println("Your choice: ");
			
			//reading choice
			ch = input.next();
			
			// handling choice, invoking methods in Betancourt_Drone class
			if(ch.equalsIgnoreCase("A")){
				drone.moveUp(1);
				System.out.println("You have moved up");
			}else if(ch.equalsIgnoreCase("B")){
				drone.moveDown(1);
				System.out.println("You have moved down");
			}else if(ch.equalsIgnoreCase("C")){
				drone.forward(1);
				System.out.println("You have moved forward");
			}else if(ch.equalsIgnoreCase("D")){
				drone.backward(1);
				System.out.println("You have moved backward");
			}else if(ch.equalsIgnoreCase("E")){
				drone.turnLeft();
				System.out.println("You have turned left");
			}else if(ch.equalsIgnoreCase("F")){
				drone.turnRight();
				System.out.println("You have turned right");
			}else if(ch.equalsIgnoreCase("G")){
				System.out.println("\n" + drone + "\n");
			}
		}
		

	}

}
