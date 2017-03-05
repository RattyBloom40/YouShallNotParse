package items;

public abstract class Item
{

	private String name;
	private String description;
	private final int itemID;

	public Item(String name, String description, int ID)
	{
		this.name = name;
		this.description = description;
		this.itemID = ID;
	}

	public String getName()
	{
		return name;
	}

	public String getDescription()
	{
		return description;
	}

	public int getID()
	{
		return itemID;
	}
}
