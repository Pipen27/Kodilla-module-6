package com.kodilla.TicTacToe;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

public class ButtonsCreator extends Button {

    Button button;

    public void createButtons (List<Button> buttons) {
        this.button = button;
        for (int i = 0; i < 9; i++) {
            buttons.add(button = new Button(String.valueOf(i + 1)));
            button.setPrefWidth(100);
            button.setPrefHeight(100);
            button.setText("CLICK");


        }
    }

    public Button createNewGameButton(Button newGameBtn){

       return newGameBtn;

    }

    public Button createExitGameButton(Button exitGameBtn){

        return exitGameBtn;
    }

    }
