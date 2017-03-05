package items;

public class Key extends Item
{
	private String color;
	
	public Key(String name, String description, int ID, String color)
	{
		super(name, description, ID);
		this.color = color;
	}

}
