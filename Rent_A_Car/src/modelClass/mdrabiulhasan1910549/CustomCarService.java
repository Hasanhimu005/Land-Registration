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
public class CustomCarService extends CarService implements Serializable{
    private String description;

    public CustomCarService(String description, String registrationNumber) {
        super(registrationNumber);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }
    
}
