package items;

public class Key extends Item
{
	private String color;
	
	public Key(String name, String description, int ID, int weight, String color)
	{
		super(name, description, ID, weight);
		this.color = color;
	}

}