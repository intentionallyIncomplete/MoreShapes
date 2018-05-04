import java.awt.*;

/* This class is the top level class
 * in the heirarchy of classes that is used
 * to create shapes of different line lengths.
 */
class Shape extends Object {
	private int x = 0;
	private int y = 0;
	
	/* used in any class that draws a shape */
	public Shape( int a, int b ) {
		x=a;
		y=b;
	}
	
	/* */
	public double getArea(){ return -1; }
	
	/**/
	public void draw( Graphics g ){}
	
	/**/
	public int getX() { return x; }
	public int getY() { return y; }
}