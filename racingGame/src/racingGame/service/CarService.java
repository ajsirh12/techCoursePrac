package racingGame.service;

import java.util.ArrayList;
import java.util.List;

import racingGame.domain.Car;
import racingGame.domain.CarCollection;

public class CarService {
	
	public CarCollection carCollection(String carNames){
		return makeCarCollection(carNames);
	}
	
	private CarCollection makeCarCollection(String carNames) {
		
		String[] carArr = carNames.split(",");
		List<Car> carList = makeCarList(carArr);
		
		return new CarCollection(carList);
	}
	
	private List<Car> makeCarList(String[] carArr){
		List<Car> carList = new ArrayList<Car>();
		
		for(String str : carArr) {
			carList.add(new Car(str));
		}
		
		return carList;
	}
}
