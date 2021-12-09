package racingGame.controller;

import java.util.Scanner;

import racingGame.domain.CarCollection;
import racingGame.service.CarInputService;

public class MainController {
	
	public void start(Scanner sc) {
		mainProcessor(sc);
	}
	
	private void mainProcessor(Scanner sc) {
		CarCollection carCollection;
		CarInputService carInputService = new CarInputService();
		
		carCollection = carInputService.carInput(sc);
	}
}
