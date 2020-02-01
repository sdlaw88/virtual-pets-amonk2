
public class Cat {



	private static final int Default_Full = 20;

	private static final int Default_Happiness = 10;

	private static final int Default_Hunger_Level = 10;
	
	int hungerLevel = Default_Hunger_Level;

	private int getHappy = Default_Happiness;

	private int useIt=Default_Full;

	private int full=Default_Full;
	
	

	public void giveFood() {
		
		
	}

	public int getHunger() {
		
		
		return hungerLevel ;
	}

	public void giveFood(int amount) {
		
		hungerLevel =+ amount;
		
	}


	public int getHappy() {
		
		return getHappy ;
	}

	public void play(int tickle) {
		
		getHappy=+ tickle;
	}

	public int full() {
		
		return full;
	}

	public void relief(int relief) {
		
		full-=relief;
		
	}

	

}
