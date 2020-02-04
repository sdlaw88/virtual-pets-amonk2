import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VirtualPetAmonkTest {

	CareTaker underTest = new CareTaker(" ", " ", " ");
	Dog dog = new Dog();
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
	public void  ShouldBeAbleToIncreasePetHealthWithWalk() {
		Dog dog = new Dog();
		
		int levelOfHealthBeforeWalk=dog.getHealth();
		underTest.walkDog(dog);
		int levelofHealthAfterWalk=dog.getHealth();
		assertThat(levelofHealthAfterWalk+levelOfHealthBeforeWalk, is (15));
	}

	@Test
	public void ShouldBeAbleToPlayWithCat() {
		Cat cat =new Cat();
		
		int beforePlayingWithCat = cat.getHappy();
		underTest.playWithCat(cat);
		int afterPlayingWithCat= cat.getHappy();
		assertThat(beforePlayingWithCat+afterPlayingWithCat, is (15));
	}

	@Test
	public void ShouldBeAbleToUseBathroom() {
	
		
		int beforeGoing = dog.useIt();
		underTest.relief(dog);
		int afterGoing=dog.useIt();
		assertThat(beforeGoing-afterGoing, is (10));
	}

	@Test
	public void ShouldBeAbleToUseLitterBox() {
		Cat cat = new Cat();
		int needsTheLitterBox = cat.full();
		underTest.relief(cat);
		int usedTheLitterBox= cat.full();
		assertThat(needsTheLitterBox-usedTheLitterBox, is (10));
	}
	//Come back to this test
	@Test
	public void CanCleanCageWhenItIsFull() {
		CareTaker caretaker = new CareTaker();
	int beforeChangingTheCage = VirtualPetShelter.dirtyCage();
		underTest.clean(dog);
	int afterCleaningTheCage = VirtualPetShelter.dirtyCage();
	assertThat(afterCleaningTheCage-beforeChangingTheCage, is (10));
	}
	
	
}
