package ie.tudublin;

import processing.core.PApplet;

public class LifeBoard {
    boolean [][] board; //declare an 2d array
    boolean [][] next;

    public int key = 9;
    private int size;
    PApplet p;

    float cellWidth;

    public boolean getCell(int row, int col)
    {
        if (row >= 0 && row < size  && col >= 0 && col < size)
        {
            return board[row][col];
        }
        else
        {
            return false;
        }
    }

    public int countCells(int row, int col)
    {
        int count = 0;
        for (int i = -1; i <= 1; i++)
        {
            for (int j = -1; j <= 1; j ++)
            {
                if (j == 0 && i == 0)
                {
                    continue;
                }
                
                if (getCell(i + row, j + col))
                {
                    count ++;
                }
                
            }
        }
        return count;
    }

    public void applyRules()
    {
        for (int row = 0; row < size; row ++)
        {
            for (int col = 0; col < size; col ++)
            {
                int count = countCells(row, col);
                //current living cell rules
                if (board[row][col])
                {
                    if (count == 2 || count == 3)
                    {
                        next[row][col] = true;
                    }
                    else
                    {
                        next[row][col] = false;
                    }
                }
                //for the dead cell rules
                else
                {
                    if ( count == 3 )
                    {
                        next[row][col] = true;
                    }
                    else
                    {
                        next[row][col] = false;
                    }
                }
                
                // less than 2 dies
                //2-3 survice
                //dead with 3 neigbours come to life
            }
        }
        boolean[][]temp;
        temp = board;
        board = next;
        next = temp;

    }

    public LifeBoard(int size, PApplet p)
    {
        this.size = size;
        board = new boolean[size][size];
        next = new boolean[size][size];
        this.p = p;
        cellWidth = p.width/ (float)size;
    }

    public void randomise()
    {
        for (int row = 0; row < size; row ++)
        {
            for (int col = 0; col < size; col ++)
            {
                float dice = p.random(0.0f,1.0f);
                board[row][col] = (dice <= 0.5f);
            }
        }
    }
   
    public void render()
    {
        for (int row = 0; row < size; row ++)
        {
            for (int col = 0; col < size; col ++)
            {
                float x = col * cellWidth;
                float y = row * cellWidth;

                if (board[row][col])
                {
                    p.fill(250);
                }
                else 
                {
                    p.noFill();
                }
                p.rect(x ,y,cellWidth, cellWidth);
            }
        }
    }
    // {
    //     float w = p.width / size;
    //     float h = p.height / size;

    //     for ( int row = 0; row < size; row++)
    //     {
    //         for ( int  col = 0; col < size; col ++)
    //         {
    //             if (board[row][col])
    //             {
    //                 p.fill(0,255,255);
    //             }
    //             else
    //             {
    //                 p.fill(100,35,244);
    //             }

    //             p.rect(col * w, row * h, w, h);
    //         }
    //     }
    // }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    } 

    public void clear()
    {
        for (int row = 0; row < size; row ++)
        {
            for (int col = 0; col < size; col ++)
            {
                float dice = p.random(0.0f,1.0f);
                board[row][col] = (dice <= 0.0f);
            }
        }
    }
    
    public void cross()
    { 
        for(int row = 0; row < size; row ++)
        {
            board[row][size/2] = true;
        }

        for (int col = 0; col < size; col ++)
        {
            board[size/2][col] = true;
        }
        
    }
        
        
    
}
