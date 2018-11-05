package refactor.views;

import java.util.List;
import refactor.models.PlayerModel;

public class GameView {
	public void printGameDetails(List<String> greenApples, List<String> redApples, List<PlayerModel> playerList){
		System.out.println("Decks: ");
		System.out.println("Cards in Green Deck: " + greenApples.size());
		System.out.println("Cards in Red Deck: " + redApples.size());
		
		
		for (PlayerModel element : playerList) {
			System.out.println("[" + (playerList.indexOf(element)+ 1) + "]"+ element.getRedApples());
			System.out.println(element.getRedApples().size());
		}
	}
}

