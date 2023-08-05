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
public class CarService implements Serializable{
    protected final String registrationNumber;

    public CarService(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
    
    
    
}
