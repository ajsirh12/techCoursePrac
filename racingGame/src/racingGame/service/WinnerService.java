package racingGame.service;

import java.util.ArrayList;
import java.util.List;

import racingGame.domain.Car;
import racingGame.domain.CarCollection;
import racingGame.view.ResultView;

public class WinnerService {
	
	ResultView resultView = new ResultView();
	
	public void winner(CarCollection carCollection) {
		String winner = firstPrize(carCollection);
		
		resultView.resultView(winner);
	}
	
	private String firstPrize(CarCollection carCollection) {
		String result = "";
		
		int size = carCollection.getCarSize();
		List<Car> first = new ArrayList<Car>();
		
		first.add(carCollection.getCar(0));
		
		for(int i=1;i<size;i++) {
			first = max(first, carCollection.getCar(i));
		}
		
		result = getFirst(first);
		
		return result;
	}
	
	private List<Car> max(List<Car> max, Car car) {
		List<Car> cars = max;
		Car maxCar = cars.get(0);
		
		if(maxCar.getPosition() < car.getPosition()) {
			cars.removeAll(cars);
			cars.add(car);
		}
		else if(maxCar.getPosition() == car.getPosition()) {
			cars.add(car);
		}
		
		return cars;
	}
	
	private String getFirst(List<Car> cars) {
		String result = "";
		
		for(Car car : cars) {
			if(result.equals("")) {
				result += car.getName();
			}
			else if(!result.equals("")) {
				result = result + ", " + car.getName();
			}
		}		
		
		return result;
	}
}
