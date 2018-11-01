package refactor.decks;

public class DeckFactory {
	
    //use getdeck method to get object of type shape 
    public Deck getDeck(String deckType) {
        if(deckType == null) {
            return null;
        }		
        if(deckType.equalsIgnoreCase("REDAPPLE")) {
            return new RedApples();
        }
        else if(deckType.equalsIgnoreCase("GREENAPPLE")) {
            return new GreenApples();
        }
       return null;
    }
 }