package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class bubbles 
{
    bubble bob[];
    private float width;
    private float height;
    private PApplet p;
    private int size = 36;
    private PVector pos;
    
   
    public bubbles(float width, float height, PApplet p)
    {
        //this exact classes width = 
        this.width = width;
        this.height = height;
        this.p = p;
        

        // Initalsing bubble array
        bob = new bubble[size];
        for(int i = 0; i < size; i++)
        {
            float x = 0, y = 0; 
            switch (i%4) 
            {
                case 0:
                //left
                    x = 0;
                    y = p.random(0, height);
                    break;
                case 1:
                //right
                    x = width;
                    y = p.random(0, height);

                    break;
                case 2:
                //bottom
                    x = p.random(0, width);
                    y = height;
                    break;
                case 3:
                //top
                    x = p.random(0, width);
                    y = 0;

                    break;
                      
            
                default:
                    break;
            }
             
            pos = new PVector(x,y);
            bob[i] = new bubble(pos,p);

        }
    }

    public void render()
    {
        for (int i = 0; i < size; i++)
        {
            
            bob[i].render();
        }
    }
}
