package racingGame;

import java.util.Scanner;

import racingGame.controller.MainController;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		MainController controller = new MainController();
		
		controller.start(scanner);
	}

}
