
public class Cat {

	private static final int Default_Full = 20;

	private static final int Default_Happiness = 10;

	private static final int Default_Hunger_Level = 10;

	

	int hungerLevel = Default_Hunger_Level;

	private int getHappy = Default_Happiness;

	private int useIt = Default_Full;

	private int full = Default_Full;

	private int thirst=1;

	private int hunger=1;

	private int bordom=1;

	private String catsName;

	private String catsDescription;

	

	public void giveFood() {

	}

	public int getHunger() {

		hunger++;
		
		return hungerLevel;
	}

	public void giveFood(int amount) {

		hungerLevel = +amount;

	}

	public int getHappy() {

		return getHappy;
	}

	public void play(int tickle) {

		getHappy = +tickle;
	}

	public int full() {

		return full;
	}

	public void relief(int relief) {

		full -= relief;

	}
	
	public Cat(String name, String description,int hunger, int thirst, int boredom) {
		this.thirst = thirst++;
		this.hunger = hunger++;
		this.bordom = bordom+8;
	
		this.catsName=name;
		this.catsDescription=description;
	}
}
