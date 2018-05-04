import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

/****************************************************/
/* The "stars" class simply draws a star to the		*/
/* screen. The basic concept is that the program	*/
/* will begin drawing at the given x,y coordinates	*/
/* and move */
/****************************************************/

public class Stars extends Shape{
	private int startAngle;
	//private int arcAngle;
	private int midSecX;
	private int midSecY;
	int radius[] = {150, 50, 100, 50};
	public static final int TOTAL_POINTS = 12;

	/**/
	public Stars(int x, int y){
		super(x, y);
	}
	
	/* this is the ctor that is used to create a Star shape from the
	 * PloyDemo driver class. the x,y starting points are submitted
	 * to the super class (Shape) and the startAngle will determine
	 * the curve of the star's outer angles. 
	 * The midSecX and midSecY will set the center of the 'points' 
	 * of the Star shape. That is to say, there is a starting x,y 
	 * coordinate and the Star will then have its own "center" with
	 * a corresponding middle section (midSec) x,y coordinate position. */
	public Stars(int x, int y, int startAngle, int midSecX, int midSecY){
		super(x,y);
		this.startAngle = startAngle;
		this.midSecX = midSecX;
		this.midSecY = midSecY;
	}
	
	/****************************************************/
	/* 						Getters						*/
	/****************************************************/
	public int getStartAngle(){
		return startAngle;
	}
	
	public int getMidSecX(){
		return midSecX;
	}
	
	public int getMidSecY(){
		return midSecY;
	}
	
	/****************************************************/
	/* 						Setters						*/
	/****************************************************/
	public void setStartAngle(int startAngle){
		if(startAngle > 0){
			this.startAngle = startAngle;
		}else{
			System.out.println("error setting start angle");
		}
	}
	
	/**/
	public void setMidSecX(int midSecX){
		if(midSecX > 0){
			this.midSecX = midSecX;
		}else{
			System.out.println("error setting the center X coordinate");
		}
	}
	
	/**/
	public void setMidSecY(int midSecY){
		if(midSecY > 0){
			this.midSecY = midSecY;
		}else{
			System.out.println("error setting the center Y coordinate");
		}
	}

	/****************************************************/
	/* TEXT HERE */
	/****************************************************/
	public void draw(Graphics g){
		Graphics g2d = (Graphics) g;
		
		final int xc = getMidSecX();
		final int yc = getMidSecY();
	    
	    
	    int[] xs = new int[TOTAL_POINTS];
	    int[] ys = new int[TOTAL_POINTS];

	    //logic here originated from
	    //https://stackoverflow.com/questions/16327588/how-to-make-star-shape-in-java
	    //for the x and y coordinate handling for drawing each new "point" on the star
	    for (int k=0; k<TOTAL_POINTS; k++)
	    {
	        int i = (int) k;
	        double x = Math.cos(k*((2*Math.PI)/10))*radius[i % 4];
	        double y = Math.sin(k*((2*Math.PI)/10))*radius[i % 4];

	        xs[i] = (int) x + xc;
	        ys[i] = (int) y + yc;
	    }
	    g2d.drawPolygon(xs, ys, TOTAL_POINTS);
	}
}
