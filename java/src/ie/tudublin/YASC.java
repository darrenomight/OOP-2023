package ie.tudublin;

import processing.core.PApplet;

public class YASC extends PApplet
{

	Ship ship;

	public void settings()
	{
		size(500, 500);
		
	}

	public void setup() {
		ship = new Ship(width/ 2, height/2, , , )
		
	}

	
	
	public void draw()
	{	
		ship.render();
	}
}
