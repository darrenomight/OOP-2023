package ie.tudublin;


import processing.core.PApplet;
public class firstloop extends PApplet {
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
        
        int A= 0;
        int C = 0;
        fill(C, 255,255);
        for(int i = 0; i < 10; i++)
        {
            fill(i*25 , 255,255);
            rect(A, 0, 50, 500);
            A = A + 50;
            
        }
        
    }
}
