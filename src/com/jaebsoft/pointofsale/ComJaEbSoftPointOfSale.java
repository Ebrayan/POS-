package com.jaebsoft.pointofsale;
import com.jaebsoft.pointofsale.Controllers.ScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Elis Brayan Valdez
 */
public class ComJaEbSoftPointOfSale extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
        Scene scene = new Scene(root);
        ScreenController screenController = ScreenController.getInstance(scene);
        scene.getStylesheets().add("MyStyles.css");
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setMaximized(true);
        
        
        
        
        stage.show();
    }
    
    private void changeScene(){
    
    } 
    
    /**
     * @param args the command line arguments
    */
    public static void main(String[] args) {
        launch(args);
    }
//   void popup(Node root){
// JFXListView<String> list = new JFXListView<String>();
//for(int i = 1 ; i < 5 ; i++) list.getItems().add("Item " + i);
// 
//JFXHamburger burger = new JFXHamburger();
//burger.setPadding(new Insets(10,5,10,5));
//JFXRippler popupSource = new JFXRippler(burger,RipplerMask.CIRCLE,RipplerPos.BACK);
// 
//JFXPopup popup = new JFXPopup();
//popup.setContent(list);
//popup.setPopupContainer(root);
//popup.setSource(popupSource);
//popupSource.setOnMouseClicked((e)-> popup.show(PopupVPosition.TOP, PopupHPosition.LEFT));
//   }
}
