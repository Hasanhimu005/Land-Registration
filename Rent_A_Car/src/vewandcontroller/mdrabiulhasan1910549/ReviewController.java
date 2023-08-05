/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vewandcontroller.mdrabiulhasan1910549;

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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class ReviewController implements Initializable {

    @FXML
    private TextField customerID;
    @FXML
    private DatePicker dateOfRide;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void enterButtonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("Review2ndScene.fxml"));
        Parent nextSceneParent= null;
        nextSceneParent=loader.load();
                          
        Scene nextScene= new Scene(nextSceneParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();  
        
        sameStage.setScene(nextScene);
        sameStage.show();
    }
    
}
