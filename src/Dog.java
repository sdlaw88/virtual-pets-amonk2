import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.lang.Math;
public class Dog {

	
	private int thirst=0;
	private static int hunger=1;
	private int bordom=0;
	private int apperance = 0;
	private int health = 0;
	private int enegry = 0;
	private String petsName = "";
	private String petDescription = "";
	private static final int Waste = 10;

	private static final int Default_Full = 20;

	private static final int Default_Health_Level = 10;

	private static final int Default_Hunger_Level = 10;


	static Random rand = new Random(10);

	static int hungerLevel = Default_Hunger_Level;

	private int healthLevel = Default_Health_Level;

	private int useIt = Default_Full;

	private int outside=Waste;

	

	public void giveFood(int amount) {

		hungerLevel = +amount;
	}

	public int gethungerLevel() {
		
		return hungerLevel;
	}

	public int getHealth() {

		return healthLevel;
	}

	public void walk(int walk) {

		healthLevel = +walk;

	}

	public int useIt() {

		return useIt;
	}

	public void relief(int outside) {

		useIt -= outside;
		
	}

	public void clean(int dirty) {
		
		outside +=dirty;
		
	}

	public Dog(int thirst, int hunger, int bordom) { 
		this.thirst = thirst++;
		this.hunger = hunger++;
		this.bordom = bordom++;
		
	}

	public Dog(String nameParameter, String descriptionParameter) {
		this.petsName = nameParameter;
		this.petDescription = descriptionParameter;
		
	}
public static int gethunger() {
		
	 hunger++;
	
	return hunger;
		
		
	}
	
}
