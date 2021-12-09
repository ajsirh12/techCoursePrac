package racingGame.exception;

import static racingGame.constant.InputExceptionConstant.INCORRECT_NUM;;

public class MovingInputException {
	
	private MovingInputException() {
		
	}
	
	public void movingException(String num) {
		chkNum(num);
	}

	private void chkNum(String num) {
		try {
			int i = Integer.parseInt(num);
		}catch (Exception e) {
			// TODO: handle exception
			throw new IllegalArgumentException(INCORRECT_NUM);
		}
	}
}
