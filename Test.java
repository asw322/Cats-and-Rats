import java.util.*;
public class Test {

	private static Map<String, Animal> catHash = new HashMap<String, Animal>();
	private static Map<String, Animal> ratHash = new HashMap<String, Animal>();
	private static Board board = new Board();

	private static final Scanner console = new Scanner(System.in);

	public static void init() {
		System.out.println("Enter action\n1. Create new character\n2. ..");
		int action = console.nextInt();
		if(action == 1) {
			createCharacter();
		}
		else {
			System.out.println("Invalid action. Try again");
			init();
		}
	}
	private static void createCharacter() {
		System.out.println("Enter character's name: ");
		String name = console.next();
		boolean b = checkString(name);
		if(b == true) {
			System.out.println("Enter animal type: \n1. Cat\n2. Rat");
			int type = console.nextInt();
			if(type == 1) {
				catHash.put(name, new Cat(name));
			}
			else if(type == 2) {
				ratHash.put(name, new Rat(name));
			}
			else {
				System.out.println("Invalid");
				createCharacter();
			}
		}
	}
	private static boolean checkString(String s) {
		if(s.length() < 24) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// init();
		// board.printBoard();
		// Animal cat = new Cat("Tom");
		// board.add(cat);
		// board.printBoard();
		// Animal rat = new Rat();
		// board.add(rat);
		// board.printBoard();

		int i = 3;
		do {
			System.out.println("i: " + i);
			i++;
		}
		while(i < 5);

		for(i = 3; i < 5; i++) {
			System.out.println("i: " + i);
		}
	}
}