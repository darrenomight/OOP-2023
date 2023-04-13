package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class bubble
{
    private PVector velocity;
    private PVector pos;
    private PApplet p;
    
    public bubble(PVector pos, PApplet p)
    {
        this.pos = pos;
        velocity = new PVector(0, 0);
        this.p = p;
    }

    public void render()
    {
        p.noStroke();
        //p.println(p.millis());
        p.fill((p.millis()/500)%256 ,255,255);
        p.circle(pos.x, pos.y, 15);
    }
    float DirY = 3;
    float DirX = 2;
    

    public void update()
    {
        float r;
        r = p.random(2,4);
        
        
        //p.circle(pos.x += DirX, pos.y += DirY, 11);
        
        if(pos.x > p.width)
        {
            DirX *= -1;
            
        }
        
        if(pos.x < 0) {
            DirX *= -1;
        }

        if(pos.y > p.height)
        {
            DirY *= -1;
            
        }
        
        if(pos.y < 0) {
            DirY *= -1;
        }
        //c = 
        pos.x += DirX;
        pos.y += DirY;
        //p.circle(, 11);
    }

    public void move() {
    }
    
    
    
}
