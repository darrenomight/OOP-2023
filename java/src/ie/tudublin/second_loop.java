package ie.tudublin;


import processing.core.PApplet;
public class second_loop extends PApplet {
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
        
        int A = 0;
        int B = 0;
        int C = 0;

        fill(C, 255,255);
        
        for(int i = 0; i < 10; i++)
        {
            fill(i*25 , 255,255);
            rect(A, B, 50, 50);
            A = A + 50;
            B = B + 50;
            
        }
        
    }
}
