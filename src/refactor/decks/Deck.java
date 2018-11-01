package refactor.decks;

import java.util.List;

public interface Deck {
    List<String> createDeckFromFile();
    List<String> shuffleDeck(List<String> deck);
 }