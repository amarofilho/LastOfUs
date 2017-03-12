/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lastOfUs.model;


import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Survivors of Brazil
 */
public class Inventory implements Serializable{
    
    //class instance variables
    private String description;
    private Integer quantityInStock;

    public enum Item{
        waterBottle,
        scalpel,
        linen,
        blanket,
        metalStick,
        
    }
    public Inventory() {
    }
 
    public String getDescription() {
        return description;
    }

    public void setDescription(String item) {
        this.description = item;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantity) {
        this.quantityInStock = quantity;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + Objects.hashCode(this.quantityInStock);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }

        if (!Objects.equals(this.quantityInStock, other.quantityInStock)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "description=" + description + ", quantity in stock=" + quantityInStock + '}';
    }

    public void setName(String map) {
        System.out.println(" serName function called!!");
    }
    
    
}
