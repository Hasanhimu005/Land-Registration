/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package vewandcontroller.hasanal2010014;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelClass.hasanal2010014.MyObjectOutputStream;
import modelClass.hasanal2010014.RegistrationInformation;
import modelClass.hasanal2010014.Suv;
import modelClass.hasanal2010014.VehicleData;

/**
 * FXML Controller class
 *
 * @author siam
 */
public class AddNewVehicle2SceneController implements Initializable {

    @FXML
    private RadioButton frontWheelRadioButton;
    @FXML
    private RadioButton rearWheelRadioButton;
    @FXML
    private TextField milageTextField;
    @FXML
    private DatePicker dateFirstRegistration;
    @FXML
    private TextField registrationTextField;
    @FXML
    private TextField engineTextField;
    @FXML
    private TextField chesisTextField;
    @FXML
    private TextField rentalTextField;
    @FXML
    private ComboBox<String> fuelTypeComboBox;
    @FXML
    private TextField bodyTypeTextField;

     @FXML
    private ComboBox<String> vehicleClassTypeComboBox;
    
     
    
    
    
    VehicleData vdata;
    
    RegistrationInformation reg;
    
    Suv suv;
    
  
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        vehicleClassTypeComboBox.getItems().addAll("Premium","Economy","Compact","Fullsize");
       
    }    

    
    public void vehicleData(VehicleData v){
    
        vdata=v;
    
    }
    
    
    
    
    
    
    @FXML
    private void addButtonOnClick(ActionEvent event) throws IOException {
        
//String registrationNumber, LocalDate firstDateregistration, String engineNumber, String chesisNumber, String country, int year       
        
     reg = new  RegistrationInformation(
     
          registrationTextField.getText(),
             
          dateFirstRegistration.getValue(),
             
          engineTextField.getText(),
             
          chesisTextField.getText(),
             
          vdata.getCountry(),
             
          vdata.getYear()
             
     );
        
        
        
        
        
//towingCapability, float suvHight, String modelName, String manufacturer, String classtype, String fuelType, float rentalPriceperDat, int milage, int bags, boolean transmission, String driverpossition, String drivetrain, Body body, RegistrationInformation registrationInfo      
        suv = new Suv(
        
         vdata.isTowingCapability(),
                
          vdata.getSuvHight(),
          
          vdata.getModelName(),
                
           vdata.getManufacturer(),
                
             vehicleClassTypeComboBox.getValue(),
            
          // fuelTypeComboBox.getValue(),
            "Gasoline",
                
                
                
           Float.parseFloat(rentalTextField.getText()), (int) Float.parseFloat(milageTextField.getText()),    
                
             vdata.getBags(),
                
             vdata.isTransmission(),
                
              vdata.getDriverpossition(),
                
              frontWheelRadioButton.isSelected()?"Front Wheel Drive":"Front Wheel Drive",
                
              vdata.getBody(),
                
               reg  
        
        
        );
        
        
        
            addtoBin();
     
        
        
     
            FXMLLoader l1= new FXMLLoader();
            
             l1.setLocation( getClass().getResource("ManagerVehicleScene.fxml")); 
            
              Parent vehicleParent = l1.load();
            
             
            ManagerVehicleSceneController vehicleScenecon= l1.getController();
            
            //manufactureNam  price,  dateOfManufacture, yearOfWarrenty
            
           
        
             vehicleScenecon.status(vdata.getModelName());
            
               vehicleScenecon.loadTable();
         
           
           Scene s1 = new Scene( vehicleParent);
           
           Node n1=(Node)event.getSource();
           
           Stage orgStage = (Stage) n1.getScene().getWindow();
           
           orgStage.setScene(s1);
           
            orgStage.setTitle("Add Vehicle");
           
           orgStage.show();
         
        
       
        
    }
    
    
    
  public void addtoBin() throws IOException{
  
      
               File file = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
         
        
            try{
                file=new File("Suv.bin");
                if(file.exists()){
                fos = new FileOutputStream(file,true);
                oos = new MyObjectOutputStream(fos);                
                }
                else{
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);               
                }
                
                
                
            
                    oos.writeObject(suv);
                 
                    
                   
                    
            }
            catch(Exception e){
                System.out.println(e);
            }
            finally{
               
                    oos.close();
           
               
               
               
               
               /*
               
                 try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }  
               */
           }            
            
      
      
      
        
      
       System.out.println("addd to bin");
      
      
      
      
  
  
  
  }  
    
    
    
    
    
}
