/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelClass.hasanal2010014;

import java.io.Serializable;

/**
 *
 * @author siam
 */
public class Suv extends Vehicle implements Serializable{
    
    private final boolean towingCapability;
    
     private final float suvHight;

    public Suv(boolean towingCapability, float suvHight, String modelName, String manufacturer, String classtype, String fuelType, float rentalPriceperDat, int milage, int bags, boolean transmission, String driverpossition, String drivetrain, Body body, RegistrationInformation registrationInfo) {
        super(modelName, manufacturer, classtype, fuelType, rentalPriceperDat, milage, bags, transmission, driverpossition, drivetrain, body, registrationInfo);
        this.towingCapability = towingCapability;
        this.suvHight = suvHight;
    }


     
     
   
    public String getModelName() {
        return modelName;
    }

    public String getClasstype() {
        return classtype;
    }

    public String getFuelType() {
        return fuelType;
    }

    public float getRentalPriceperDat() {
        return rentalPriceperDat;
    }

    public int getMilage() {
        return milage;
    }

    public int getBags() {
        return bags;
    }

    public boolean isTransmission() {
        return transmission;
    }

    public String getDriverpossition() {
        return driverpossition;
    }

    public String getDrivetrain() {
        return drivetrain;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public RegistrationInformation getRegistrationInfo() {
        return registrationInfo;
    }

    public void setRegistrationInfo(RegistrationInformation registrationInfo) {
        this.registrationInfo = registrationInfo;
    }

 

     
     
     
   
     
    
}
