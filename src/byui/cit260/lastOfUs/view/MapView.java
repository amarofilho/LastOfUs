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
    
   // private String mapMenu;
    
   /* public void displayMapMenuView() {
        boolean done = false;
        do{
            String mapMenuOption = this.GetMapOption();
            if (mapMenuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(mapMenuOption);
        } while (!done);
    }*/
    
    /*private String GetMapOption(){
        Scanner keyboard = new Scanner(System.in);
        
        String value = "";
        boolean valid = false;
        
        while (!valid){
            System.out.println("\n "+ this.mapMenu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if(value.isEmpty()){
                System.out.println("\n Invalid value: value can not be blank");
                continue;
            }
            break;
        }
        return value;
        
        
    }*/
    
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
                System.out.println("\n*** Invalid Selection, or you can't go that far*** Try again");
                break;
        }
        return false;
    }

    private void moveCedarCity() {
        System.out.println("\n*** moveCedarCity() Called!!");
    }

    private void moveTwinFalls() {
        System.out.println("\n*** moveTwinFalls() Called!!");
    }

    private void moveFillmore() {
        System.out.println("\n*** moveFillmore() Called!!");
    }

    private void moveNephi() {
        System.out.println("\n*** moveNephi() Called!!");
    }
    
}
