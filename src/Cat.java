
public class Cat {

	private static final int Default_Hunger_Level = 10;
	
	int hungerLevel = Default_Hunger_Level;
	
	

	public void giveFood() {
		
		
	}

	public int getHunger() {
		
		
		return hungerLevel ;
	}

	public void giveFood(int amount) {
		
		hungerLevel =+ amount;
		
	}

}
