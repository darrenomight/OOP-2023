package ie.tudublin;

import java.util.concurrent.TimeUnit;

import processing.core.PApplet;

public class BugZap extends PApplet
{
	float playerX = 200;
	float playerY = 400;
	float playerWidth = 50;

	public void settings()
	{
		size(500, 500);
	}

	void drawPlayer(float x, float y, float w )
	{
		float h = w /3;
		strokeWeight(h);
		stroke(123,40,200);
		line(x, y, x+w, y);
		
	}

	void drawBug(float x, float y, float d )
	{
		
		fill(0,0,255);
		circle(x, y, d);
	
	}

	public void draw()
	{
		float BugX = random(500);
		float BugY = random(350);
		float bugD = random(15);	
		
		background(0);
		drawPlayer(playerX,playerY,playerWidth);
		
		if ((frameCount % 180) == 0)
		{
    	// Do something	
		drawBug(BugX,BugY,bugD);
		}		
		}
	public void setup() {
		
	}

	public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			if(playerX > 0)
			{
				System.out.println("Left arrow pressed");
				playerX = playerX-20;
			}
			
		}
		if (keyCode == RIGHT)
		{
			if(playerX < 500)
			{
				System.out.println("Right arrow pressed");
				playerX = playerX+20;
			}
			
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed laser fired");
			laserFire(playerX, playerY);
	
		}
	}	
	
	public void laserFire(float x,float y)
	{
		
		stroke(255,0,120);
		line(playerX+25, playerY, playerX+25, playerY-450);
	}
	
	

	
}
