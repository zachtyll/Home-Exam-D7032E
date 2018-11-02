package refactor.views;

import java.util.List;

public class PlayerView {
	public void printPlayerDetails(List<String> greenApples, List<String> redApples){
		System.out.println("Cards in hand: ");
		for (String element : redApples) {
			System.out.println("[" + (redApples.indexOf(element)+ 1) + "]"+ element);
		}
	}
}

