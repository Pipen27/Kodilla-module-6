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
import java.util.Random;


public class TicTacToe extends Application {

    private Label status1 = new Label();
    private Label status2 = new Label();



    public static void main(String[] args) {
        launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws Exception {


        Button button1 = new Button("CLICK");
        Button button2 = new Button("CLICK");
        Button button3 = new Button("CLICK");
        Button button4 = new Button("CLICK");
        Button button5 = new Button("CLICK");
        Button button6 = new Button("CLICK");
        Button button7 = new Button("CLICK");
        Button button8 = new Button("CLICK");
        Button button9 = new Button("CLICK");

        List<Button>  buttons = new ArrayList<>();
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        buttons.add(button6);
        buttons.add(button7);
        buttons.add(button8);
        buttons.add(button9);


        button1.setPrefWidth(100);
        button1.setPrefHeight(100);
        button1.setOnAction((ActionEvent e) -> {
            button1.setText("X");
            checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9);
            button1.setDisable(true);
            computerMove(buttons);
            checkWinO(button1, button2, button3, button4, button5, button6, button7, button8, button9);
        });



        button2.setPrefWidth(100);
        button2.setPrefHeight(100);
        button2.setOnAction((ActionEvent e) -> {
            button2.setText("X");
            checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9);
            button2.setDisable(true);
            computerMove(buttons);
            checkWinO(button1, button2, button3, button4, button5, button6, button7, button8, button9);
        });


        button3.setPrefWidth(100);
        button3.setPrefHeight(100);
        button3.setOnAction((ActionEvent e) -> {
            button3.setText("X");
            checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9);
            button3.setDisable(true);
            computerMove(buttons);
            checkWinO(button1, button2, button3, button4, button5, button6, button7, button8, button9);
        });


        button4.setPrefWidth(100);
        button4.setPrefHeight(100);
        button4.setOnAction((ActionEvent e) -> {
            button4.setText("X");
            checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9);
            button4.setDisable(true);
            computerMove(buttons);
            checkWinO(button1, button2, button3, button4, button5, button6, button7, button8, button9);
        });


        button5.setPrefWidth(100);
        button5.setPrefHeight(100);
        button5.setOnAction((ActionEvent e) -> {
            button5.setText("X");
            checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9);
            button5.setDisable(true);
            computerMove(buttons);
            checkWinO(button1, button2, button3, button4, button5, button6, button7, button8, button9);
        });


        button6.setPrefWidth(100);
        button6.setPrefHeight(100);
        button6.setOnAction((ActionEvent e) -> {
            button6.setText("X");
            checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9);
            button6.setDisable(true);
            computerMove(buttons);
            checkWinO(button1, button2, button3, button4, button5, button6, button7, button8, button9);
        });


        button7.setPrefWidth(100);
        button7.setPrefHeight(100);
        button7.setOnAction((ActionEvent e) -> {
            button7.setText("X");
            checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9);
            button7.setDisable(true);
            computerMove(buttons);
            checkWinO(button1, button2, button3, button4, button5, button6, button7, button8, button9);
        });


        button8.setPrefWidth(100);
        button8.setPrefHeight(100);
        button8.setOnAction((ActionEvent e) -> {
            button8.setText("X");
            checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9);
            button8.setDisable(true);
            computerMove(buttons);
            checkWinO(button1, button2, button3, button4, button5, button6, button7, button8, button9);
        });


        button9.setPrefWidth(100);
        button9.setPrefHeight(100);
        button9.setOnAction((ActionEvent e) -> {
            button9.setText("X");
            checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9);
            button9.setDisable(true);
            computerMove(buttons);
            checkWinO(button1, button2, button3, button4, button5, button6, button7, button8, button9);
        }
        );

        GridPane root = new GridPane();

        root.addRow(1, button1, button2, button3);
        root.addRow(2, button4, button5, button6);
        root.addRow(3, button7, button8, button9);
        root.addRow(4, status1, status2);



        Scene scene1 = new Scene(root, 400, 400);


        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene1);
        primaryStage.show();




    }

    private void checkWinX(Button button1, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, Button button8, Button button9) {
        if (button1.getText() == "X" && button2.getText() == "X" && button3.getText() == "X") {
            status1.setText("WYGRANA X");


        } else if (button4.getText() == "X" && button5.getText() == "X" && button6.getText() == "X") {
            status1.setText("WYGRANA X");


        } else if (button7.getText() == "X" && button8.getText() == "X" && button9.getText() == "X") {
            status1.setText("WYGRANA X");


        } else if (button1.getText() == "X" && button4.getText() == "X" && button7.getText() == "X") {
            status1.setText("WYGRANA X");


        } else if (button2.getText() == "X" && button5.getText() == "X" && button8.getText() == "X") {
            status1.setText("WYGRANA X");


        } else if (button3.getText() == "X" && button6.getText() == "X" && button9.getText() == "X") {
            status1.setText("WYGRANA X");


        } else if (button1.getText() == "X" && button5.getText() == "X" && button9.getText() == "X") {
            status1.setText("WYGRANA X");


        } else if (button3.getText() == "X" && button5.getText() == "X" && button7.getText() == "X") {
            status1.setText("WYGRANA X");


        }
    }


    private void checkWinO(Button button1, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, Button button8, Button button9) {
        if (button1.getText() == "O" && button2.getText() == "O" && button3.getText() == "O") {
            status2.setText("WYGRANA O");

        } else if (button4.getText() == "O" && button5.getText() == "O" && button6.getText() == "O") {
            status2.setText("WYGRANA O");

        } else if (button7.getText() == "O" && button8.getText() == "O" && button9.getText() == "O") {
            status2.setText("WYGRANA O");

        } else if (button1.getText() == "O" && button4.getText() == "O" && button7.getText() == "O") {
            status2.setText("WYGRANA O");

        } else if (button2.getText() == "O" && button5.getText() == "O" && button8.getText() == "O") {
            status2.setText("WYGRANA O");

        } else if (button3.getText() == "O" && button6.getText() == "O" && button9.getText() == "O") {
            status2.setText("WYGRANA O");

        } else if (button1.getText() == "O" && button5.getText() == "O" && button9.getText() == "O") {
            status2.setText("WYGRANA O");

        } else if (button3.getText() == "O" && button5.getText() == "O" && button7.getText() == "O") {
            status2.setText("WYGRANA O");

        }
    }


    private void computerMove(List<Button> buttons) {
        List <Button> clickList = new ArrayList<>();
        for(Button onlyClick : buttons){
           if( onlyClick.getText().equals("CLICK")){
               clickList.add(onlyClick);
           }
        }

        Random a = new Random();
        int index = a.nextInt(clickList.size());
        Button emptyButton = clickList.get(index);
        emptyButton.setText("O");
    }

}


