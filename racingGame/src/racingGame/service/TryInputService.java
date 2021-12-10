package racingGame.service;

import static racingGame.exception.MovingInputException.movingException;

import java.util.Scanner;

import racingGame.view.TryCntView;

public class TryInputService {
	
	public int tryInputService(Scanner sc) {
		
		boolean flag = true;
		String cnt = null;
		
		TryCntView tryCntView = new TryCntView();
		
		while(flag) {
			tryCntView.cntView();
			
			cnt = sc.next();
			
			flag = chkInput(cnt);
		}
		
		return Integer.parseInt(cnt);
	}

	private boolean chkInput(String cnt) {
		
		try {
			movingException(cnt);
			return false;
		}catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println(e);
			return true;
		}
		
	}

}
