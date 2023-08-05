/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package vewandcontroller.hasanal2010014;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author siam
 */
public class RentalManagerDashboardSceneController implements Initializable {

    @FXML
    private Label notificationOutputLabel;
    @FXML
    private AnchorPane crossAncorpnae;
    @FXML
    private Menu vehicle;
    @FXML
    private BorderPane mainBorferpane;
    
    

     
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


   
    
    @FXML
    private void manageVehicleButttonOnClick(ActionEvent event) throws IOException {
        
        
   //**************************************SceneSwitching From MenuItem****************************************         
        FXMLLoader l2= new FXMLLoader();
            
            l2.setLocation( getClass().getResource("ManagerVehicleScene.fxml")); 
            
              Parent manageroot = l2.load();
        
           Scene s1 = new Scene(manageroot);
           
           
           
           
           Stage orgStage = (Stage) mainBorferpane.getScene().getWindow() ;
           
           orgStage.setScene(s1);
           
           orgStage.setTitle("Vehicle Manager");
           
           orgStage.show();
         
       
        
        
        
 //**************************************SceneSwitching From MenuItem****************************************                
        
        
    }

    @FXML
    private void membershipButttonOnClick(ActionEvent event) {
    }

    @FXML
    private void offerButttonOnClick(ActionEvent event) {
    }

    @FXML
    private void equipmentButttonOnClick(ActionEvent event) {
    }
    
}
