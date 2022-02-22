import java.util.Random;
import java.util.ArrayList;

public class StatHandler {

	private ArrayList<Integer> statList;
	int str;
	int dex;
	int con;
	int wis;
	int intel;
	int cha;
	private Random rand;

	public StatHandler() {

		this.statList = new ArrayList<Integer>();
		this.rand = new Random();

	}

	public StatHandler(String str) {
		this.rand = new Random();
		this.statList = new ArrayList<Integer>(6);
	}

	public ArrayList<Integer> initStatList() { // Inits Stats with the take 7, drop the lowest style
		int cur = 0;
		int lowest = 3; // Loweest possible stat to check
		int lowestIndex = 0;
		ArrayList<Integer> topSeven = new ArrayList<Integer>();
		for (int i = 0; i < 7; i++) {
			int toSet = 3 + rand.nextInt(16);
			topSeven.add(toSet);
		}
		for (int i = 0; i < topSeven.size(); i++) {
			cur = topSeven.get(i);
			if (cur < lowest) {
				lowest = cur;
				lowestIndex = i;
			}

		}
		topSeven.remove(lowestIndex);
		this.statList = topSeven;
		return topSeven;
	}

	public void setAll(ArrayList<Integer> allStats) {
		setStr(allStats.get(0));
		setDex(allStats.get(1));
		setCon(allStats.get(2));
		setWis(allStats.get(3));
		setIntel(allStats.get(4));
		setCha(allStats.get(5));
	}

	public void setAll() {
		setStr(0);
		setDex(0);
		setCon(0);
		setWis(0);
		setIntel(0);
		setCha(0);
	}

	public void setStr(int str) {
		this.str = str;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public void setWis(int wis) {
		this.wis = wis;
	}

	public void setIntel(int intel) {
		this.intel = intel;
	}

	public void setCha(int cha) {
		this.cha = cha;
	}

	public void doASI(int level) {
		for (int i = 0; i < level; i++) {
			if (i % 4 == 0) {
				for (int j = 0; j < 2; j++) {
					int ind = rand.nextInt(6);
					if (statList.get(ind) < 20) {
						statList.set(ind, statList.get(ind) + 1);
					}

				}

			}
		}
		setAll(statList);
	}
}
