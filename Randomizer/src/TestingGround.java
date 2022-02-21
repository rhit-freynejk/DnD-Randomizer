
public class TestingGround {

	public static void main(String[] args) {

		ClassHandler setClass = new ClassHandler();
		
		for (int i = 0; i < 4; i++) {
			String bigClass = setClass.initBigClass();
			String subClass = setClass.initSubClass();
			System.out.println(subClass + " " + bigClass);
		}

	}
}
