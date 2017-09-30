package logic;
import util.RandomGenerator;

public class Walker {
	protected String name;
	protected int speed;
	protected int position;

	public Walker(String name, int speed) {
		// TODO Fill code
		this.name = name;
		this.speed = speed;
	}
	
	public Walker(Walker other) {
		this.name = other.name;
		this.speed = other.speed;
		this.position = other.position;
	}

	public void move() {
		// TODO Fill code
		position += (speed + RandomGenerator.random(0, 200));
	}

	public String getName() {
		return name;
	}

	public int getSpeed() {
		return speed;
	}

	public int getPosition() {
		return position;
	}

}
