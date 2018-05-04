import java.awt.Graphics;
import java.awt.Polygon;

/****************************************************/
/* This hexagon class actually uses the same values */
/* as a circle but the simple difference is in the 	*/
/* draw method using the for-loop to change the		*/
/* angle at which the next line will be directed to */
/* be drawn. */
/****************************************************/
public class Hexagon extends Shape {
	private int r;

	public Hexagon(int x, int y, int r){
		super(x,y);
		this.r = r;
	}
	/****************************************************/
	/* 						Getter(s)					*/
	/****************************************************/
	public int getR(){
		return r;
	}

	/****************************************************/
	/* 						Setter(s)					*/
	/****************************************************/
	public void setR(int r){
		if(r > 0){
			this.r = r;
		}else{
			System.out.println("error setting the radius");
		}
	}

	/****************************************************/
	/* TEXT HERE */
	/****************************************************/
	public void draw(Graphics g){
		Graphics g2d = (Graphics) g;
		
		final int x = getX();
		final int y = getY();
		final int r = getR();

		Polygon p = new Polygon();
		for (int i=0;i<6;i++){
			p.addPoint(
				(int)(x + r * Math.cos(i * 2 * Math.PI / 6)),
				(int)(y + r * Math.sin(i * 2 * Math.PI / 6)));
		}    
		g.drawPolygon(p);
	}
}
