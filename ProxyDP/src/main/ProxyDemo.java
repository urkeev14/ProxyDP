/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.image.Image;
import domain.image.factory.ImageFactory;
import domain.location.Location;

/**
 *
 * @author urosv
 */
public class ProxyDemo {
    
    public static void main(String[] args) throws InterruptedException {
        
        Image image = ImageFactory.getImage("MonaLisa.jpg");
        image.setLocation(new Location(10,10));
        
        System.out.println("Image location is: " + image.getLocation());
        
        Thread.currentThread().sleep(1000);
        System.out.println("Rendering image now...");
        System.out.println();
        Thread.currentThread().sleep(3000);
        
        image.render();
    }
    
}
