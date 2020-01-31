
public class RobotDog {

	private static  int Default_Oil_Level = 10;

	public RobotDog() {
		
	}

	int oilLevel= Default_Oil_Level;

	public int getOilLevel() {
		
		
		return oilLevel;
	}

	public void giveOil(int amount) {
		
		oilLevel =+ amount;
	}

}
