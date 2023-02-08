package ie.tudublin;

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
		Fizz_Buzz();
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

	public static void Fizz_Buzz()
	{
		
	}
}