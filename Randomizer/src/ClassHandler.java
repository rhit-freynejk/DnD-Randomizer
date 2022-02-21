
import java.util.Random;

public class ClassHandler {

	String bigClass;
	private Reader reader;
	private Random rand;
	int subClassLevel;
	private LevelHandler levelHandler;
	int atLevel;

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
		setSubClassLevel(Integer.parseInt(classLevel));
		String output = allClasses[randIndex].substring(1);
		this.bigClass = output;
		return output;

	}

	public String initSubClass() {
		if (this.subClassLevel > this.atLevel) {
			return "";
		} else {
			String inputFile = bigClass + "/subClass";
			String[] allSubs = reader.runReadFile(inputFile).split("-");
			int randIndex = rand.nextInt(allSubs.length);
			return allSubs[randIndex];
		}
	}

	public void setSubClassLevel(int intake) {
		this.subClassLevel = intake;
	}

	public int initStartLevel() {
		this.atLevel = levelHandler.initStartLevel();
		return levelHandler.initStartLevel();
	}

}
