package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Option {

    Scanner scanner = new Scanner(System.in);
    boolean quitGame = false;
    boolean newGame = false;
    boolean rock = false;
    boolean paper = false;
    boolean scissors = false;
    int compNo = 0;
    int numberOfWin = 0;
    int playerWinCounter = 0;
    int compWinCounter = 0;
    Random random = new Random();


    public void endGame() {

        System.out.println("Czy na pewno chcesz wyjść z gry? (Y/N)");
        String quitGameString = scanner.nextLine();

        if (quitGameString.equals("Y") || quitGameString.equals("y")) {
             quitGame = true;
        } else {
            quitGame = false;
        }
    }

    public void newGame() {

        System.out.println("Czy na pewno chcesz rozpocząć nową grę? (Y/N)");
        String newGameString = scanner.nextLine();

        if (newGameString.equals("Y") || newGameString.equals("y")) {
            newGame = true;
            rock = false;
            paper = false;
            scissors = false;
            compNo = 0;
            playerWinCounter = 0;
            compWinCounter = 0;
        } else {
            newGame = false;
        }
    }

    public void chooseRock(){

        System.out.println("Wybrałeś kamień");
        rock = true;
        computerMove();
        checkWin();
        resetChoice();
        checkWinGame();
    }

    public void choosePaper(){

        System.out.println("Wybrałeś papier");
        paper = true;
        computerMove();
        checkWin();
        resetChoice();
        checkWinGame();
    }

    public void chooseScissors(){

        System.out.println("Wybrałeś nożyce");
        scissors = true;
        computerMove();
        checkWin();
        resetChoice();
        checkWinGame();
    }

    public void computerMove(){

        int compNumber = random.nextInt(3);
        compNumber += 1;

        if (compNumber == 1){
            System.out.println("Komputer wybrał kamień");
            compNo = 1;
        } else if (compNumber == 2){
            System.out.println("Komputer wybrał papier");
            compNo = 2;
        } else {
            System.out.println("Komputer wybrał nożyce");
            compNo = 3;
        }

    }

    public void checkWin () {

        if (rock && compNo == 1) {
            System.out.println("Remis");
        } else if (rock && compNo == 2) {
            System.out.println("Wygrał komputer");
            compWinCounter++;
        } else if (rock && compNo == 3) {
            System.out.println("Wygrałeś");
            playerWinCounter++;
        } else if (paper && compNo == 1) {
            System.out.println("Wygrałeś");
            playerWinCounter++;
        } else if (paper && compNo == 2) {
            System.out.println("Remis");
        } else if (paper && compNo == 3) {
            System.out.println("Wygrał komputer");
            compWinCounter++;
        } else if (scissors && compNo == 1) {
            System.out.println("Wygrał komputer");
            compWinCounter++;
        } else if (scissors && compNo == 2) {
            System.out.println("Wygrałeś");
            playerWinCounter++;
        }  else if (scissors && compNo == 3) {
            System.out.println("Remis");
        }

    }

    public void resetChoice () {

        rock = false;
        paper = false;
        scissors = false;
        compNo = 0;
    }

    public void beginGame () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię i naciśnij enter");
        String userName = scanner.nextLine();
        System.out.println("Witaj " + userName + ", podaj liczbę od 1 do 10 do ilu wygranych chcesz zagrać");
        numberOfWin = scanner.nextInt();
        System.out.println("Będziesz grać do " + numberOfWin + " wygranych. POWODZENIA!");

        while (!quitGame) {

            System.out.println("Wybierz opcję i naciśnij enter");
            System.out.println(" 1. Wybierz kamień");
            System.out.println(" 2. Wybierz papier");
            System.out.println(" 3. Wybierz nożyce");
            System.out.println(" 4. Koniec gry (Y/N");
            System.out.println(" 5. Nowa gra (Y/N");
            System.out.println();
            System.out.println(userName + " - liczba zwycięstw: " + playerWinCounter);
            System.out.println("Komputer - liczba zwycięstw: " + compWinCounter);


            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1 : chooseRock() ;
                case 2 : choosePaper();
                case 3 : chooseScissors();
                case 4 : endGame();
                case 5 : newGame();
                default : System.out.println("Wybrano niepoprawną wartość, wybierz liczbę od 1 do 5");

            }



        }
    }

    public void checkWinGame () {

        if(playerWinCounter == numberOfWin && numberOfWin !=0) {



            System.out.println("Wynik gry: " + playerWinCounter + " : " + compWinCounter);
            System.out.println("Wygrałeś, GRATULACJE!");
            System.out.println("Co chcesz teraz zrobić? Naciśnij x jeśli chcesz wyjść z gry lub n jeśli chcesz rozpocząć nową grę.");

            String userChoice1 = scanner.nextLine();
            switch (userChoice1) {
                case "x" : endGame();
                case "n" : newGame();
                default : System.out.println("Wybrano niepoprawną wartość, naciśnij x lub n");
            }
        } else if (compWinCounter == numberOfWin && numberOfWin !=0) {

            System.out.println("Wynik gry: " + playerWinCounter + " : " + compWinCounter);
            System.out.println("Przegrałeś :(");
            System.out.println("Co chcesz teraz zrobić? Naciśnij x jeśli chcesz wyjść z gry lub n jeśli chcesz rozpocząć nową grę.");

            String userChoice1 = scanner.nextLine();
            switch (userChoice1) {
                case "x" : endGame();
                case "n" : newGame();
                default : System.out.println("Wybrano niepoprawną wartość, naciśnij x lub n");
            }
        } else {}

    }
}
