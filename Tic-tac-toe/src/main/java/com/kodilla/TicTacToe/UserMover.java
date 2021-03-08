package com.kodilla.TicTacToe;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.List;

public class UserMover {

    Label status1;
    Label status2;
    Label status3;
    Label status4;

    WinXChecker winXChecker = new WinXChecker();
    WinOChecker winOChecker = new WinOChecker();
    TieChecker tieChecker = new TieChecker();
    AllButtonsDisabler allButtonsDisabler = new AllButtonsDisabler();
    StatusChecker statusChecker = new StatusChecker();
    ComputerMover computerMover = new ComputerMover();


    public void userMove(List<Button> buttons) {

        List<Button> userMoves = new ArrayList<>();
        for (Button userClick : buttons) {
            userMoves.add(userClick);
            userClick.setOnAction((ActionEvent e) -> {
                userMove(userMoves);
                userClick.setText("X");
                winXChecker.checkWinX(userMoves);
                userClick.setDisable(true);
                 if(winXChecker.checkWinX(userMoves)) {


                     allButtonsDisabler.allButtonsDisable(buttons);
                     statusChecker.checkStatus(status1, status2, status3);

                 }else if(tieChecker.checkTie(buttons)){
                     status3.setText("REMIS");
                     allButtonsDisabler.allButtonsDisable(buttons);
                     statusChecker.checkStatus(status1, status2, status3);

                 } else {
                     computerMover.computerMove(buttons);
                     if(winOChecker.checkWinO(buttons)) {
                         status2.setText("WYGRANA O");
                         allButtonsDisabler.allButtonsDisable(buttons);
                         statusChecker.checkStatus(status1, status2, status3);
                     }
                 }




            });

                }


        }


    }

