/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.image;

import domain.location.Location;

/**
 *
 * @author urosv
 * Interface implemented by proxy and concrete objects
 */

public interface Image {
    
    void setLocation(Location location);
    Location getLocation();
    
    void render();
    
}
