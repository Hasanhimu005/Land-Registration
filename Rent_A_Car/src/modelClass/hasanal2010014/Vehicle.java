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
public abstract class Vehicle implements Serializable{
    
    
    
    
    protected final String modelName;
    
     protected final String manufacturer;
    
    protected final String classtype;
     
    protected final String fuelType;
    
    protected final float rentalPriceperDat;
       
    protected final int milage;
        
    protected final int bags;
         
    protected final boolean transmission;
          
    protected final String driverpossition;
    
    protected final String drivetrain;
    
    
  
  
     protected  Body body;
     
     protected  RegistrationInformation registrationInfo;

    public Vehicle(String modelName, String manufacturer, String classtype, String fuelType, float rentalPriceperDat, int milage, int bags, boolean transmission, String driverpossition, String drivetrain, Body body, RegistrationInformation registrationInfo) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.classtype = classtype;
        this.fuelType = fuelType;
        this.rentalPriceperDat = rentalPriceperDat;
        this.milage = milage;
        this.bags = bags;
        this.transmission = transmission;
        this.driverpossition = driverpossition;
        this.drivetrain = drivetrain;
        this.body = body;
        this.registrationInfo = registrationInfo;
    }

    public String getManufacturer() {
        return manufacturer;
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
