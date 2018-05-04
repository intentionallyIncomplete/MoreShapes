import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

/****************************************************/
/*  */
/****************************************************/

public class FirstShape extends Shape{
	private int startAngle;
	private int arcAngle;

	/**/
	public FirstShape(int x, int y){
		super(x, y);
	}
	
	/**/
	public FirstShape(int x, int y, int startAngle, int arcAngle){
		super(x,y);
		this.startAngle = startAngle;
		this.arcAngle = arcAngle;
	}
	
	/*Getters*/
	public int getStartAngle(){
		return startAngle;
	}
	
	public int getArcAngle(){
		return arcAngle;
	}
	
	/*Setters*/
	public void setStartAngle(){
		if(startAngle > 0){
			this.startAngle = startAngle;
		}else{
			System.out.println("error setting start angle");
		}
	}
	
	/**/
	public void setArcAngle(){
		if(arcAngle > 0){
			this.arcAngle = arcAngle;
		}else{
			System.out.println("error setting arc angle");
		}
	}

	/**/
	public void draw(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		final int x = getX();
		final int y = getY();
		final int startAngle = getStartAngle();
		final int arcAngle = getArcAngle();
		g2d.drawArc(x, y, x, y, startAngle, arcAngle);
	}
}
