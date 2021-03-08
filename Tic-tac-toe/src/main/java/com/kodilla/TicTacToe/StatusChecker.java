package com.kodilla.TicTacToe;


import javafx.scene.control.Label;



public class StatusChecker {


    public Label status4;


    public void checkStatus (Label status1, Label status2, Label status3){
        if (status1.getText().equals("WYGRANA X") || status2.getText().equals("WYGRANA O") || status3.getText().equals("REMIS")){

            status4.setMaxWidth(100);
            status4.setWrapText(true);
            status4.setText("END of the game or NO MORE moves");
        }
    }
}
