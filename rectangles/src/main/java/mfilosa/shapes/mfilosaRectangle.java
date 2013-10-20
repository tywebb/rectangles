package mfilosa.shapes;

import java.awt.Rectangle;

public class mfilosaRectangle extends Rectangle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public mfilosaRectangle(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

   public mfilosaRectangle(Rectangle r) {
	   
		super(r);
		// TODO Auto-generated constructor stub
	}


	public boolean adjecent(Rectangle rec) {
		
			
		//Check Left  - Right Lines
		
		if (rec.y == this.y) {
			
			if (rec.x <= (this.x + this.width) && (rec.x>=this.x)) {
				return true;
			}
			
			if (this.x <= (rec.x + rec.width) && (this.x>=rec.x)) {
				return true;
			}
		}
		
		// Check Top  - Bottom Lines	
		
	   if (rec.x == this.x) {
			
		  if (rec.y <= (this.y + this.height) && (rec.y >= this.y)) {
			  return true;
		  }
		  
		  if (this.y <= (rec.y + rec.height) && (this.y>=rec.y)) {
				return true;
		}
				
		}
		
		return false;
		
	}
	

}
