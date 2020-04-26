/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.image.impl;

import domain.image.Image;
import domain.location.Location;

/**
 *
 * @author urosv
 */
public class BitmapImage implements Image{
    
    private Location location;
    private String name;

    public BitmapImage(String filename) {
        System.out.println("Loaded from disk: " + filename);
        this.name = filename;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void render() {
        System.out.println("Rendered: " + this.name);
    }

    
    
}
