package ie.tudublin;

import processing.core.PApplet;

public class MyVisual extends PApplet 
{
    Darren Dub;
    public void settings() 
    {
        //size(1980, 1080);
        fullScreen(P3D, SPAN);
    }

    public void setup()
    {   
        colorMode(HSB);
        background(0);
        Dub = new Darren(this);
    }

    public void draw()
    {
        fill(0,0,0,20);
        rect(0,0,width,height);
        Dub.render();
    }

    
}
