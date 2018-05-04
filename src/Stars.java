import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

/****************************************************/
/*  */
/****************************************************/

public class Stars extends Shape{
	private int startAngle;
	//private int arcAngle;
	private int midSecX;
	private int midSecY;
	int radius[] = {150, 50, 100, 50};

	/**/
	public Stars(int x, int y){
		super(x, y);
	}
	
	/**/
	public Stars(int x, int y, int startAngle, int midSecX, int midSecY){
		super(x,y);
		this.startAngle = startAngle;
		this.midSecX = midSecX;
		this.midSecY = midSecY;
	}
	
	/*Getters*/
	public int getStartAngle(){
		return startAngle;
	}
	
	public int getMidSecX(){
		return midSecX;
	}
	
	public int getMidSecY(){
		return midSecY;
	}
	
	/*Setters*/
	public void setStartAngle(int startAngle){
		if(startAngle > 0){
			this.startAngle = startAngle;
		}else{
			System.out.println("error setting start angle");
		}
	}
	
	public void setMidSecX(int midSecX){
		if(midSecX > 0){
			this.midSecX = midSecX;
		}else{
			System.out.println("error setting the center X coordinate");
		}
	}
	
	public void setMidSecY(int midSecY){
		if(midSecY > 0){
			this.midSecY = midSecY;
		}else{
			System.out.println("error setting the center Y coordinate");
		}
	}

	/* */
	public void draw(Graphics g){
		Graphics g2d = (Graphics) g;
		
		final int xc = getMidSecX();
		final int yc = getMidSecY();
	    
	    int nPoints = 16;
	    int[] X = new int[nPoints];
	    int[] Y = new int[nPoints];

	    for (double current=0.0; current<nPoints; current++)
	    {
	        int i = (int) current;
	        double x = Math.cos(current*((2*Math.PI)/10))*radius[i % 4];
	        double y = Math.sin(current*((2*Math.PI)/10))*radius[i % 4];

	        X[i] = (int) x + xc;
	        Y[i] = (int) y + yc;
	    }
	    g2d.drawPolygon(X, Y, nPoints);
	}
}
