import java.util.Scanner;
public class RandomizerMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Character output = new Character();
		System.out.println("Type Generate to start generating Characters");
		System.out.println("Type Load to view saved Characters");
		System.out.println("Type Quit to Quit");
		String action = s.next().toLowerCase();
		if (action == "generate") {
			output.displayChar();
			output.rerollChar();
		}
		else if (action == "load") {
			
		}
		else if (action == "quit") {
			s.close();
		}
	}

}
