/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalterm;

/**
 *
 * @author Enneacle
 */
public class Driver {
    
    public static final int TIME = 10;
    
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "F-150");
        System.out.println(car1);
        car1.setMake("Nissan");
        System.out.println(car1);
    }
}
