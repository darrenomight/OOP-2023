package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

import processing.data.TableRow;
import processing.data.Table;

import java.util.ArrayList;

import processing.data.*;

public class StarMap extends PApplet {

	ArrayList<Star> stars = new ArrayList<Star>();

	public float border;

	void drawGrid() {
		stroke(255, 0, 255);
		textAlign(CENTER, CENTER);
		textSize(20);
		for (int i = -5; i <= 5; i++) {
			float x = map(i, -5, 5, border, width - border);
			line(x, border, x, height - border);
			line(border, x, width - border, x);
			fill(255);
			text(i, x, border * 0.5f);
			text(i, border * 0.5f, x);
		}
	}

	public class StarMap extends PApplet
	{
		ArrayList<Star> stars = new ArrayList<Star>();

		public void settings() {
			size(800, 800);
			loadStars();
		}

		public void setup() {
			colorMode(RGB);
			background(0);

			smooth();
			loadStars();
			printStars();
		}

		void printStars() {
			for (Star s : stars) {
				System.out.println(s);
			}
		}

		void loadStars() {
			Table table = loadTable("HabHYG15ly.csv", "header");
			for (TableRow r : table.rows()) {
				Star s = new Star(r);
				stars.add(s);
			}
		}

		public void settings() {
			size(800, 800);
		}

		Star first = null;
		Star second = null;

			public void mouseClicked()
			{
				for(Star s:stars)
				{
					float x = map(s.getxG(), -5, 5, border, width - border);
					float y = map(s.getyG(), -5, 5, border, height - border);

					for(int i = -5 ; i <= 5 ; i ++)
					{
						float x = map(i, -5, 5, border, width - border);
						line(x, border, x, height - border);
						line(border, x, width - border, x);

						textAlign(CENTER, CENTER);
						text(i, x, border * 0.5f);
						text(i, border * 0.5f, x);
					}	

				}
			}
		//float f = map(5, 0, 10, 100, 200);
		//float f1 = map1(5, 0, 10, 100, 200);
		
	

		float map1(float a, float b, float c, float d, float e)
		{
			float r1 = c - b;
			float r2 = e - d;

			float howFar = a - b;

			return d + ((howFar / r1) * r2);
		}

		public void draw() {
			strokeWeight(1);

			drawGrid();
			displayStars();
		}
}
