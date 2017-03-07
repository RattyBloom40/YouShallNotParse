package items;

public class Battery extends Item
{
	private int power;
	
	public Battery(String name, String description, int ID, int weight)
	{
		super(name, description, ID, weight);
		this.power = 100;
	}

	public int powerLeft()
	{
		return power;
	}
}
