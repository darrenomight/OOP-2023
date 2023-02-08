package ie.tudublin;

public class Fizz_Buzz{

    public void main()
    {
        for (int x = 100; x <= 100; x++)
        {
            if(x%3 == 0)
            {
                System.out.println("FIZZ");
            }
            
    
            if(x%5 == 0)
            {
                System.out.println("BUZZ");
            }
    
            if(x%3 == 0 && x%5 == 0)
            {
                System.out.println("FIZZBUZZ");
            }
    
            else
            {
                System.out.println(x);
            }
        }

    }
    
   

}
