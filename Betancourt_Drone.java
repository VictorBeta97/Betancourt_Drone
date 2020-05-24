//Author Name: Victor Betancourt
//Date: 5/17/2020
//Program Name: Betancourt_Drone
//Purpose: Simulation using button, drone movement in x,y,z location
package Drone;

public class Betancourt_Drone {
	//variables indicating drone's coordinates
	private int x,y,z;
	
	/*variable indicating drone's direction, with 0 being north, 1 being east,
	 2 being south and 3 being west
	 */
	private int direction;
	
	//constructor initializing a drone at origin, facing north
	public Betancourt_Drone(){
		x = 0;
		y = 0;
		z = 0;
		direction = 0; //north
	}
	
	//getters and setters for x,y,z
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	//method to move drone up vertically for given spaces
	public void moveUp(int spaces) {
		z += spaces;
	}
	
	//method to move drone down vertically
	public void moveDown(int spaces) {
		z -= spaces;
    }
	
	//method to move drone forward, for given spaces
	public void forward(int spaces) {
		if(direction == 0) {
			//moving north
			y += spaces;
		} else if(direction == 1) {
			//moving east
			x += spaces;
		} else if(direction == 2) {
			//moving south
			y -= spaces;
		} else {
			//moving west
			x -= spaces;
		}
	}
	
	//method to move drone backward, for given spaces
	public void backward(int spaces) {
		if(direction == 0) {
			//moving south
			y -= spaces;
		} else if(direction == 1) {
			//moving west
			x -= spaces;
		} else if(direction == 2) {
			//moving north
			y += spaces;
		} else {
			//moving east
			x += spaces;
		}
	}
	
	//method to turn drone 90 degrees to right
	public void turnRight() {
		direction = (direction + 1) % 4;
	}
	
	//method to turn drone 90 degrees to left
	public void turnLeft() {
		direction--;
		if(direction < 0) {
			direction = 3;
		}
	}
	
	//returns a string representation of drone's position
	public String toString() {
		return "Drone is at (x="+ x +", y=" + y +", z=" + z +")";
	}

}
