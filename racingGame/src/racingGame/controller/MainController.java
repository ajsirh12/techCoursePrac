package racingGame.controller;

import java.util.Scanner;

import racingGame.domain.CarCollection;
import racingGame.service.CarInputService;
import racingGame.service.ResultService;
import racingGame.service.TryInputService;
import racingGame.service.WinnerService;

public class MainController {
	
	public void start(Scanner sc) {
		mainProcessor(sc);
	}
	
	private void mainProcessor(Scanner sc) {
		CarCollection carCollection;
		CarInputService carInputService = new CarInputService();
		
		carCollection = carInputService.carInput(sc);
		
		int cnt = new TryInputService().tryInputService(sc);
		
		ResultService resultService = new ResultService();
		carCollection = resultService.resultService(carCollection, cnt);
		
		WinnerService winnerService = new WinnerService();
		winnerService.winner(carCollection);
	}
}
