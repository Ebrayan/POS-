package com.jaebsoft.pointofsale.Controllers;

import java.util.HashMap;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

/**
 * @author TheBryan
 */
public class ScreenController {

    public static ScreenController getInstance(Scene scene) {
        
        if (MyMainScreenController == null)
          MyMainScreenController = new ScreenController(scene);
     
          return MyMainScreenController;
    }
    private HashMap<String, Pane> screenMap = new HashMap<>();
    private Scene main;
    static ScreenController MyMainScreenController;
    
    public ScreenController(Scene main) {
        this.main = main;
    }
    protected void addScreen(String name, Pane pane){
         screenMap.put(name, pane);
    }
    protected void removeScreen(String name){
        screenMap.remove(name);
    }
    protected void activate(String name){
        main.setRoot( screenMap.get(name) );
    }
}
