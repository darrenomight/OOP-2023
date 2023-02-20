package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

import processing.data.TableRow;
import processing.data.Table;

import java.util.ArrayList;

public class StarMap extends PApplet
{
	ArrayList<Star> stars = new ArrayList<Star>();

	public void settings()
	{
		size(800, 800);
		loadStars();
	}

	public void setup() {
		colorMode(RGB);
		background(0);
		
		smooth();
<<<<<<< HEAD
=======

>>>>>>> 043d21d1b70f553886277dd4997a9e0376844936
		loadStars();
		printStars();
	}

	void printStars()
	{
		for(int i = 0 ; i < stars.size() ; i ++)
		{
			println(stars.get(i));
		}
	}

	void displayStars()
	{
		for(int i = 0 ; i < stars.size() ; i ++)
		{
			stars.get(i).render(this);
		}
	}

	public void loadStars()
	{
		Table table = loadTable("HabHYG15ly.csv", "header");
 		for(TableRow r:table.rows())
 		{
 			Star s = new Star(r);
 			stars.add(s);
 		}
	}

	public void drawGrid()
	{
		stroke(0, 255, 255);
		float border = width * 0.1f;

		for(int i = -5 ; i <= 5 ; i ++)
		{
<<<<<<< HEAD

			float x = border + (gap * (i + 5));
			stroke(255,100,100);
			line(x, border, x, height - border);
			line(border, x, width - border, x);

			fill(265,70,80);
			text(i, x, border - 20);
			text(i, border - 20, x);
=======
			float x = map(i, -5, 5, border, width - border);
			line(x, border, x, height - border);
			line(border, x, width - border, x);

			textAlign(CENTER, CENTER);
			text(i, x, border * 0.5f);
			text(i, border * 0.5f, x);
>>>>>>> 043d21d1b70f553886277dd4997a9e0376844936
		}

		//float f = map(5, 0, 10, 100, 200);
		//float f1 = map1(5, 0, 10, 100, 200);
		
	}
<<<<<<< HEAD
	
	ArrayList<Star> stars = new ArrayList<Star>();	
	
	void loadStars()
 	{
 		Table table = loadTable("HabHYG15ly.csv", "header");
 		for(TableRow r:table.rows())
 		{
 			Star s = new Star(r);
 			stars.add(s);
 		}
 	}

	void printStars()
	{
		for(Star s:stars)
		{
			System.out.println(s);
		}
	}

	public void draw()
	{	
	 	strokeWeight(2);		
 
		drawGrid();
		drawStar();
=======

	float map1(float a, float b, float c, float d, float e)
	{
		float r1 = c -b;
		float r2 = e - d;

		float howFar = a - b;

		return d + ((howFar / r1) * r2);
	}
		
	public void draw()
	{	
		strokeWeight(1);		

		drawGrid();
		displayStars();
>>>>>>> 043d21d1b70f553886277dd4997a9e0376844936
	}

	public void drawStar()
	{
		for(Star s:stars)
		{
			float x = map(s.xG,-5,5,50, width - 50);
			float y = map(s.yG,-5,5,50, width -50);
			fill(120,100,100);
			stroke (255,255,255);
			
			noFill();
			circle(x,y,s.absMag);

			text(s.displayName, x, y);
		}
	}
 
}
