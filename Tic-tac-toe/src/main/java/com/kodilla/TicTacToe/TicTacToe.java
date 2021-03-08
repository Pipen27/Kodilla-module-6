package com.kodilla.TicTacToe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;


public class TicTacToe extends Application {


    public static void main(String[] args) {
        launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        Label status1 = new Label("1");
        Label status2 = new Label();
        Label status3 = new Label();
        Label status4 = new Label();


        NewGameButton newGameButton = new NewGameButton();
        ExitGameButton exitGameButton = new ExitGameButton();
        ButtonsCreator buttonsCreator = new ButtonsCreator();
        UserMover userMover = new UserMover();



        List<Button>  buttons = new ArrayList<>();


        buttonsCreator.createButtons(buttons);
        Button newGameBtn = buttonsCreator.createNewGameButton(new Button("NEW GAME"));
        newGameBtn.setOnAction((ActionEvent a) -> newGameButton.newGame(buttons));
        Button exitGameBtn = buttonsCreator.createExitGameButton(new Button("EXIT GAME"));
        exitGameBtn.setOnAction((ActionEvent a) -> exitGameButton.exitGame());

        userMover.userMove(buttons);


        GridPane root = new GridPane();

        root.addRow(1, buttons.get(0), buttons.get(1), buttons.get(2));
        root.addRow(2, buttons.get(3), buttons.get(4), buttons.get(5));
        root.addRow(3, buttons.get(6), buttons.get(7), buttons.get(8));
        root.addRow(4, status1, status2, status3);
        root.addRow(5, status4);
        root.addRow(6, newGameBtn, exitGameBtn);


        Scene scene1 = new Scene(root, 300, 400);

        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene1);
        primaryStage.show();

    }
}