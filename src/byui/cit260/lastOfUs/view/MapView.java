/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;

import java.util.Scanner;

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
            case "NF":
                this.moveNephi();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection, or you can't go that far*** Try again");
                break;
        }
        return false;
    }

    void moveCedarCity() {
        this.console.println("\n*** moveCedarCity() Called!!");
         
        
    }

    private void moveTwinFalls() {
        this.console.println("\n*** moveTwinFalls() Called!!");
    }

    private void moveFillmore() {
        this.console.println("\n*** moveFillmore() Called!!");
    }

    private void moveNephi() {
        this.console.println("\n*** moveNephi() Called!!");
    }
    
}
