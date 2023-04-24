package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Healthpowerup extends GameObject 
{
    float w;
    public Healthpowerup(float x, float y, float r, int c, YASC p)
    {
        super(x,y,r,c,p);
        w = 50;

        forward.x =p.random(-1, 1);
        forward.y =p.random(-1, 1);
        forward.normalize();



    }

    @Override
    public void update()
    {
        rot += 0.1f;

        //pos.add(forward);
        pos.add(PVector.mult(forward,5));
    }

    @Override
    public void render() {
        p.pushMatrix();
        p.noFill();
        p.stroke(255);
        p.translate(pos.x, pos.y);
        p.rotate(rot);
        p.rect(-halfW, halfW, w,w);
        p.line(0,-20, 0,20);
        p.line(-20,0, 20,0);
    }
    
}
