package ie.tudublin;


import processing.core.PApplet;
public class Circle_loop extends PApplet {
    public void settings()
    {
        size(500,500);
    }

    public void setup() {
        colorMode(HSB);
        background(255);
        
    }

    public void draw()
    {
        
        noStroke();
        
        int A = 250;
        int B = 250;
        int C = 0;
        float MaxWidth = 100;
        

        for(float i = MaxWidth; i > 0; i--)
        {
            C = C + 5;
            fill((C*5)%256 , 255, 255);
            ellipse(A , B, 450f*(i/MaxWidth), 450f*(i/MaxWidth)); 
        } 
        
    }         
}
