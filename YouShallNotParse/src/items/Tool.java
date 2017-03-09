package items;

public class Tool extends Item
{
	private final int maxDurability;
	private int durability;
	
	public Tool(String name, String description, int ID, int weight, int durability)
	{
		super(name, description, ID, weight);
		this.maxDurability = durability;
		resetDurability();
	}
	
	public int getDurability()
	{
		return durability;
	}
	
	public void useTool()
	{
		durability--;
	}
	
	public void resetDurability()
	{
		durability = maxDurability;
	}
}
