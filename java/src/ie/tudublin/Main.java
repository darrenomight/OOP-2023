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

	public static void starMap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new StarMap());
    }

	public static void audio1()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Audio1());
    }

	public static void audio2()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Audio2());
    }

	public static void Audio3()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Audio3());
    }

	public static void life()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Life());
    }
	
	public static void yasc()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new YASC());
    }

	public static void Project()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Project());
    }
	
	public static void main(String[] args)
	{
		System.out.println("Hello, Darren - from mommy - norbert 02");

		/*
		
		PitchSpeller ps = new PitchSpeller();
    	System.out.println(ps.spell(330));
    	System.out.println(ps.spell(420));
    	System.out.println(ps.spell(1980));
		Audio3();
		*/
		//yasc();
		//audio1();
		Project();
		
	}
	
}