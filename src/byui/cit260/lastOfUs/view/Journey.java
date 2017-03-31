/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;

import byui.cit260.lastOfUs.model.Game;
import byui.cit260.lastOfUs.model.Resources;
import byui.cit260.lastOfUs.model.Scene;
import lastofusgame.LastOfUsGame;

/**
 *
 * @author Família Haitmann
 */
public class Journey extends View{

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
                
        MapView map = new MapView();
        
        switch (choice){
           
            case "M":
                map.display();
                break;
            case "W":
        {
            try {
                this.goWalmart();
            } catch (Exception ex) {
                ErrorView.display(this.getClass().getName(),ex.getMessage());
            }
        }
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }

    private void goWalmart() {
        
        Game game = LastOfUsGame.getCurrentGame();
        Scene[] scenes = game.getScenes();
        String wallmart = scenes[1].getDescription();
        this.console.println(wallmart);
        
        this.console.println("\nCheck below the list of itens you have found!!"
                            + "\n                                             ");
        this.supplies();
        
    }
    private void supplies(){
        StringBuilder line;
       
        Game game = LastOfUsGame.getCurrentGame();
        Resources[] resourcesItem = game.getResources();
    
        this.console.println("\n       LIST OF OPTIONS"
             
        
                            +"\n                        ");
        line = new StringBuilder("                                      ");
        line.insert(0, "NAME");
        line.insert(16, "DISPONIBILITY");
        this.console.println(line.toString());
                
        for(Resources item : resourcesItem){
            line = new StringBuilder("                                  ");
            line.insert(0,item.getName());
            line.insert(28,item.getType());

            this.console.println(line.toString());
        }
        
}
}