public class Rat extends Animal {
	private boolean hiding = false;
	public Rat() {
		super();
	}
	public Rat(String name) {
		super(name);
	}
	public void setHiding() {
		this.hiding = true;
	}
	public boolean getHiding() {
		return this.hiding;
	}
}