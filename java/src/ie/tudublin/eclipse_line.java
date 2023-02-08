package ie.tudublin;


import processing.core.PApplet;
public class eclipse_line extends PApplet {
    public void settings()
    {
        size(500,500);
    }

    public void setup() {
        colorMode(HSB);
        background(0);
        
    }

    public void draw()
    {
        
        noStroke();
        
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                fill(i * 25, 255, 255);
                ellipse(i * 50 + 25, j * 50 + 25, 50, 50);
            }
        }
    }         
}
