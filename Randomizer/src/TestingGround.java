
public class TestingGround {

	public static void main(String[] args) {

		ClassHandler setClass = new ClassHandler();

		for (int i = 0; i < 5; i++) {

			int lvl = setClass.initStartLevel();
			String bigClass = setClass.initBigClass();
			String subClass = setClass.initSubClass();
			System.out.println("This Class gets a subclass at " + setClass.getSubClassLevel());
			System.out.println("You Rolled A Level " + lvl + " " + subClass + " " + bigClass);
			System.out.println("");
		}

	}
}
