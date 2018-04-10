/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 * This class will create the car for the driver
 * @author Enneacle
 */
public class Driver {
    public static void main(String[] args){
        Car car1 = new Car("Ford", "Pinto", 1972, 17.5, 127621, 12, 8);
        System.out.println(car1);
        car1.drive(5);
        car1.fillTank(1);
        System.out.println(car1.getFuelRemaining());
        System.out.println(car1);
    }
}
