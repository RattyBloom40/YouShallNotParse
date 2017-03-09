package game;

import java.util.ArrayList;

import items.Item;
import util.Config;

public class Inventory
{
	private ArrayList<Item> items = new ArrayList<Item>();
	private int weight;
	
	public Inventory()
	{
		weight = 0;
	}
	
	public boolean addToInventory(Item i)
	{
		if(weight+i.getWeight()<=Config.MAX_WEIGHT)
		{
			weight+=i.getWeight();
			items.add(i);
			return true;
		}
		else
		{
			return false;
		}
	}
}
