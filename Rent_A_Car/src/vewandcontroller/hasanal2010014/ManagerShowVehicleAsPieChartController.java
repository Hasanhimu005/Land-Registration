/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package vewandcontroller.hasanal2010014;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.AnchorPane;
import modelClass.hasanal2010014.Suv;
import modelClass.hasanal2010014.VehicleList;


public class ManagerShowVehicleAsPieChartController implements Initializable {

    @FXML
    private AnchorPane centerAncorPanePie;
    @FXML
    private PieChart vehiclePie;
  
     ArrayList<VehicleList> vlist;
  

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         System.out.println("manager-PIE intial start");
      
         
         
         
         
           vlist= new ArrayList<VehicleList>();
           
            
        
       
         System.out.println("manager-PIE intial end"); 
    }    
    
    
    
    
    
   public  void loadpieChart( ){
       
       
        
     
       
       
       
   
      Suv s1 = null;
   
       FileInputStream fs=null;
       
       ObjectInputStream ois=null; 
            
        // System.out.println("inside load piechart"); 
         try {
             
           
              fs = new FileInputStream("Suv.bin");
           
                
           ois=  new ObjectInputStream(fs); 
           
      
            
            
            
            
            while(true){
                
                s1=(Suv)ois.readObject();
                System.out.println(s1.getModelName());
                
                try{
                
                            
                
                
                   if(vlist.isEmpty()){
                        //System.out.println("adding first element");
                         
                         
                          vlist.add( new VehicleList(1,s1.getModelName(),s1.getClasstype()));
                   
                   
                   }
                   else{
                   
                   
                                for(VehicleList v:vlist){

                                      if(s1.getModelName().equals(v.getModelName())){


                                            v.setVehicleCount(v.getVehicleCount()+1);

                                      }
                                 else{

                                      // System.out.println("adding");
                                        vlist.add( new VehicleList(1,s1.getModelName(),s1.getClasstype()));

                                        // System.out.println("adding  element");

                                   }

                                }
                     }
          
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                }
                 catch(Exception e){
            
                System.out.println("new exception");
           
                }
            
               
           
               
           
            }          
        }
        catch(Exception e){
            
        
            
        }
        finally{
               
          try {
              ois.close();
          } catch (IOException ex) {
              Logger.getLogger(ManagerShowVehicleAsPieChartController.class.getName()).log(Level.SEVERE, null, ex);
          }
           
           }
   
         
       
        
        ObservableList <PieChart.Data> list2 = FXCollections.observableArrayList();
        
         
      
          for(VehicleList v: vlist){
          
           
              
               list2.add( new PieChart.Data(v.getModelName(),v.getVehicleCount()));
          
              
          
          }
        
        //list2.add(new PieChart.Data("Java",50));
        //...
        vehiclePie.setData(list2);
            
     
      
      
      
      
    
       
       
       
       
       
       
   };
    
    
    
    
    
    
    
    
    
    
    
}//Class end
