import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Square extends Shape {

	/* class variables */
	private int sideLength;

	/* ctor for taking in the sideLength of the square */
	public Square(int x, int y, int sideLength) {
		super(x, y);
		this.sideLength = sideLength;
	}

	/**/
	public Square(int x, int y){
		super(x,y);
		this.sideLength = 20;
	}

	/* getter for sideLength */
	public int getSideLength(){
		return sideLength;
	}

	/**/
	public double getArea(){
		return sideLength * sideLength;
	}

	/* setter for sideLength w/ condition checking */
	public void setSideLength(int sideLength){
		if(sideLength > 0){
			this.sideLength = sideLength;
		}else{
			System.out.println("error in setting side length");
		}
	}
	
	/*overriding the draw method here this will use the 
	 * Graphics class methods to draw a square to the screen.
	 * To match the arguments of the class method 
	 * I had to add sideLength twice */
	public void draw(Graphics g){
		Graphics g2d = (Graphics) g;

		final int x = getX();
		final int y = getY();
		final int sideLength = getSideLength();

		g2d.drawRect(x, y, sideLength, sideLength);
	}
}