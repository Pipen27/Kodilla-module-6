package com.kodilla.TicTacToe;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.sql.RowId;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class TicTacToe extends Application {

    private Label status1 = new Label();
    private Label status2 = new Label();
    private Label status3 = new Label();
    private Label status4 = new Label();




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

        Button newGameBtn = new Button("NEW GAME");
        Button exitGameBtn = new Button("EXIT GAME");

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
            if (checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9)==true){}

            else if(checkTie(button1, button2, button3, button4, button5, button6, button7, button8, button9)==true){
                checkStatus(button1, button2, button3, button4, button5, button6, button7, button8, button9);

            } else { computerMove(buttons);
                checkWinO(button1, button2, button3, button4, button5, button6, button7, button8, button9);

            }
        });



        button2.setPrefWidth(100);
        button2.setPrefHeight(100);
        button2.setOnAction((ActionEvent e) -> {
            button2.setText("X");
            checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9);
            button2.setDisable(true);
            if (checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9)==true){}

            else if(checkTie(button1, button2, button3, button4, button5, button6, button7, button8, button9)==true){
                checkStatus(button1, button2, button3, button4, button5, button6, button7, button8, button9);

            } else { computerMove(buttons);
                checkWinO(button1, button2, button3, button4, button5, button6, button7, button8, button9);

            }
        });


        button3.setPrefWidth(100);
        button3.setPrefHeight(100);
        button3.setOnAction((ActionEvent e) -> {
            button3.setText("X");
            checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9);
            button3.setDisable(true);
            if (checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9)==true){}

            else if(checkTie(button1, button2, button3, button4, button5, button6, button7, button8, button9)==true){
                checkStatus(button1, button2, button3, button4, button5, button6, button7, button8, button9);

            } else { computerMove(buttons);
                checkWinO(button1, button2, button3, button4, button5, button6, button7, button8, button9);

            }
        });


        button4.setPrefWidth(100);
        button4.setPrefHeight(100);
        button4.setOnAction((ActionEvent e) -> {
            button4.setText("X");
            checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9);
            button4.setDisable(true);
            if (checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9)==true){}

            else if(checkTie(button1, button2, button3, button4, button5, button6, button7, button8, button9)==true){
                checkStatus(button1, button2, button3, button4, button5, button6, button7, button8, button9);

            } else { computerMove(buttons);
                checkWinO(button1, button2, button3, button4, button5, button6, button7, button8, button9);

            }
        });


        button5.setPrefWidth(100);
        button5.setPrefHeight(100);
        button5.setOnAction((ActionEvent e) -> {
            button5.setText("X");
            checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9);
            button5.setDisable(true);
            if (checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9)==true){}

            else if(checkTie(button1, button2, button3, button4, button5, button6, button7, button8, button9)==true){
                checkStatus(button1, button2, button3, button4, button5, button6, button7, button8, button9);

            } else { computerMove(buttons);
                checkWinO(button1, button2, button3, button4, button5, button6, button7, button8, button9);

            }
        });


        button6.setPrefWidth(100);
        button6.setPrefHeight(100);
        button6.setOnAction((ActionEvent e) -> {
            button6.setText("X");
            checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9);
            button6.setDisable(true);
            if (checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9)==true){}

            else if(checkTie(button1, button2, button3, button4, button5, button6, button7, button8, button9)==true){
                checkStatus(button1, button2, button3, button4, button5, button6, button7, button8, button9);

            } else { computerMove(buttons);
                checkWinO(button1, button2, button3, button4, button5, button6, button7, button8, button9);

            }
        });


        button7.setPrefWidth(100);
        button7.setPrefHeight(100);
        button7.setOnAction((ActionEvent e) -> {
            button7.setText("X");
            checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9);
            button7.setDisable(true);
            if (checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9)==true){}

            else if(checkTie(button1, button2, button3, button4, button5, button6, button7, button8, button9)==true){
                checkStatus(button1, button2, button3, button4, button5, button6, button7, button8, button9);

            } else { computerMove(buttons);
                checkWinO(button1, button2, button3, button4, button5, button6, button7, button8, button9);

            }
        });


        button8.setPrefWidth(100);
        button8.setPrefHeight(100);
        button8.setOnAction((ActionEvent e) -> {
            button8.setText("X");
            checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9);
            button8.setDisable(true);
            if (checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9)==true){}

            else if(checkTie(button1, button2, button3, button4, button5, button6, button7, button8, button9)==true){
                checkStatus(button1, button2, button3, button4, button5, button6, button7, button8, button9);

            } else { computerMove(buttons);
                checkWinO(button1, button2, button3, button4, button5, button6, button7, button8, button9);

            }
        });


        button9.setPrefWidth(100);
        button9.setPrefHeight(100);
        button9.setOnAction((ActionEvent e) -> {
            button9.setText("X");
            checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9);
            button9.setDisable(true);
                if (checkWinX(button1, button2, button3, button4, button5, button6, button7, button8, button9)==true){}

            else if(checkTie(button1, button2, button3, button4, button5, button6, button7, button8, button9)==true){
            checkStatus(button1, button2, button3, button4, button5, button6, button7, button8, button9);

                } else { computerMove(buttons);
                    checkWinO(button1, button2, button3, button4, button5, button6, button7, button8, button9);

                    }
        }
        );

        newGameBtn.setOnAction((ActionEvent a) ->{
            newGame(button1, button2, button3, button4, button5, button6, button7, button8, button9);

        });

        exitGameBtn.setOnAction((ActionEvent a) ->{
            exitGame();


        });

        GridPane root = new GridPane();

        root.addRow(1, button1, button2, button3);
        root.addRow(2, button4, button5, button6);
        root.addRow(3, button7, button8, button9);
        root.addRow(4, status1, status2, status3);
        root.addRow(5, status4);
        root.addRow(6, newGameBtn, exitGameBtn);




        Scene scene1 = new Scene(root, 300, 400);


        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene1);
        primaryStage.show();




    }

    private boolean checkWinX(Button button1, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, Button button8, Button button9) {
        if (button1.getText() == "X" && button2.getText() == "X" && button3.getText() == "X") {
            status1.setText("WYGRANA X");
            allButtonsDisable(button1, button2, button3, button4, button5, button6, button7, button8, button9);


        } else if (button4.getText() == "X" && button5.getText() == "X" && button6.getText() == "X") {
            status1.setText("WYGRANA X");
            allButtonsDisable(button1, button2, button3, button4, button5, button6, button7, button8, button9);


        } else if (button7.getText() == "X" && button8.getText() == "X" && button9.getText() == "X") {
            status1.setText("WYGRANA X");
            allButtonsDisable(button1, button2, button3, button4, button5, button6, button7, button8, button9);


        } else if (button1.getText() == "X" && button4.getText() == "X" && button7.getText() == "X") {
            status1.setText("WYGRANA X");
            allButtonsDisable(button1, button2, button3, button4, button5, button6, button7, button8, button9);


        } else if (button2.getText() == "X" && button5.getText() == "X" && button8.getText() == "X") {
            status1.setText("WYGRANA X");
            allButtonsDisable(button1, button2, button3, button4, button5, button6, button7, button8, button9);


        } else if (button3.getText() == "X" && button6.getText() == "X" && button9.getText() == "X") {
            status1.setText("WYGRANA X");
            allButtonsDisable(button1, button2, button3, button4, button5, button6, button7, button8, button9);


        } else if (button1.getText() == "X" && button5.getText() == "X" && button9.getText() == "X") {
            status1.setText("WYGRANA X");
            allButtonsDisable(button1, button2, button3, button4, button5, button6, button7, button8, button9);


        } else if (button3.getText() == "X" && button5.getText() == "X" && button7.getText() == "X") {
            status1.setText("WYGRANA X");
            allButtonsDisable(button1, button2, button3, button4, button5, button6, button7, button8, button9);


        }
    return false;}


    private void checkWinO(Button button1, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, Button button8, Button button9) {
        if (button1.getText() == "O" && button2.getText() == "O" && button3.getText() == "O") {
            status2.setText("WYGRANA O");
            allButtonsDisable(button1, button2, button3, button4, button5, button6, button7, button8, button9);

        } else if (button4.getText() == "O" && button5.getText() == "O" && button6.getText() == "O") {
            status2.setText("WYGRANA O");
            allButtonsDisable(button1, button2, button3, button4, button5, button6, button7, button8, button9);

        } else if (button7.getText() == "O" && button8.getText() == "O" && button9.getText() == "O") {
            status2.setText("WYGRANA O");
            allButtonsDisable(button1, button2, button3, button4, button5, button6, button7, button8, button9);

        } else if (button1.getText() == "O" && button4.getText() == "O" && button7.getText() == "O") {
            status2.setText("WYGRANA O");
            allButtonsDisable(button1, button2, button3, button4, button5, button6, button7, button8, button9);

        } else if (button2.getText() == "O" && button5.getText() == "O" && button8.getText() == "O") {
            status2.setText("WYGRANA O");
            allButtonsDisable(button1, button2, button3, button4, button5, button6, button7, button8, button9);

        } else if (button3.getText() == "O" && button6.getText() == "O" && button9.getText() == "O") {
            status2.setText("WYGRANA O");
            allButtonsDisable(button1, button2, button3, button4, button5, button6, button7, button8, button9);

        } else if (button1.getText() == "O" && button5.getText() == "O" && button9.getText() == "O") {
            status2.setText("WYGRANA O");
            allButtonsDisable(button1, button2, button3, button4, button5, button6, button7, button8, button9);

        } else if (button3.getText() == "O" && button5.getText() == "O" && button7.getText() == "O") {
            status2.setText("WYGRANA O");
            allButtonsDisable(button1, button2, button3, button4, button5, button6, button7, button8, button9);

        }
    }

    private boolean checkTie(Button button1, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, Button button8, Button button9) {
        if (button1.getText() != "CLICK" && button2.getText() != "CLICK" && button3.getText() != "CLICK" &&
            button4.getText() != "CLICK" && button5.getText() != "CLICK" && button6.getText() != "CLICK" &&
            button7.getText() != "CLICK" && button8.getText() != "CLICK" && button9.getText() != "CLICK" &&
            status1.getText() != "WYGRANA X" && status2.getText() != "WYGRANA O") {
            status1.setText("");
            status2.setText("");
            status3.setText("REMIS");
            allButtonsDisable(button1, button2, button3, button4, button5, button6, button7, button8, button9);
        }
    return false;}

    private void checkStatus (Button button1, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, Button button8, Button button9){
        if (status1.getText() == "WYGRANA X" || status2.getText() == "WYGRANA O" || status3.getText() == "REMIS" ){
            allButtonsDisable(button1, button2, button3, button4, button5, button6, button7, button8, button9);

            status4.setMaxWidth(100);
            status4.setWrapText(true);
            status4.setText("KONIEC GRY LUB BRAK RUCHOW");;
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
        if(clickList.size()<1 ) {

        status4.setMaxWidth(100);
        status4.setWrapText(true);
        status4.setText("END of the game or NO MORE moves");

        }else{
        Button emptyButton = clickList.get(index);
        emptyButton.setText("O");
        emptyButton.setDisable(true);}
        System.out.println(clickList.size());

    }

    private void allButtonsDisable(Button button1, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, Button button8, Button button9){

        button1.setDisable(true);
        button2.setDisable(true);
        button3.setDisable(true);
        button4.setDisable(true);
        button5.setDisable(true);
        button6.setDisable(true);
        button7.setDisable(true);
        button8.setDisable(true);
        button9.setDisable(true);

    }

    private void newGame(Button button1, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, Button button8, Button button9) {
        button1.setText("CLICK");
        button1.setDisable(false);
        button2.setText("CLICK");
        button2.setDisable(false);
        button3.setText("CLICK");
        button3.setDisable(false);
        button4.setText("CLICK");
        button4.setDisable(false);
        button5.setText("CLICK");
        button5.setDisable(false);
        button6.setText("CLICK");
        button6.setDisable(false);
        button7.setText("CLICK");
        button7.setDisable(false);
        button8.setText("CLICK");
        button8.setDisable(false);
        button9.setText("CLICK");
        button9.setDisable(false);
        status1.setText("");
        status2.setText("");
        status3.setText("");
        status4.setText("");

    }

    private void exitGame(){
        Platform.exit();
    }
}


