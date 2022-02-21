
import java.util.Random;

public class ClassHandler {

	String bigClass;
	private Reader reader;
	private Random rand;
	int subClassLevel;
	private LevelHandler levelHandler;
	private int atLevel;

	public ClassHandler() {
		this.bigClass = "";
		this.reader = new Reader();
		this.rand = new Random();
		this.levelHandler = new LevelHandler();
		this.atLevel = levelHandler.initStartLevel();
		this.subClassLevel = 0;
	}

	public String initBigClass() {

		String[] allClasses = reader.runReadFile("allClass").split("-");
		int randIndex = rand.nextInt(allClasses.length);
		String classLevel = String.valueOf(allClasses[randIndex].charAt(0));
		this.subClassLevel = Integer.parseInt(classLevel);
		String output = allClasses[randIndex].substring(1);
		this.bigClass = output;
		return output;

	}

	public String initSubClass() {
		if (this.atLevel < this.subClassLevel) {
			return "";
		} else {
			String inputFile = bigClass + "/subClass";
			String[] allSubs = reader.runReadFile(inputFile).split("-");
			int randIndex = rand.nextInt(allSubs.length);
			return allSubs[randIndex];
		}
	}

	public int getSubClassLevel() {
		return this.subClassLevel;
	}

	public int initStartLevel() {
		this.atLevel = levelHandler.initStartLevel();
		return levelHandler.initStartLevel();
	}

}
