package ie.tudublin;

import processing.core.PApplet;

public class lab3_Excercise extends PApplet 
{
    public void settings() 
    {
		size(1000, 800);
	} 


    public void setup()
    {
    //colorMode(HSB);
    }

    public void draw()
    {
        background(0);
        strokeWeight(2);
        stroke(50,150,200);
        line(200, 400, 800, 400);
        rect(width/4, height/4, width/2, height/2);
        
        if(mouseX > width/4 && mouseX < width/4 + width/2 && mouseY > height/4 && mouseY < height/2)
        {
            fill(0,44,100);
            

        }
        
        else
        {
            fill(255,0,0);
            
        }
        
	}

}


