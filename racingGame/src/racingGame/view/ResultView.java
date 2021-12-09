package racingGame.view;

import static racingGame.constant.ViewConstant.FINAL_RESULT;

import java.util.List;

import racingGame.domain.Car;

public class ResultView {

	public void progressView(Car car) {
		System.out.println(car.getName() + " : " + cntPosition(car.getPosition()));
	}
	
	private String cntPosition(int num) {
		String result = "";
		
		for(int i=0; i<num; i++) {
			result += "_";
		}
		
		return result;
	}
	
	public void resultView(List<Car> carList) {
		System.out.println(FINAL_RESULT + lastWinner(carList));
	}
	
	private String lastWinner(List<Car> carList) {
		String result = "";
		
		for(Car car : carList) {
			result += (car.getName() + ", ");
		}
		result = result.substring(0, result.length() - 2);
		
		return result;
	}
}
