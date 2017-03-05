package entities;

public abstract class Entity {
	private final int entityID;
	private String name;
	
	public Entity(String name){
		entityID = 0;
		this.setName(name);
	}
	
	public Entity(String name, int altID){
		entityID = altID;
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEntityID() {
		return entityID;
	}
}
