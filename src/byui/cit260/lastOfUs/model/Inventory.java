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
    private String item;
    private Integer quantity;
    private String type;
    private String status;

    public Inventory() {
    }
    
    

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.item);
        hash = 37 * hash + Objects.hashCode(this.quantity);
        hash = 37 * hash + Objects.hashCode(this.type);
        hash = 37 * hash + Objects.hashCode(this.status);
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
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.quantity, other.quantity)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "item=" + item + ", quantity=" + quantity + ", type=" + type + ", status=" + status + '}';
    }

    public void setName(String map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
