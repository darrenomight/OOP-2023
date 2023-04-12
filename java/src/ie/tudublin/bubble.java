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
        p.fill(255,255,255);
        p.circle(pos.x, pos.y, 11);
    }

    public void update()
    {

    }
    
    
    
}
