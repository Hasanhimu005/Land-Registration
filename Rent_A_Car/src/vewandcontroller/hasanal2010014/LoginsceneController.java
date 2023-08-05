/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package vewandcontroller.hasanal2010014;

//import com.itextpdf.kernel.pdf.PdfWriter;
import java.io.FileWriter;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author siam
 */
public class LoginsceneController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private TextField passwardTextField;
    @FXML
    private Label statusLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
      
      
      
    }    

    @FXML
    private void loginButtonOnClick(ActionEvent event) throws IOException {
        
        
       
        
        
        
        if( Integer.parseInt(idTextField.getText())==0000 && Integer.parseInt(passwardTextField.getText())==0000 ){
        
         //**************************************SceneSwitching****************************************   
         FXMLLoader l1= new FXMLLoader();
            
             l1.setLocation( getClass().getResource("RentalManagerDashboardScene.fxml")); 
            
              Parent manageroot = l1.load();
        
           Scene s1 = new Scene(manageroot);
           
           Node n1=(Node)event.getSource();
           
           Stage orgStage = (Stage) n1.getScene().getWindow();
           
           orgStage.setScene(s1);
           
           orgStage.show();
         //**************************************SceneSwitching**************************************** 
        
        
        }
        else{
        
           statusLabel.setText("Wrong id or passwoard try again");
        
        
        }
        
        
        
        
        
        
        
        
    }

    @FXML
    private void joinAsGuestButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void signUpButtonOnClick(ActionEvent event) {
    }
    
}
