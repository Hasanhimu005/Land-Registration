/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package vewandcontroller.hasanal2010014;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import modelClass.hasanal2010014.Body;
import modelClass.hasanal2010014.RegistrationInformation;
import modelClass.hasanal2010014.VehicleData;

/**
 * FXML Controller class
 *
 * @author siam
 */
public class AddNewVehicleController implements Initializable {

    @FXML
    private ImageView carImgView;
    @FXML
    private TextField modelNameTextField;
    @FXML
    private ComboBox<String> manufacturerCombo;
    @FXML
    private TextField countryTextField;
    @FXML
    private TextField yearTextField;
    @FXML
    private TextField colourTextField;
    @FXML
    private RadioButton autoRadioButton1;
    @FXML
    private RadioButton manualRadioButton;
    @FXML
    private RadioButton leftRadioButton;
    @FXML
    private RadioButton rightRadioButton;
    @FXML
    private TextField doorTextField;
    @FXML
    private TextField seatsTextField;
    @FXML
    private TextField bagsTextField;
    @FXML
    private RadioButton noRadioButton;
    @FXML
    private RadioButton yesRadioButton;
    @FXML
    private TextField suvHightTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    VehicleData v1;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @FXML
    private void nextButtonOnClick(ActionEvent event) throws IOException {
        
      
     Body body;
     
     RegistrationInformation reg;
     
     
     
     
     
     
    
     
     //colour, int seats, int doors, String bodyTypes
     body = new Body(
                    colourTextField.getText(),
             
                     Integer.parseInt(seatsTextField.getText()) ,
             
                     Integer.parseInt(doorTextField.getText()) ,
                     "null"
                       
     );
     
   // modelName, String manufacturer, boolean towingCapability, float suvHight, int bags, boolean transmission, String country, int year, String driverpossition, Body body 
     
     v1 = new VehicleData(
     
        modelNameTextField.getText(),
             
             "",
             
           yesRadioButton.isSelected()?true:false,
             
             Float.parseFloat(suvHightTextField.getText()),
             
             Integer.parseInt(bagsTextField.getText()),
             
             autoRadioButton1.isSelected()?true:false,
             
             countryTextField.getText(),
             
              Integer.parseInt(yearTextField.getText()),
             
             leftRadioButton.isSelected()?"left":"right",
             
              body 
     
     );
     
     
     
     
     
            FXMLLoader l1= new FXMLLoader();
            
             l1.setLocation( getClass().getResource("AddNewVehicle2Scene.fxml")); 
            
              Parent vehicleParent = l1.load();
            
             
            AddNewVehicle2SceneController vehicleScenecon= l1.getController();
            
            //manufactureNam  price,  dateOfManufacture, yearOfWarrenty
            
            vehicleScenecon.vehicleData(v1);
        
       
           
         
         
           
           Scene s1 = new Scene( vehicleParent);
           
           Node n1=(Node)event.getSource();
           
           Stage orgStage = (Stage) n1.getScene().getWindow();
           
           orgStage.setScene(s1);
           
            orgStage.setTitle("Add Vehicle");
           
           orgStage.show();
         
        
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    //handlerMETHOD END  
    }
    
}
