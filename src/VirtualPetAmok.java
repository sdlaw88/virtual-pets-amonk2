import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class VirtualPetAmok {

	private static String userName;
	private static String help;
	private static int yourAnswer;
	private static String Cage1;
	private static String Cage2;
	private static String Cage3;
	private static int thirst;
	private static int hunger;
	private static int bordom;
	public static String yourChoice;
	private static String catsName;
	private static String catsDescription;
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Welcome To Virtual Pet Amok");
		System.out.println("What is your name?");
		userName = input.nextLine();
		
		System.out.println("Hello "  + userName + " Here is a list of options for your Virtual Pet");
		
		System.out.println("Here is a list of virtual pets in this Amok");
		Cat cat = new Cat (catsName, catsDescription, hunger, thirst, bordom );
		
		Map<Integer,Cat>cats=new HashMap<>();
		Map<String,String>dogs= new HashMap<String, String>();
		Map<String,Integer>hunger= new HashMap<String, Integer>();
		Map<String, Integer>cathunger=new HashMap<String, Integer>();
		dogs.put("Cage1", "Hot Sauce Harvey");
		dogs.put("Cage2", "King Henry");
		dogs.put("Cage3", "Bobby the Begeale");
		
		cats.put(1,cat);
		
		System.out.println("The Current Residents are " + dogs + cats);
	System.out.println("Type \"help\" for a list of options\"");

	help=input.nextLine();
	

	// These are the controls for interacting with your pet 
		if (help.equals(("help").toLowerCase())) {
		System.out.println("choose"+" "+ 1 +" "+ "for feeding animals in the shelter");
		System.out.println("choose"+" "+ 2 +" "+ "to give water to animals in the shelter");
		System.out.println("choose"+" "+ 3 +" "+"to walk the animals in the shelter");
		System.out.println("choose"+" "+ 4 +" "+ "to play with animals in the shelter");
		System.out.println("choose"+" "+ 5 +" "+"to discipline animal");
		System.out.println("Clean cages for dogs "+6);
		System.out.println("Clean cages for cats "+7);
		System.out.println("Add a new pet to shelter " + 8);
		System.out.println("choose "+ 9 + " to end the game");
		}
		else System.out.println("please follow instructions provided");
	yourAnswer=input.nextInt();
	
	if (yourAnswer==1) {
		
		System.out.println("Press "+ 1+ " to feed dogs " +2+ " to feed cats" );
		
		yourAnswer=input.nextInt();
		
		if(yourAnswer==1) {
			System.out.println("Which dog would you like to feed");
			System.out.println(dogs);
			
		
			hunger.put("Cage1",Dog.gethunger());
			hunger.put("Cage2",Dog.gethunger());
			hunger.put("Cage3",Dog.gethunger());
		
			String dogsName = dogs.get("Cage1");
			String dogsName2 = dogs.get("Cage2");
			String dogsName3 = dogs.get("Cage3");
			
			System.out.println("Level of hunger by cage (not hungry)0-10 (extremely hungry): ");
			System.out.println(hunger);
		
			System.out.println("Use the cage and number you want from choices above");
			
		
			yourChoice= input.next();
			
		
		if (yourChoice.equals("cage1".toLowerCase())) {
			
			
			System.out.println(hunger);
			System.out.println("you fed "+ dogsName);
		}
		if (yourChoice.equals("cage2".toLowerCase())) {
			
			
			System.out.println(hunger);
			System.out.println("you fed "+ dogsName2);
		}
		if  (yourChoice.equals("cage3".toLowerCase())) {
			
			
			System.out.println(hunger);
			System.out.println("you fed "+ dogsName3);
		}
	
		}
	
	if (yourAnswer==2) {

		System.out.println("You have to name your cat ");
		
		catsName=input.next();
		
	System.out.println("You should describe your cat");
	
		catsDescription=input.next();
	}
		
		System.out.println(catsName +" is a " + catsDescription + " cat");
	
		System.out.println("You have a new cat named "+ catsName);
		cats.put(1, cat);
		Cat catStuff=cats.get(cat);
		System.out.println(catStuff);   
	}
	
	if (yourAnswer==2) {
		
		System.out.println("Press "+ 1+ " to give water to dogs " +2+ " to give water to cats" );
		
		yourAnswer=input.nextInt();
		
		if (yourAnswer==1) {
			
			System.out.println("which dog would you like to give water to ");
		
			System.out.println(dogs);
		System.out.println("Please type out the cage and number to provide water to that pet");
		yourChoice= input.next();
		
			if (yourChoice.toLowerCase().equals("cage1")) {
				String dogsName = dogs.get("Cage1");
				System.out.println("You just gave water to " + dogsName);
			}
		
			if(yourChoice.toLowerCase().equals("cage2")) {
				
				String dogsName2 = dogs.get("Cage2");
				
				System.out.println("You just gave water to " + dogsName2);
			}		
			
			if(yourChoice.toLowerCase().equals("cage3")) {
				
				String dogsName3 = dogs.get("Cage3");
				
				System.out.println("You just gave water to "+ dogsName3);
			
			}
		
		}
		
	
	}
	}


}
	



