package racingGame.service;

import racingGame.domain.CarCollection;
import racingGame.view.ResultView;

public class ResultService {
	
	public CarCollection resultService(CarCollection carCollection, int cnt) {
		
		CarCollection result = carCollection;
		
		ResultView resultView = new ResultView();
		
		resultView.titleView();
		
		result = progress(carCollection, cnt);
				
		return result;
	}
	
	private CarCollection progress(CarCollection carCollection, int cnt) {
		CarCollection result = carCollection;
		
		for(int i=0; i<cnt; i++) {
			goStop(carCollection);			
			System.out.println();
		}
		
		return result;
	}
	
	private CarCollection goStop(CarCollection carCollection) {
		CarCollection result = carCollection;
		
		ResultView resultView = new ResultView();
		RandomService random = new RandomService();
		int size = result.getCarSize();
		
		for(int i=0; i<size; i++) {
			if(random.rand0to9()) {
				result.moveCarPosition(i);
			}
			resultView.progressView(result.getCar(i));
		}
		
		return result;
	}
}
