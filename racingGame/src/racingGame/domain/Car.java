package racingGame.domain;

public class Car {
	
	private final String name;
	private int position = 0;
	
	public Car(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
}
