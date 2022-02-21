
import java.util.Random;

public class ClassHandler {

	private String bigClass;
	private Reader reader;
	private Random rand;
	private int subClassLevel;

	public ClassHandler() {
		this.bigClass = "";
		this.reader = new Reader();
		this.rand = new Random();
	}

	public String initBigClass() {

		String[] allClasses = reader.runReadFile("allClass").split("-");
		int randIndex = rand.nextInt(allClasses.length);
		this.subClassLevel = allClasses[randIndex].charAt(0);
		String output = allClasses[randIndex].substring(1);
		this.bigClass = output;
		return output;

	}

	public String initSubClass() {
		String inputFile = bigClass +"/subClass";
		String[] allSubs = reader.runReadFile(inputFile).split("-");
		int randIndex = rand.nextInt(allSubs.length);
		return allSubs[randIndex];
	}

	public int getSubClassLevel() {
		return this.subClassLevel;
	}

}
