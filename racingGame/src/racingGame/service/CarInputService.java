package racingGame.service;

import static racingGame.constant.ViewConstant.INPUT_CAR_NAME;
import static racingGame.exception.CarInputException.carException;

import java.util.Scanner;

import racingGame.domain.CarCollection;
import racingGame.view.CarInputView;

public class CarInputService {
	public CarCollection carInput(Scanner sc) {
		
		boolean flag = true;
		String carNames = null;
		
		CarInputView carInputView = new CarInputView();
		
		while(flag) {
			carInputView.carInputView();
			
			carNames = sc.next();
			
			flag = chkInput(carNames);
		}
		
		CarCollection carCollection = new CarService().carCollection(carNames);
		
		return carCollection;
	}
	
	private boolean chkInput(String carNames) {
		
		try {
			carException(carNames);
			return false;
		}catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println(e);
			return true;
		}
		
	}
}
