/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author mohamad
 */
public class Q_4 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label Welcome = new Label("Welcome ");
        VBox vbox = new VBox(Welcome);
        vbox.setAlignment(Pos.CENTER_LEFT);

        Label userName = new Label("User Name: ");
        TextField user = new TextField();
        user.setPromptText("user name");
        HBox hbox = new HBox(10, userName, user);
        hbox.setAlignment(Pos.CENTER_LEFT);

        Label Password = new Label("Password:    ");
        TextField Pass = new TextField();
        Pass.setPromptText("Password");
        HBox hbox1 = new HBox(10, Password, Pass);
        hbox1.setAlignment(Pos.CENTER_LEFT);

        Button sign_in = new Button("Sign in");
        Label myLabel = new Label("");
        Button exit = new Button("Exit");

        HBox hbox2 = new HBox(10, sign_in, exit);
        hbox2.setAlignment(Pos.CENTER_RIGHT);

        HBox hbox4 = new HBox(10, myLabel);
        hbox4.setAlignment(Pos.CENTER);

        GridPane gi = new GridPane();
        gi.add(vbox, 0, 0);
        gi.add(hbox, 0, 1);
        gi.add(hbox1, 0, 2);
        gi.add(hbox2, 0, 3);
        gi.add(hbox4, 0, 4);
        gi.setVgap(20);
        gi.setAlignment(Pos.CENTER);

        Button AddStudent = new Button("Add Student");
        HBox hboxx2 = new HBox(10, AddStudent);
        hbox2.setAlignment(Pos.CENTER);

        Button ViewStudent = new Button("View Student");
        HBox hboxx4 = new HBox(10, myLabel);
        hbox4.setAlignment(Pos.CENTER);

        GridPane gi2 = new GridPane();
        gi2.add(hboxx2, 0, 0);
        gi2.add(hboxx4, 0, 1);

        Scene scene = new Scene(gi, 300, 250);
        scene.getStylesheets().add("CssFX.css");

        Scene sscene = new Scene(gi2, 300, 250);
        sscene.getStylesheets().add("CssFX.css");

        primaryStage.setTitle("Hello World!");
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
