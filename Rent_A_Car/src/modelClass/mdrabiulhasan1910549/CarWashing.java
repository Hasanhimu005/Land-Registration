/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelClass.mdrabiulhasan1910549;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class CarWashing extends CarService implements Serializable{
     private String type;

    public CarWashing(String type, String registrationNumber) {
        super(registrationNumber);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }
    
    
}
