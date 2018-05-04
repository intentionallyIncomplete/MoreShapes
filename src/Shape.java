import java.awt.*;

/**/
class Shape extends Object {
	private int x = 0;
	private int y = 0;
	
	/**/
	public Shape( int a, int b ) {
		x=a;
		y=b;
	}
	
	/**/
	public double getArea(){ return -1; }
	
	/**/
	public void draw( Graphics g ){}
	
	/**/
	public int getX() { return x; }
	public int getY() { return y; }
}