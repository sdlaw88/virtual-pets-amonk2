
public class Dog {

	private static final int Default_relief = -10;


	private static final int Default_Hunger_Level = 10;
	
	
	int useIt=Default_relief;
	int hungerLevel=Default_Hunger_Level;


	private int rdyToGo=20;
	
	public int gethunger() {
		
		
		return hungerLevel;
	}

public void giveFood(int amount) {
		
		hungerLevel=+amount;
	}


	
public int	gethungerLevel() {
	return hungerLevel;
}



public int getNeedToGo() {
	
	return rdyToGo;
}

public void bowlMovement(Dog dog) {
	
	
}

private void useIt(int useIt) {
	
	
	
}

 
}

