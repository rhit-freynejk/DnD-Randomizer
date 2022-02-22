
public class TestingGround {

	public static void main(String[] args) {

		ClassHandler setClass = new ClassHandler();
		StatHandler stats = new StatHandler();
		stats.setAll(stats.initStatList());
		
		
		for (int i = 0; i < 10; i++) {

			int lvl = setClass.initStartLevel();
			stats.setAll(stats.initStatList());
			String bigClass = setClass.initBigClass();
			String subClass = setClass.initSubClass();
			System.out.println("This Class gets a subclass at " + setClass.getSubClassLevel());
			System.out.println("You Rolled A Level " + lvl + " " + subClass + " " + bigClass);
			stats.doASI(lvl);
			System.out.println("");
			System.out.println("Str: " + stats.str + " Dex: " + stats.dex + " Con: " + stats.con);
			System.out.println("Int: " + stats.intel + " Wis: " + stats.wis + " Cha: " + stats.cha);
			System.out.println();
		}

	}
}
