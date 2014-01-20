import info.gridworld.actor.Bug;
public class DancingBug extends Bug{
	private	int[] intArray;
	private int step;

	public DancingBug(int[] turns) {
		intArray = turns;
		step = 0;
	}

	public void turn(int times) {
		for (int i=1; i<=times; i++) {
			turn();
		}
	}

	public void act() {
		if (step == intArray.length) {
			step = 0;
			turn(intArray[step]);
			super.act();
		}
	}