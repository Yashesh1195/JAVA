package com.example.first_javafx_project;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;

import java.sql.SQLOutput;

public class EventsDemo extends Application{
    @Override
    public void start(Stage primaryStage) {
        Circle c = new Circle();
        c.setCenterX(250);
        c.setCenterY(250);
        c.setRadius(50);
        c.setFill(Color.RED);

        Text t = new Text("Click the circle to change the color from RED to BLACK!!");
        t.setFont(Font.font(null, FontWeight.BOLD, 16));
        t.setFill(Color.DARKBLUE);
        t.setX(100);
        t.setY(100);

        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                c.setFill(Color.BLACK);
                t.setFill(Color.RED);
            }
        };

        c.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
//        t.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);

        Group root = new Group(c, t);
        Scene scene = new Scene(root, 700, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String args[]) {
        launch(args);
    }
}
