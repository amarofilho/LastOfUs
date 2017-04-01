/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;

import byui.cit260.lastOfUs.model.Game;
import byui.cit260.lastOfUs.model.Scene;
import java.util.Scanner;
import lastofusgame.LastOfUsGame;

/**
 *
 * @author Família Haitmann
 */
public class MapView extends View{
    
    public MapView() {
        
        super( "Please enter the 2 letters code to the city you wanna go:"
        
    + "\n*********************************************************************************************************"
    + "*\n                                          (PY)Payson________                                       \n  *"
    + "*                                                     /        \\                                  MAP\n  *"
    + "*                                          __________/          \\   (PV)Provo                        \n  *"
    + "*                                         /                ______\\____/\\                            \n  *"
    + "*                            ___(NP)Nephi/                /              \\                           \n  *"
    + "*                           /      ___|__________________/                \\                          \n  *" 
    + "*                                /                      \\            (SL)Salt Lake City              \n  *" 
    + "*                         /     /                        \\         ________ /                        \n  *"
    + "*           (FM)Fillmore_/     /         ________(EL)_Ely-\\       /        /                         \n  *"
    + "*                      / \\   /         /                  \\_____/        /                          \n  *" 
    + "*                     |   \\ /  _______/                                   \\__(PT)Pocatello          \n  *"
    + "*                     |    \\| /                                            |                         \n  *"
    + "*                     |     \\|/_____________(TF)Twin Falls______           |                         \n  *"
    + "*       (CC)Cedar City|______/                                   \\       /\\__(IF)Idaho Falls        \n  *"
    + "*                    /                                            \\_____/        \\   *************  \n  *"
    + "* ***************   /	                                                          \\__#(RB)Rexburg#  \n  *"
    + "*(SG)Saint George#_/                                                                   *************  \n  *"
    + "* ***************                                                                                     \n  *"
    + "\n*********************************************************************************************************"
    + "\n PRESS Q TO RETURN ANYTIME                                                                          \n  *"
        );
    }
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice){
            case "CC":
                this.moveCedarCity();
                break;
            case "TF":
                this.moveTwinFalls();
                break;
            case "FM":
                this.moveFillmore();
                break;
            case "NP":
                this.moveNephi();
                break;
            case "EL":
                this.moveEly();
                break;    
            case "PY":
                this.movePayson();
                break;    
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid option, You're already at this city"
                                                                    + " or you can't go that far*** TRY AGAIN...");
                break;
        }
        return false;
    }

    void moveCedarCity() {
        Game game = LastOfUsGame.getCurrentGame();
        Scene[] scenes = game.getScenes();
        String cedarVity = scenes[2].getDescription();
        this.console.println(cedarVity);
         
        
    }

    private void moveTwinFalls() {
        Game game = LastOfUsGame.getCurrentGame();
        Scene[] scenes = game.getScenes();
        String twinFalls = scenes[3].getDescription();
        this.console.println(twinFalls);
    }

    private void moveFillmore() {
        Game game = LastOfUsGame.getCurrentGame();
        Scene[] scenes = game.getScenes();
        String fillmore = scenes[4].getDescription();
        this.console.println(fillmore);
    }

    private void moveNephi() {
        Game game = LastOfUsGame.getCurrentGame();
        Scene[] scenes = game.getScenes();
        String nephi = scenes[5].getDescription();
        this.console.println(nephi);
    }
    
    private void moveEly() {
        Game game = LastOfUsGame.getCurrentGame();
        Scene[] scenes = game.getScenes();
        String ely = scenes[6].getDescription();
        this.console.println(ely);
    }
    
    private void movePayson() {
        Game game = LastOfUsGame.getCurrentGame();
        Scene[] scenes = game.getScenes();
        String payson = scenes[7].getDescription();
        this.console.println(payson);
    }
}
