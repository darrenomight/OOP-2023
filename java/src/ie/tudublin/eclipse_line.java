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
        
        int A = 50;
        int B = 50;
        int C = 0;
        float Next = 25;
        fill(C, 255,255);
        
        

        for(int i = 0; i < 10; i++)
        {
            fill(C, 255,255);
            ellipse(Next, height/2,A,B );
            Next = Next + 50;
            C = i * 25;
        } 
        
    }         
}
