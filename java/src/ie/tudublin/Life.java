package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet
{
    int mode = key;
	boolean pause = true;

	LifeBoard board;
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		background(0);
		frameRate(3);
		board = new LifeBoard(100, this);
		board.randomise();
		
		
	}

	public void draw()
	{	
		background(0);
		board.render();
		board.applyRules();
	}

	public void keyPressed() 
	{
		if (keyPressed)
		{
			if (key == ' ')
			{
				pause = !pause;

				if (pause)
				{
					loop();
				}
				else
				{
					noLoop();
				}
			}
		}	
		switch (key) 
        {
			//1 to randomise the board
			case '1':
        	{
				board.randomise();
				break;
        	}
			
			//2 to clear the board
			case '2':
			{
				board.clear();
				break;
			}
			// 3 to draw a cross shape
			case '3':
			{
				board.cross();
				break;
			}
			
		}
    }
}
