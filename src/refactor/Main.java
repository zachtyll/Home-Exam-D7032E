package refactor;

import refactor.programState.*;
import refactor.config.ConfigSingleton;
import java.io.IOException;

public class Main {

    // DeckFactory DeckFactory = new DeckFactory();
 
        // // Get an object of redApples and call createDeckFromFile method to scan the text file.
        // Deck redDeck = DeckFactory.getDeck("REDAPPLE");
        // List redApples = redDeck.createDeckFromFile();
        // // Shuffle the deck.
        // greenDeck.shuffleDeck(redApples);

        // // Get an object of greenApples and call createDeckFromFile method to scan the text file.
        // Deck greenDeck = DeckFactory.getDeck("GREENAPPLE");
        // List greenApples = greenDeck.createDeckFromFile();
        // // Shuffle the deck.
        // greenDeck.shuffleDeck(greenApples);

    public static void main(String[] args) throws IOException {
    	
    	//illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        ConfigSingleton config = ConfigSingleton.getInstance();

        //show the message
        config.showMessage();

    	
        ProgramContext context = new ProgramContext();

        StartProgramState startGameState = new StartProgramState();
        startGameState.doAction(context);
        

        System.out.println(context.getState().toString());
        System.out.println(context.getState().toString());

        // // Set<Role> setA = new HashSet();

        // // Role element = new JudgeRoleDecorator(new Judge());
        // // Role element2 = new DealerRoleDecorator(new Dealer());
        // // setA.add(element);
        // // setA.add(element2);
        // // setA.add(element);

        // // for(Role roles : setA) {
        // //     roles.canAct();
        // // }

        // //fetch Player record based on his roll no from the database
        // APlayer model  = retrivePlayerFromDatabase();

        // //Create a view : to write Player details on console
        // PlayerView view = new PlayerView();

        // PlayerController controller = new PlayerController(model, view);

        // controller.updateView();

        // //update model data
        
    



        // controller.updateView();

        // List<Role> roleList = new ArrayList<Role>();
        // createNewRoles(roleList);
    
        // roleList.get(2).canAct();
        // promotePlayer(roleList, 2);
        // roleList.get(2).canAct();
      
        // roleList.get(1).canAct();
        // promotePlayer(roleList, 1);
        // roleList.get(1).canAct();

    }

    // private static void promotePlayer(List<Role> roleList, Integer whichRole) {
    //     roleList.get(whichRole).setRole(true);
    // }

    // private static List<Role> createNewRoles(List<Role> roleList) {
    //     roleList.add(new JudgeRoleDecorator(new Judge()));
    //     roleList.add(new JudgeRoleDecorator(new Judge()));
    //     roleList.add(new DealerRoleDecorator(new Dealer()));
    //     return roleList;    
    // }

//    private static APlayer retrivePlayerFromDatabase() {
//         APlayer APlayer = new APlayer();
//         APlayer.setPlayerID("Robert");
//         APlayer.setPlayerType("10");
//         return APlayer;
//    }

        
    

    // roleList.add(new JudgePlayerDecorator(new HumanPlayer()));
    // roleList.add(new JudgePlayerDecorator(new HumanPlayer()));
    // roleList.add(new JudgePlayerDecorator(new HumanPlayer()));

    // roleList.get(0).setPlayerID("Laxa");
    // roleList.get(1).setPlayerID("Umea");
    // roleList.get(2).setPlayerID("Lulea");

    // roleList.get(0).getPlayerID();

    // System.out.println(roleList.get(0));

    // JudgePlayerDecorator(roleList.get(0));
    // System.out.println(roleList.get(0).getPlayerID());
    // JudgePlayerDecorator(roleList.get(1));
    // System.out.println(roleList.get(0).getPlayerID());

    // for(Role element : roleList) {
    //     element.vote();
    // }

    // list.get(0).setPlayerID("Despacito1");
    // list.get(1).setPlayerID("Henkelwankel");
    // list.get(2).setPlayerID("Jenkins");

    // System.out.println("Person with no roles");
    // System.out.println(list.get(0).getPlayerID());

    // System.out.println("\nPerson of role: Judge.");
    // System.out.println(humanJudge.getTypeOfPlayer());

    // System.out.println("\nBot of role: Judge");
    // botJudge.getTypeOfPlayer();

    // System.out.println("\nHumanJudge is made anew.");
    // humanJudge = new JudgePlayerDecorator(new HumanPlayer());

    // System.out.println("\nPerson of role: Judge.");
    // humanJudge.getTypeOfPlayer();

}
 