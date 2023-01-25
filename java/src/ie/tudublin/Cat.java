package ie.tudublin;

public class Cat {
    private int numlives = 9;

    public Cat()
	{
	}
	
	public Cat(String name)
	{
	}
    

    public void kill() {
        if (this.numlives > 0){
            this.numlives--;
            System.out.println("Ouch");
        }
        if (this.numlives == 0){
            System.out.println("Dead");
        }   
        
    }
        
}

