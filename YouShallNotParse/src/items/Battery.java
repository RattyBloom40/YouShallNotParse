package items;

public class Battery extends Item
{
	private int power;
	
	public Battery(String name, String description, int ID)
	{
		super(name, description, ID);
		this.power = 100;
	}

	public int powerLeft()
	{
		return power;
	}
}
