package com.kodilla.TicTacToe;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComputerMover {

    public Label status4;

    public void computerMove(List<Button> buttons) {
        List<Button> clickList = new ArrayList<>();
        for (Button onlyClick : buttons) {
            if (onlyClick.getText().equals("CLICK")) {
                clickList.add(onlyClick);
            }
        }

        Random a = new Random();
        if (clickList.size() >= 1) {
            int index = a.nextInt(clickList.size());


            Button emptyButton = clickList.get(index);
            emptyButton.setText("O");
            emptyButton.setDisable(true);
        }else{
            status4.setMaxWidth(100);
            status4.setWrapText(true);
            status4.setText("END of the game or NO MORE moves");
        }

    }
}
