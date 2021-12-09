package racingGame.service;

import static racingGame.constant.ViewConstant.INPUT_CAR_NAME;
import static racingGame.exception.CarInputException.carException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import racingGame.domain.Car;

public class CarInputService {
	public List<Car> carInput(Scanner sc) {
		
		List<Car> carList = new ArrayList<Car>(); 
		
		boolean flag = true;
		
		while(flag) {
			System.out.println(INPUT_CAR_NAME);
			
			String carNames;
			carNames = sc.next();
			
			flag = chkInput(carNames);
		}
		
		return carList;
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
