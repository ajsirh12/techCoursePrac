package racingGame.domain;

import java.util.List;

public class CarCollection {
	
	List<Car> cars;
	
	public CarCollection(List<Car> cars) {
		this.cars = cars;
	}
	
	public List<Car> getCarCollection(){
		return cars;
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
}
