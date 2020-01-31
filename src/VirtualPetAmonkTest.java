import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VirtualPetAmonkTest {

	CareTaker underTest = new CareTaker(" ", " ", " ");
	
	@Test
	public void ShouldBeAbleToReceiveOil() {
		 RobotDog robotDog = new RobotDog();
	
		int oilLevelBefore = robotDog.getOilLevel();
		underTest.giveOil(robotDog);
		int oilLevelAfter = robotDog.getOilLevel();
		assertThat(oilLevelBefore + oilLevelAfter, is(20));
	}

	@Test
	public void ShouldBeAbleToEatDogFood() {
		Dog dog = new Dog();
		
		int hungerLevelBefore = dog.gethunger();
		underTest.feedDog(dog);
		int hungerLevelAfter = dog.gethunger();
		assertThat(hungerLevelBefore + hungerLevelAfter, is (20));
	}
	@Test
	public void ShouldBeAbleToEatCatFood() {
		Cat cat = new Cat();
				
		int hungerLevelBefore = cat.getHunger();
		underTest.feedCat(cat);
		int hungerLevelAfter = cat.getHunger();
		assertThat(hungerLevelBefore+hungerLevelAfter, is(20));
	}

	
	@Test
	public void  HaveBowlMovementsWhenFull() {
		Dog underTest = new Dog();
		Dog dog = new Dog();
		
		int urgeToGo = dog.getNeedToGo();
		underTest.bowlMovement(dog);
		int afterGoing= dog.getNeedToGo();
		assertThat(urgeToGo-afterGoing, is(10));
	}
}
