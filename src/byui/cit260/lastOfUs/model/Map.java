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
 * @author AmaroIdelfonso
 */
public class Map implements Serializable{
    
    //class instance variables
    
    private String cityLocation;
    private String  spotLocation;

    public Map() {
    }
    
    

    public String getCityLocation() {
        return cityLocation;
    }

    public void setCityLocation(String cityLocation) {
        this.cityLocation = cityLocation;
    }

    public String getSpotLocation() {
        return spotLocation;
    }

    public void setSpotLocation(String spotLocation) {
        this.spotLocation = spotLocation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.cityLocation);
        hash = 37 * hash + Objects.hashCode(this.spotLocation);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.cityLocation, other.cityLocation)) {
            return false;
        }
        if (!Objects.equals(this.spotLocation, other.spotLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "cityLocation=" + cityLocation + ", spotLocation=" + spotLocation + '}';
    }
    
    
    
}
