package com.kodilla.TicTacToe;

import javafx.scene.control.Button;

import java.util.List;

public class AllButtonsDisabler {

    public void allButtonsDisable(List<Button> buttons){

        buttons.get(0).setDisable(true);
        buttons.get(1).setDisable(true);
        buttons.get(2).setDisable(true);
        buttons.get(3).setDisable(true);
        buttons.get(4).setDisable(true);
        buttons.get(5).setDisable(true);
        buttons.get(6).setDisable(true);
        buttons.get(7).setDisable(true);
        buttons.get(8).setDisable(true);



    }
}
