package racingGame.exception;

import static racingGame.constant.CarExceptionConstant.*;

public class CarInputException {
	
	private CarInputException() {
		
	}
	
	static public void carException(String cars) {
		String[] carArr = cars.split(SPLIT_WORD);
		
		for(String str : carArr) {
			chkLength(str);
		}
	}
	
	private static void chkLength(String str) {
		if(str.length() <= 0 || str.length() > 5) {
			throw new IllegalArgumentException(INCORRECT_CAR_NAME);
		}
	}
	
}
