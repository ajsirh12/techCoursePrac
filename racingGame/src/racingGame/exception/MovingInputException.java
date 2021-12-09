package racingGame.exception;

import static racingGame.constant.InputExceptionConstant.INCORRECT_NUM;;

public class MovingInputException {
	
	private MovingInputException() {
		
	}
	
	public int movingException(String num) {
		return chkNum(num);
	}

	private int chkNum(String num) {
		int result;
		try {
			result = Integer.parseInt(num);
		}catch (Exception e) {
			// TODO: handle exception
			throw new IllegalArgumentException(INCORRECT_NUM);
		}
		
		return result;
	}
}
