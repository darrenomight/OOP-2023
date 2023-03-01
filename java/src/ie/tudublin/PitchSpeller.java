package ie.tudublin;

import processing.core.PApplet;

public class PitchSpeller extends PApplet
{
    private float[] frequencies = {293.66f, 329.63f, 369.99f, 392.00f, 440.00f, 493.88f, 554.37f, 587.33f, 659.25f, 739.99f, 783.99f, 880.00f, 987.77f, 1108.73f, 1174.66f, 1318.51f, 1479.98f, 1567.98f, 1760.00f, 1975.53f, 2217.46f, 2349.32f};
    String[] spellings = {"D,", "E,", "F,", "G,", "A,", "B,", "C", "D", "E", "F", "G", "A", "B","c", "d", "e", "f", "g", "a", "b", "c'", "d'", "e'", "f'", "g'", "a'", "b'", "c''", "d''"};
    
    public String spell(float frequency)
    {
        //note its closest to of the current
        float DistanceOfNote = Math.abs(frequency - frequencies[0]);
        int ind = 0;
        for (int i = 0; i < frequencies.length; i++)
        {
            //new distance of note < distance of notes
            if (Math.abs(frequency - frequencies[i]) < DistanceOfNote)
            {
                DistanceOfNote = Math.abs(frequency - frequencies[i]);
                ind = i;
            }
        }
        return spellings[ind];
        
    }
    
    
    


}
