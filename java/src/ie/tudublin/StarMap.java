
package ie.tudublin;

import processing.core.PApplet;

import processing.data.TableRow;
import processing.data.Table;

import java.util.ArrayList;



public class StarMap extends PApplet
{
	public void settings()
	{
		//fullScreen();
		size(850, 800);
		loadStars();
	}

	public void setup() {
		colorMode(RGB);
		background(0);
		
		smooth();
		loadStars();
		printStars();
	}


	public void drawGrid()
	{
		stroke(0);
		float border = 50.0f;

		int count = 10;
		float gap = (width - (border * 2.0f)) / (float) count;
		for(int i = -5 ; i <= 5 ; i ++)
		{

			float x = border + (gap * (i + 5));
			stroke(255,100,100);
			line(x, border, x, height - border);
			line(border, x, width - border, x);

			fill(255,255,255);
			textAlign(CENTER,CENTER);
			text(i, x, border - 20);
			text(i, border - 20, x);
		}
		
	}
	
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
		mousePressed();
	}

	public void drawStar()
	{
		for(Star s:stars)
		{
			float x = map(s.xG,-5,5,50, width - 50);
			float y = map(s.yG,-5,5,50, width -50);
			fill(120,100,100);
			stroke (255,0,0);
			
			noFill();
			
			circle(x,y,s.absMag);
			stroke(239, 245, 66);
			line (x-5, y, x + 5, y);
			line (x, y-5 , x , y + 5);
			
			textAlign(LEFT,CENTER);
			text(s.displayName, x, y);
		}
	}

	

	public void mousePressed() 
	{
		
		if (mousePressed == true)
		stroke(255,0,0);
		line (mouseX, mouseY, pmouseX, pmouseY);
		//1ststar
		//2ndstar
	
		
	}
	



 
}