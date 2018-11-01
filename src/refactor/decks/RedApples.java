package refactor.decks;

import java.io.IOException;
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class RedApples implements Deck {

    @Override
    public List<String> createDeckFromFile() {
        List<String> deck = new ArrayList<String>();
        
        Path card_path = Paths.get("D7032E-Home-Exam/inputfiles/", "redApples.txt");

        try {
            List<String> lines = Files.readAllLines(card_path, StandardCharsets.ISO_8859_1);
        
        for (String line : lines) {
                deck.add(line);
            }
        }   catch (IOException e) {
                System.out.println(e);
            }
        return deck;
    }

    @Override
    public List<String> shuffleDeck(List<String> deck) {
        // Shuffle the deck.
        Collections.shuffle(deck);
        return deck;
    }
 }