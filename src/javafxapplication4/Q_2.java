/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author mohamad
 */
public class Q_2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label Lable = new Label("Enter Celsius Temperature:");
        VBox vbox = new VBox(Lable);
        vbox.setAlignment(Pos.CENTER);

        TextField Temp = new TextField("1");
        HBox hbox = new HBox(10, Temp);
        hbox.setAlignment(Pos.CENTER);

        RadioButton Fahrenheit = new RadioButton("Fahrenheit");
        RadioButton Kelvin = new RadioButton("Kelvin");
        HBox hbo = new HBox(10, Fahrenheit, Kelvin);
        hbo.setAlignment(Pos.CENTER);

        ToggleGroup tg = new ToggleGroup();
        Fahrenheit.setToggleGroup(tg);
        Kelvin.setToggleGroup(tg);

        Label myLabel = new Label("");
        HBox hboxx = new HBox(10, myLabel);
        hboxx.setAlignment(Pos.CENTER);

        GridPane gi = new GridPane();
        gi.add(vbox, 0, 0);
        gi.add(hbox, 0, 1);
        gi.add(hbo, 0, 2);
        gi.add(hboxx, 0, 3);
        gi.setAlignment(Pos.CENTER);
        gi.setVgap(20);

        Scene scene = new Scene(gi, 400, 200);

        primaryStage.setTitle("Temperature Converter");
        primaryStage.setScene(scene);
        primaryStage.show();

        tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            public void changed(ObservableValue<? extends Toggle> ob,
                    Toggle o, Toggle n) {

                RadioButton rb = (RadioButton) tg.getSelectedToggle();
                if (rb == Fahrenheit) {
                    Fahrenheit.setOnAction((ActionEvent event) -> {
                        double c = (double) Float.parseFloat(Temp.getText());
                        double f = (c * (9 / 5)) + 32;
                        myLabel.setText("New Temperature in Fahrenheit is: " + f);
                    });
                } else if (Kelvin.isSelected() == true) {
                    Kelvin.setOnAction((ActionEvent event) -> {
                        double c = (double) Float.parseFloat(Temp.getText());
                        double k = c + 273.15;
                        myLabel.setText("New Temperature in Kelvin is: " + k);
                    });
                }

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
