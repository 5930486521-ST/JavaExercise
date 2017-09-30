package logic;

import util.RandomGenerator;

public class HomeWalker extends Walker {
	
	public HomeWalker(String name, int speed) {
		super(name, speed);
	}
	
	public HomeWalker(HomeWalker other) {
		super(other);
	}

	@Override
	public void move() {
		// TODO Fill code
		super.move();
		homeBuff();
	}

	private void homeBuff() {
		// TODO Fill code
		position += RandomGenerator.random(0, 200);
	}
}
