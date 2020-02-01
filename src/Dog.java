
public class Dog {

	


	private static final int Default_Full = 20;



	private static final int Default_Health_Level = 10;



	private static final int Default_Hunger_Level = 10;
	
	
	
	int hungerLevel=Default_Hunger_Level;


	

	private int healthLevel=Default_Health_Level;



	private int useIt=Default_Full;
	
	public int gethunger() {
		
		
		return hungerLevel;
	}

public void giveFood(int amount) {
		
		hungerLevel=+amount;
	}


	
public int	gethungerLevel() {
	return hungerLevel;
}

public int getHealth() {
	
	return healthLevel;
}

public void walk(int walk) {
	
	healthLevel=+walk;
	
}

public int useIt() {
	
	
	return useIt;
}

public void relief(int outside) {
	
	useIt-=outside;

}





 
}

