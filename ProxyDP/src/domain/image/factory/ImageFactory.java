/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.image.factory;

import domain.image.Image;
import domain.image.proxy.ImageProxy;

/**
 *
 * @author urosv
 */
public class ImageFactory {
    
    public static Image getImage(String name){
        return new ImageProxy(name);
    }
    
}
