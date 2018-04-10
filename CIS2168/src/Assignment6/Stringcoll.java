/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

/**
 *
 * @author Enneacle
 */
public class Stringcoll extends MultiStringcoll {
    
    public Stringcoll(){
        super();
    }
    
    public Stringcoll(int i){
        super(i);
    }
    
    public void insert(String s){
        if(!super.belongs(s)){
            super.insert(s);
        }
    }  
}
