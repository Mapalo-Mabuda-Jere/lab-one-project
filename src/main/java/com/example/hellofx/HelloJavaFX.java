package com.example.hellofx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    @Override
    public void start(Stage stage) {
        Label message = new Label("Welcome Mapalo Mabuda Jere");
        Button button = new Button("start");
        button.setOnAction(event ->
            message.setText("Great! You clicked the button.")
        );
        Button reserButton = new Button("Reset");
        reserButton.setOnAction(event->
                message.setText( "Welcome ,Mapalo Mabuda Jere!" )
        );

        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(message, button);

        Scene scene = new Scene(layout, 500, 300);
        stage.setTitle("JavaFX App - 202507890 ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
