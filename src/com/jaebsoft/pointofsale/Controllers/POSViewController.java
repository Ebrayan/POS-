/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaebsoft.pointofsale.Controllers;

 import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author TheBryan
 */
public class POSViewController implements Initializable {

    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Myscroll.widthProperty().addListener((obs, oldVal, newVal) -> {
        ScrollContent.setPrefWidth((double) newVal-15);
        });
                
        
        
    }    
    
    
    @FXML
    ScrollPane Myscroll;
    @FXML
    AnchorPane ScrollContent;
    
    
}
