import javax.swing.*;
public class CharacterViewer {

	final static int HEIGHT = 835;
	final static int WIDTH = 814;
	final static int xLoc = 200;
	final static int yLoc = 200;
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("DnD Character Randomizer");
		frame.setSize(HEIGHT, WIDTH);
		frame.setLocation(xLoc, yLoc);
	}
}
