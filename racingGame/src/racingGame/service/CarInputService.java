package racingGame.service;

import static racingGame.constant.ViewConstant.INPUT_CAR_NAME;
import static racingGame.exception.CarInputException.carException;

import java.util.Scanner;

import racingGame.domain.CarCollection;

public class CarInputService {
	public CarCollection carInput(Scanner sc) {
		
		boolean flag = true;
		String carNames = null;
		
		while(flag) {
			System.out.println(INPUT_CAR_NAME);
			
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
