package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(1000, 1000);
	}

	public void setup() {
		colorMode(HSB);
		background(0);

		x1 = random(10, width);
		x2 = random(90, width);
		y1 = random(-100, height);
		y2 = random(73, height);

		float range = -5;

		x1dir = random(-range, range);
		x2dir = random(-range, range);
		y1dir = random(-range, range);
		y2dir = random(-range, range);

		smooth();
		
	}

	float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;
	
	public void draw()
	{	
		
	}
}
