package racingGame.view;

import static racingGame.constant.ViewConstant.FINAL_RESULT;
import static racingGame.constant.ViewConstant.PROC_RESULT;

import racingGame.domain.Car;
import racingGame.domain.CarCollection;

public class ResultView {
	
	public void titleView() {
		System.out.println(PROC_RESULT);
	}

	public void progressView(Car car) {
		System.out.println(car.getName() + " : " + cntPosition(car.getPosition()));
	}
	
	private String cntPosition(int num) {
		String result = "";
		
		for(int i=0; i<num; i++) {
			result += "- ";
		}
		
		return result;
	}
	
	public void resultView(CarCollection cars) {
		System.out.println(FINAL_RESULT + lastWinner(cars));
	}
	
	public void resultView(String winners) {
		System.out.println(FINAL_RESULT + winners);
	}
	
	private String lastWinner(CarCollection cars) {
		String result = "";
		
		for(Car car : cars.getCarCollection()) {
			result += (car.getName() + ", ");
		}
		result = result.substring(0, result.length() - 2);
		
		return result;
	}
}
