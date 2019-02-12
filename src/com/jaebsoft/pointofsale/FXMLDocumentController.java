package com.jaebsoft.pointofsale;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
/**
 * @author TheBryan
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private AnchorPane mainpane;
    
    @FXML
    private Pane btn_go_UserView;

    @FXML
    private Pane btn_go_ClientView;

    @FXML
    private Pane btn_go_InvetoryView;

    @FXML
    private Pane btn_go_POSView;
    
    @FXML
    private FontAwesomeIconView btnMinimizar;
    @FXML
    private FontAwesomeIconView btnClose;
    
//    @FXML
//    private Label label;
//    
//    @FXML
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
//
//        JFXSnackbar bar = new JFXSnackbar(mainpane);
//        bar.enqueue(new SnackbarEvent("Notification Msg"));
//        
//            }  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initCompponent();
    }     

    
    
    private void initCompponent(){
    
        btnClose.addEventHandler(MouseEvent.MOUSE_CLICKED, (event)->{
        
            System.exit(0);
            System.out.println("Final");
            
        });
        
        btn_go_POSView.addEventHandler(MouseEvent.MOUSE_CLICKED, (event) -> {
            
            
            try {
                ChangeScene();
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
             
        });
        
        
    
    }


private void ChangeScene() throws IOException{
    
    mainpane.getChildren().clear();
    
    FXMLLoader loader = new FXMLLoader();
    AnchorPane panePOS = FXMLLoader.load(getClass().getResource("Views/POSView.fxml"));
    mainpane.getChildren().add(panePOS);
    
    
}
        
}
