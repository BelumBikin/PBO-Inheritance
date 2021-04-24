/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author ASUS
 */
public class Truck {
    //the Truck class has three fields
    public int cadence;
    public int gear;
    public int speed;
        //the Truck class has one constructor
    public Truck (int startCandence, int startGear, int startSpeed){
        gear = startGear;
        cadence = startCandence;
        speed = startSpeed;
    }
    //the truck class has four method
    public void setcadence(int newValue){
        cadence = newValue;
    }
    public void setGear(int newValue){
        gear = newValue;
    }
    public void applybrake (int decerment){
        speed = decerment;
    }
    public void speedUp(int increment){
        speed = increment;
    }
}
