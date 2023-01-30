package ie.tudublin;

import com.jogamp.nativewindow.util.Rectangle;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		//colorMode(HSB);
		background(0);

		x1 = random(0, width);
		x2 = random(0, width);
		y1 = random(0, height);
		y2 = random(0, height);

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
		background(255,0,0);
		noStroke();
		fill(45,45,45);
		circle(width/2,height/2 ,400);
		
		noStroke();
		fill(150,0,150);
		triangle(width-50, height-100, 50, height-100, width/2, 0);

		noStroke();
		fill(240,240,45);
		ellipse(width/2, height/2, 225, 100);

		noStroke();
		fill(0,0,75);
		ellipse(width/2, height/2, 100, 100);
		
	}
}
	