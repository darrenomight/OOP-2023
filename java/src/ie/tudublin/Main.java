package ie.tudublin;

import processing.core.PApplet;
import java.util.Scanner;

public class Main
{

	public static void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }

	public static void loops()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loops());
    }

	public static void bugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
    }
	
	public static void main(String[] args)
	{
		System.out.println("Hello world, and Darren");
		
		//Dog penny = new Dog();
		//penny.setName("Penny");
		//penny.speak();

		//loops();
		//lab3_Excercise();
		//firstloop();
		//second_loop();
		//Circle_loop();
		//eclipse_line();
		for (int x = 1; x <= 100; x++)
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
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter username");

		String userName = myObj.nextLine();  // Read user input
		System.out.println("Username is: " + userName);  // Output user input
	}
	
	public static void lab3_Excercise()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new lab3_Excercise());
    }

	public static void firstloop ()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new firstloop());
    }
	
	public static void second_loop ()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new second_loop());
    }

	public static void Circle_loop ()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Circle_loop()); 
	}

	public static void eclipse_line ()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new eclipse_line()); 
	}
	//{	
		//String[] a = {"MAIN"};
        //processing.core.PApplet.runSketch( a, new Fizz_Buzz()); 
	//}
		
	
}