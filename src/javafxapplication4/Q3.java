/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author mohamad
 */
public class Q3 extends Application {

    @Override
    public void start(Stage primaryStage) {

        MenuBar menuBar = new MenuBar();
        Menu menueFile = new Menu("_File");
        Menu menueEdit = new Menu("_Edit");
        MenuItem menuItemOpen = new MenuItem("_Open");
        MenuItem menuItemClose = new MenuItem("_Close");
        MenuItem menuItemExit = new MenuItem("_Exit");
        MenuItem menuItemFont = new MenuItem("_Font");
        MenuItem menuItemColor = new MenuItem("_Color");

        menueFile.getItems().addAll(menuItemOpen, menuItemClose, menuItemExit);
        menueEdit.getItems().addAll(menuItemFont, menuItemColor);

        menuBar.getMenus().addAll(menueFile, menueEdit);

        TextArea textAreaContent = new TextArea("Initial Text");

        VBox vBox = new VBox(menuBar, textAreaContent);
        Scene scene = new Scene(vBox, 300, 250);

        primaryStage.setTitle("File View");
        primaryStage.setScene(scene);
        primaryStage.show();

        menuItemOpen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                FileChooser fc = new FileChooser();
                fc.setTitle("Opening File");
                fc.setInitialDirectory(new File("."));
                File file = fc.showOpenDialog(null);
                //File selectedFile = fc.getInitialFileName(file);                
                //Scanner scanner = new Scanner(selectedFile);

                //while(scanner.next() == ""){
                //textAreaContent.appendText(scanner.nextLine());
                // }
            }
        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
