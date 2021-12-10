package racingGame.service;

public class RandomService {
	
	public boolean rand0to9() {
		
		int result = (int) ((Math.random()*235)%10);
		
		if(result >= 4) {
			return true;
		}
		
		return false;
	}
}
