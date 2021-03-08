package com.kodilla.TicTacToe;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.List;

public class NewGameButton {

    Label status1;
    Label status2;
    Label status3;
    Label status4;

    public void newGame(List<Button> buttons) {
        buttons.get(0).setText("CLICK");
        buttons.get(0).setDisable(false);
        buttons.get(1).setText("CLICK");
        buttons.get(1).setDisable(false);
        buttons.get(2).setText("CLICK");
        buttons.get(2).setDisable(false);
        buttons.get(3).setText("CLICK");
        buttons.get(3).setDisable(false);
        buttons.get(4).setText("CLICK");
        buttons.get(4).setDisable(false);
        buttons.get(5).setText("CLICK");
        buttons.get(5).setDisable(false);
        buttons.get(6).setText("CLICK");
        buttons.get(6).setDisable(false);
        buttons.get(7).setText("CLICK");
        buttons.get(7).setDisable(false);
        buttons.get(8).setText("CLICK");
        buttons.get(8).setDisable(false);

        status1.setText("");
        status2.setText("");
        status3.setText("");
        status4.setText("");

    }
}
