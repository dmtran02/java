/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 * This class creates a car with the following attributes: make, model, year, MPG, milesDriven, fuelCapacity, and fuelRemaining
 * @author Enneacle
 */
public class Car {
    
    //private variables to store attributes of the car
    private String make;
    private String model;
    private int year;
    private double MPG;
    private double milesDriven;
    private double fuelCapacity;
    private double fuelRemaining;
    
    //This is a seven argument constructor that will create a new car object
    /**
     * 
     * @param userMake - make   
     * @param userModel - model 
     * @param userYear - year
     * @param userMPG - MPG
     * @param userMilesDriven - milesDriven
     * @param userFuelCapacity - fuelCapacity
     * @param userFuelRemaining -fuelRemaining
     */
    public Car(String userMake, String userModel, int userYear, double userMPG, double userMilesDriven, double userFuelCapacity, double userFuelRemaining){
        make = userMake;
        model = userModel;
        year = userYear;
        MPG = userMPG;
        milesDriven = userMilesDriven;
        fuelCapacity = userFuelCapacity;
        fuelRemaining = userFuelRemaining;
    }
    
    /**
     * This method will return the car as a String
     * @return 
     */
    public String toString(){
        return (make+", "+model+", "+year+", "+MPG+" MPG, "+milesDriven+" miles driven, "+fuelCapacity+" gallons capacity, "+fuelRemaining+" gallons remaining");
    }
    
    /**
     * This method will add miles into milesDriven and calculate for the gas reduced from the drive
     * @param miles 
     */
    public double drive(double miles){//needs to reduce gas
        milesDriven += miles;
        while(miles!=0){
            fuelRemaining--;
            miles--;
            if(fuelRemaining < 0){
                System.out.println("Uh oh... You ran out of gas along the way.");
                break;
            }
            else if(miles == 0){
                System.out.println("You have "+fuelRemaining+" gallons left in the tank");
                break;
            }
        }
        return milesDriven;
    }
    
    /**
     * This method will fill the gas of the car
     */
    public double fillTank(double gas){//check for filling gas properly
        double currentGas = fuelRemaining+gas;
        if(fuelCapacity < currentGas){
            System.out.println("Oh god, you overfilled the gas tank!");
            currentGas = fuelCapacity;
        }
        fuelRemaining = currentGas;
        return currentGas;
    }
    
    /**
     * This method returns the remaining number of fuel inside the tank
     * @return 
     */
    public double getFuelRemaining(){
        return fuelRemaining;
    }
}
