package ie.tudublin;


import processing.core.PApplet;
public class eclipse_line extends PApplet {
    public void settings()
    {
        size(1000,800);
    }

    public void setup() {
        colorMode(HSB);
        background(0);
        
    }

    public void draw()
    {
        
        noStroke();
        //int row_count = 100;
        
        for(int i = 0; i < 20; i++)
        {
            for(int j = 0; j < 20; j++)
            {
                
                ellipse(i * 50 + 25, j * 50 + 25, 50, 50);
                //float c = ((i + j) / ((20-1) * 2.0f) * 255.0f)%256;
                fill(((i * j )* i%256) , 255, 255);

                //fill(((i * j )* c%256) , 255, 255);
            }
        }
    }         
}




/*
 *  case 0 
 * 
 */