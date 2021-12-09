package racingGame.exception;

import racingGame.view.Constant;

public class CarInputException implements Constant {
	
	private static final String SPLIT_WORD = ",";
	
	public void carException(String cars) {
		
		String[] carArr = cars.split(SPLIT_WORD);
		
		for(String str : carArr) {
			if(str.length() <= 0 || str.length() > 5) {
				throw new IllegalArgumentException(INCORRECT_CAR_NAME);
			}
		}
	}
	
}
