/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.image.proxy;

import domain.image.Image;
import domain.image.impl.BitmapImage;
import domain.location.Location;

/**
 *
 * @author urosv
 */
public class ImageProxy implements Image {

    private String name;
    private Location location;
    private BitmapImage image;

    public ImageProxy(String filename) {
        this.name = filename;
    }

    @Override
    public void setLocation(Location location) {
        if (image != null) {
            image.setLocation(location);
        } else {
            this.location = location;
        }
    }

    @Override
    public Location getLocation() {
        if (image != null) {
            return image.getLocation();
        } else {
            return location;
        }
    }

    @Override
    public void render() {
        if (image == null) {
            image = new BitmapImage(name);
            if (location != null) {
                image.setLocation(location);
            }
        }
        image.render();
    }

}
