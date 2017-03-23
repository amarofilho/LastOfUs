/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.view;

/**
 *
 * @author AmaroIdelfonso
 */
public class FightForLife extends View{
    
    public FightForLife(){
    
            
            super("\n"
                  + "\n   Yes! As you notice, Saint George isn´t a safe city anymore!"
                  + "\n you have a lot of infected people around you and one of them"
                  + "\n unfortunately scratche his arm on you while you tried to scape. And"
                  + "\n in this case you have only a half of your energy, and if other"
                  + "\n problem happen with you, you will gonna die."
                  + "\n"  
                  + "\n   Now, you have two choices:"
                  + "\n A) You can even in risk of die,try to get around to another"
                  + "\n town and there get antidote or,"
                  + "\n B) you can stay here and try to save your life fighting an infected."
                  + "\n Make your choice."
                  + "\n"
                  + "\nA - Move around."
                  + "\nB - Stay and fight"
                  + "\nQ - Quit"
                  + "\n---------------------------------------------------------");
}
    
@Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice){
            case "A":
                this.moveAround();
                break;
            case "B":
                this.stayFight();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection,*** Try again");
                break;
        }
        return false;
    }
    
    private void moveAround() {
        MapView mapView = new MapView();
        mapView.moveCedarCity();
    }

    private void stayFight() {
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.display();
    }
}

