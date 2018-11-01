package refactor.views;

import java.util.List;

public class GameView {
	public void printDeckDetails(List<String> greenApples, List<String> redApples){
		System.out.println("Decks: ");
		System.out.println("Cards in Green Deck: " + greenApples.size());
		System.out.println("Cards in Red Deck: " + redApples.size());
	}
}

