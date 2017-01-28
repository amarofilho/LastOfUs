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
public class Ally extends Actor implements Serializable{
    private String action;

    public Ally() {
    }
    
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.action);
        return hash;
    }

    @Override
    public String toString() {
        return "Ally{" + "name=" + name + ", gender=" + gender + ", description=" + description + "action=" + action + '}';
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
        final Ally other = (Ally) obj;
        if (!Objects.equals(this.action, other.action)) {
            return false;
        }
        return true;
    }
    
    
    
}
