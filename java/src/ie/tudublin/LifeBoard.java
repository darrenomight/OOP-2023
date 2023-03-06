package ie.tudublin;

import processing.core.PApplet;

public class LifeBoard {
    boolean [][] board; //declare an 2d array

    private int size;
    PApplet p;
    //float cellwidth

    public LifeBoard(int size, PApplet p)
    {
        this.size = size;
        board = new boolean[size][size];
        this.p = p;
        //cellwidth = p.width/ (float)size;
    }

    public void randomise()
    {
        for (int row = 0; row < size; row ++)
        {
            for (int col = 0; col < size; col ++)
            {
                float dice = p.random(0,1);
                board[row][col] = (dice <= 0.5f);
            }
        }
    }
    /*
     * for (int row = 0; row < size; row ++)
        {
            for (int col = 0; col < size; col ++)
            {
                float x = col * celWidth;
                float y = row * cellWidth;

                if (board[row][col])
                {
                    p.fill(0,255,0);

                }
                else 
                {
                    p.nofill;
                }
                p.rect(x,y,cellwidth, cellwidth)
            }
        }
     */

    public void render()
    {
        float w = p.width / size;
        float h = p.height / size;

        for ( int row = 0; row < size; row++)
        {
            for ( int  col = 0; col < size; col ++)
            {
                if (board[row][col])
                {
                    p.fill(0,255,255);
                }
                else
                {
                    p.fill(100,35,244);
                }

                p.rect(col * w, row * h, w, h);
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
}
