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
public class Scene implements Serializable{
    
    // class intance variables
    private boolean blocked;
    private String description;
    private String mapSymbol;

    
    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public Scene() {
    }
    
    public enum SceneType{
        OutOfHospital,
        wallmart,
        cedarCity,
        fillmore,
        nephi,
        twinFalls,
        ely,
        Payson,
        provo,
        saltLakeCity,
        pocatello,
        idahoFalls,
        rexburg,
                
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Scene{" + "blocked=" + blocked + ", description=" + description + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + (this.blocked ? 1 : 0);
        hash = 61 * hash + Objects.hashCode(this.description);
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
        final Scene other = (Scene) obj;
        if (this.blocked != other.blocked) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
      
    
    
}
