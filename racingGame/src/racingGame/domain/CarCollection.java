package racingGame.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarCollection {
	
	private List<Car> cars;
	private List<Car> copyCars = new ArrayList<Car>();
	
	public CarCollection(List<Car> cars) {
		this.cars = cars;
	}
	
	public List<Car> getCarCollection(){
		Collections.copy(copyCars, cars);
		return copyCars;
	}
	
	public String getCarName(int i) {
		Car car = cars.get(i);
		
		return car.getName();
	}
	
	public int getCarPosition(int i) {
		Car car = cars.get(i);
		
		return car.getPosition();
	}
	
	public void moveCarPosition(int i) {
		Car car = cars.get(i);
		
		car.carMove();
	}
	
	public int getCarSize() {
		return cars.size();
	}
	
	public Car getCar(int i) {
		return cars.get(i);
	}
}
