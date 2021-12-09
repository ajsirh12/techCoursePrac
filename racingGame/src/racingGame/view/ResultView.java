package racingGame.view;

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
}
