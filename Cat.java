public class Cat extends Animal {
	private int kills = 0;
	public Cat() {
		super();
	}
	public Cat(String name) {
		super(name);
	}
	public void eat(Rat rat) {
		if(rat.getHiding() == false) {
			System.out.println("Found rat!");
			kills++;
			rat.dead();
		}
		else {
			System.out.println("Something is suspicious.. ");
		}
	}
}