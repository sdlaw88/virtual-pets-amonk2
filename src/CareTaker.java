
public class CareTaker {

	public CareTaker(String employeeNum, String name, String favAnimal) {
		
	}

	public void giveOil(RobotDog robotDog) {
		robotDog.giveOil(10);
		
	}

	public void feedDog(Dog dog) {
		dog.giveFood(10);
		
	}

	public void feedCat(Cat cat) {

		cat.giveFood(10);
		
	}

	public void walkDog(Dog dog) {
		dog.walk(5);
		
	}

	public void playWithCat(Cat cat) {
		cat.play(5);
		
	}

	public void relief(Dog dog) {
		 dog.relief(10);
		
	}

	public void relief(Cat cat) {
		cat.relief(10);
		
	}

	
}
