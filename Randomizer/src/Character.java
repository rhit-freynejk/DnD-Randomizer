
public class Character {

	private ClassHandler setClass;
	StatHandler stats;
	private String bigClass;
	private String subClass;
	private int level;
	RaceHandler raceHandler = new RaceHandler();
	private String race;

	public Character() {

		this.raceHandler = new RaceHandler();
		this.setClass = new ClassHandler();
		this.stats = new StatHandler();

		stats.setAll(stats.initStatList());

		this.race = raceHandler.initRace();
		this.bigClass = setClass.initBigClass();
		this.subClass = setClass.initSubClass();
		this.level = setClass.initStartLevel();

		stats.doRaceStats(race);
		stats.doASI(level);

	}
	
	public void rerollChar() {
		this.race = raceHandler.initRace();
		stats.setAll(stats.initStatList());
		this.bigClass = setClass.initBigClass();
		this.subClass = setClass.initSubClass();
		this.level = setClass.initStartLevel();
		
		stats.doRaceStats(race);
		stats.doASI(level);
	}

	public void displayChar() {
		System.out.println("Lvl " + level + " " + race + " " + subClass + " " + bigClass);
		System.out.println();
		System.out.println("Str: " + stats.str + " Dex: " + stats.dex + " Con: " + stats.con);
		System.out.println("Int: " + stats.intel + " Wis: " + stats.wis + " Cha: " + stats.cha);
		System.out.println();
	}

	public ClassHandler getClassHandler(){
		return this.setClass;
	}

	public RaceHandler getRaceHandler(){
		return this.raceHandler;
	}

	
	//Debug Commands
	
	public void displaySortedStats() {
		System.out.println(stats.statSort());
	}
}
