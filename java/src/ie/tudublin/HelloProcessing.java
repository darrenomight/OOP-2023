package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(1000, 1000);
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
		stroke(255);
		line(10,10,100,100); // x1 y1 x2 y2
		noStroke();
		circle(300,250,70); // cx, cy, d
		fill(255,0,0);
		rect(10,300,20,100); // tlx1, tly1,w h
		stroke(127);
		fill(0,250,250);
		noFill();
		strokeWeight(1);
		triangle(700, 200, 700, 500, 80, 70);
	}
}
