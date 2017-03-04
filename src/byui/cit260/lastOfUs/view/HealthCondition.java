/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;

/**
 *
 * @author Família Haitmann
 */
public class HealthCondition extends View{
       
    public HealthCondition() {
        
        super("\n"
                  + "\n You have just awake from a coma, so you feel very thirsty!!"
                  + "\n you better find some water or you won't last long."
                  + "\n                                                         "
                  + "\nR - Search for resources"
                  + "\nF - Find a way out of the room"
                  + "\nQ - Quit"
                  + "\n---------------------------------------------------------");
    }
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice){
            case "R":
                this.searchForResources();
                break;
            case "F":
                this.findWayOut();
                break;
            default:
                System.out.println("\n*** Invalid Selection,*** Try again");
                break;
        }
        return false;
    }

    private void searchForResources() {
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.display();
    }

    private void findWayOut() {
        Escape escape = new Escape();
        escape.displayEscape();
    }
    
}
