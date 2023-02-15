package ie.tudublin;

import processing.core.PApplet;

public class StarMap extends PApplet
{
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		background(100);

		smooth();
		
	}

	public void drawGrid()
	{
		float border = 50.0f;

		int count = 10;
		float gap =  (width - (border * 2.0f)) / (float) count;

		for (int i = -5; i <= 5; i++)
		{
			float x = border + (gap * (i + 5));
			stroke(200,255,255);
			line(x, border, x, height - border);
			line(border,x,width-border,x);
			
			fill(0);
			textSize(11);
			text(i, x, border- 20);
			text(i, border - 30, x);
			
			
				
		}
	}

		
	public void draw()
	{	
		strokeWeight(2);
		drawGrid();		
	}
}
