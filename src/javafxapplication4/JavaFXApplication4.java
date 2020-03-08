/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author mohamad
 */
public class JavaFXApplication4 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Copy >>>");
        ListView<String> listView1 = new ListView<>();
        ListView<String> listView2 = new ListView<>();
        listView1.getItems().addAll("Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Purple", "Red", "Pink", "Brown", "White", "Orange", "Yellow");
        listView1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String Message = "";
                ObservableList<String> Selected;
                Selected = listView1.getSelectionModel().getSelectedItems();

                for (String S : Selected) {
                    Message += S + "\n";
                }
                if (Message.isEmpty()) {
                    AlertBox.display("No item selections", "No item selections! \n Please, select at least one item!");
                } else {
                    listView2.getItems().addAll(Message);
                }
            }
        });

        VBox vbox = new VBox(10, listView1);
        vbox.setAlignment(Pos.CENTER_LEFT);
        VBox vbox1 = new VBox(10, btn);
        vbox1.setAlignment(Pos.CENTER);
        VBox vbox2 = new VBox(10, listView2);
        vbox2.setAlignment(Pos.CENTER_RIGHT);

        GridPane gi = new GridPane();
        gi.add(vbox, 0, 0);
        gi.add(vbox1, 1, 0);
        gi.add(vbox2, 2, 0);
        gi.setHgap(20);

        Scene scene = new Scene(gi, 620, 250);

        primaryStage.setTitle("Multiple Selection ListS");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
