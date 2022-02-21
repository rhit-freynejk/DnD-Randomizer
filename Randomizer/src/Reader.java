import java.io.*;
import java.util.Scanner;

public class Reader {

	public Reader() {
	}
	
	
	public static String readFile(String inputFile) {
		Scanner scanner = null;
		String fromFile = "";
		File f1 = null;
		try {
			f1 = new File(inputFile);
			scanner = new Scanner(f1);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			File parentFolder = f1.getParentFile();
			System.out.println("Folder searched for the file not found: " + parentFolder.getAbsolutePath());
			System.exit(1);
		} // end try-catch

		while (scanner.hasNextLine()) {
			fromFile += scanner.nextLine();
			
		} // end while
		return fromFile;
	}
	
	public String runReadFile(String toRead) {
		String inputFile = "characterComponent/" + toRead;
		return readFile(inputFile);
	}
}