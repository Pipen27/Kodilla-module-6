package com.kodilla.TicTacToe;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.List;

public class TieChecker {
    Label status1;
    Label status2;
    Label status3;


    public boolean checkTie(List<Button> buttons) {
        if (!buttons.get(0).getText().equals("CLICK") && !buttons.get(1).getText().equals("CLICK") && !buttons.get(2).getText().equals("CLICK") &&
                !buttons.get(3).getText().equals("CLICK") && !buttons.get(4).getText().equals("CLICK") && !buttons.get(5).getText().equals("CLICK") &&
                !buttons.get(6).getText().equals("CLICK") && !buttons.get(7).getText().equals("CLICK") && !buttons.get(8).getText().equals("CLICK") &&
                !status1.getText().equals("WYGRANA X") && !status2.getText().equals("WYGRANA O")) {
            status1.setText("");
            status2.setText("");
            status3.setText("REMIS");

        }
        return false;}
}
