package com.kodilla.TicTacToe;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.List;

public class WinOChecker {

     Label statusO = new Label();

    public boolean checkWinO(List<Button> buttons) {

        if (buttons.get(0).getText().equals("O") && buttons.get(1).getText().equals("O") && buttons.get(2).getText().equals("O")) {
            statusO.setText("WYGRANA O");



        } else if (buttons.get(3).getText().equals("O") && buttons.get(4).getText().equals("O") && buttons.get(5).getText().equals("O")) {
            statusO.setText("WYGRANA O");



        } else if (buttons.get(6).getText().equals("O") && buttons.get(7).getText().equals("O") && buttons.get(8).getText().equals("O")) {
            statusO.setText("WYGRANA O");



        } else if (buttons.get(0).getText().equals("O") && buttons.get(3).getText().equals("O") && buttons.get(6).getText().equals("O")) {
            statusO.setText("WYGRANA O");



        } else if (buttons.get(1).getText().equals("O") && buttons.get(4).getText().equals("O") && buttons.get(7).getText().equals("O")) {
            statusO.setText("WYGRANA O");



        } else if (buttons.get(2).getText().equals("O") && buttons.get(5).getText().equals("O") && buttons.get(8).getText().equals("O")) {
            statusO.setText("WYGRANA O");



        } else if (buttons.get(0).getText().equals("O") && buttons.get(4).getText().equals("O") && buttons.get(8).getText().equals("O")) {
            statusO.setText("WYGRANA O");



        } else if (buttons.get(2).getText().equals("O") && buttons.get(4).getText().equals("O") && buttons.get(6).getText().equals("O")) {
            statusO.setText("WYGRANA O");



        }
        return false;}
}
