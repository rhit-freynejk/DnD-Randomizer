import java.util.ArrayList;
import java.util.Random;

public class RaceHandler {

	private ArrayList<String> subRaces;
	private Random rand;
	private Reader reader;
	private String race;
	private int raceIndex;
	public RaceHandler() {

		this.race = " ";
		this.subRaces = new ArrayList<String>();
		this.rand = new Random();
		this.reader = new Reader();

	}

	public String initRace() {

		String[] allRaces = reader.runReadFile("allRaces").split("-");
		int randIndex = rand.nextInt(allRaces.length);
		this.race = allRaces[randIndex];
		raceIndex = randIndex;
		// parseRaceData();
		return race;
	}
	
	public String saveData() {
		String save = " ";
		save = Integer.toHexString(raceIndex) + "|";
		System.out.println(raceIndex);
		System.out.println(save);
		return save;
	}
//	public void parseRaceData() {
//		int breakIndex = 0;
//		int subClassIndex = 0;
//		for (int i = 0; i < raceData.length(); i++) {
//			if (raceData.charAt(i) == '|') {
//				breakIndex = i;
//			}
//
//			else if (raceData.charAt(i) == '{') {
//				subClassIndex = i;
//			}
//		}
//		this.race = raceData.substring(breakIndex, subClassIndex);
//		String[] statMods = raceData.substring(0, breakIndex).split("|");
//		this.statMods = statMods;
//		String[] subraces = raceData.substring(subClassIndex).split("/");
//		for (int i = 0; i < subraces.length; i++) {
//			this.subRaces.add(subraces[i]);
//		}
//	}
}
