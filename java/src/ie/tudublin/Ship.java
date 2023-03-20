
package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Ship {
    private PVector pos;

    public Ship(float x, float y, float size, int c, float halfSize, PApplet p)
    {
        pos = new PVector(x, y);
        this.size = size;
        this.c = c;
        this.p = p;
        this.halfSize = size/2;
    }

    public PVector getPos() {
        return pos;
    }
    public void setPos(PVector pos) {
        this.pos = pos;
    }
    public float getRot() {
        return rot;
    }
    public void setRot(float rot) {
        this.rot = rot;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    public float getSize() {
        return size;
    }
    public void setSize(float size) {
        this.size = size;
    }
    private float rot;
    private int c;
    private float size;
    private float halfSize;

    public void move() {
        if (p.keypressed)
        {
            if (p.keycode == PApplet.LEFT)
            {
                pos.x --;
            }
            if (p.keycode == PApplet.RIGHT)
            {
                pos.x ++;
            }
            if (p.keycode == PApplet.UP)
            {
                pos.y --;
            }
            if (p.keycode == PApplet.DOWN)  
            {
                pos.y ++;
            }
        }
    }
    public void render()
    {
        p.translate(pos.x, pos.y);
        p.rotate(rot);
		p.stroke(c,255,255);
        p.line(pos.x -halfSize,pos.y + halfSize, pos.x, pos.y -halfSize);
        p.line(pos.x ,pos.y , pos.x, pos.y +halfSize);
        p.line(pos.x ,pos.y , pos.x, pos.y -halfSize);
        p.line(pos.x + halfSize, pos.y + halfSize, pos.x, pos.y );
	}
}