import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Writer {

	private boolean saveFile = false;

	public Writer() {
	}

	public void initSaveFile() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Saving, Creating new File, attempts: " + i);
			try {
				File myObj = new File("characterComponent\\savedCharacters.txt");
				if (myObj.createNewFile()) {
					saveFile = true;
					System.out.println("File Created!");
					break;

				} else {
					System.out.println("Save Exists!");
					saveFile = true;
					break;
				}
			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}

		}
	}
	
	public void writeSaveData(Character character) {
		String saveData = " ";
		String race = character.getRaceHandler().saveData();
		String classData = character.getClassHandler().saveData();
	}

}
