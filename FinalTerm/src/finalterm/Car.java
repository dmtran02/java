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
public class Car {
    
    public String make;
    public String model;
    
    Car(String userMake, String userModel){
        this.make = userMake;
        this.model = userModel;
    }
    
    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }
    
    public String toString(){
        return make+" "+model;
    }
    
    public void setMake(String diffMake){
        this.make = diffMake;
    }
    
    public void setModel(String diffModel){
        this.model = diffModel;
    }
    
}
