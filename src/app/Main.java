package app;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    private final Subject subject = new Subject();
    private final StackPane colorPane = new StackPane();

    @Override
    public void start(Stage primaryStage) {

        colorPane.setMinSize(300, 200);

        Button btnRed = new Button("Rojo");
        btnRed.setOnAction(e -> {
            colorPane.setStyle("-fx-background-color: red;");
            subject.setColor("Rojo");
        });

        Button btnGreen = new Button("Verde");
        btnGreen.setOnAction(e -> {
            colorPane.setStyle("-fx-background-color: green;");
            subject.setColor("Verde");
        });

        Button btnBlue = new Button("Azul");
        btnBlue.setOnAction(e -> {
            colorPane.setStyle("-fx-background-color: blue;");
            subject.setColor("Azul");
        });

        VBox vbox = new VBox(10, btnRed, btnGreen, btnBlue);
        vbox.setAlignment(Pos.CENTER);
        colorPane.getChildren().add(vbox);

        Scene scene = new Scene(colorPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Observer con JavaFX y AspectJ");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}