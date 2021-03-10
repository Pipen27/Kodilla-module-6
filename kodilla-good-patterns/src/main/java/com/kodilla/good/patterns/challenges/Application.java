package com.kodilla.good.patterns.challenges;

import java.util.Scanner;

public class Application {

      public static void main(String[] args) {
//        User user = new User("John", "Wekl");
//
//        LocalDateTime rentFrom = LocalDateTime.of(2017, 8, 1, 12, 0);
//        LocalDateTime rentTo = LocalDateTime.of(2017, 8, 10, 12, 0);
//
//        RentalProcessor rentalProcessor = new RentalProcessor(
//                new MailService(), new CarRentalService(), new CarRentalRepository());
//        rentalProcessor.process(user, rentFrom, rentTo);


          Scanner scanner = new Scanner(System.in);
          boolean shouldContinue = true;

          while (shouldContinue) {

              System.out.println("Wybierz opcję i naciśnij enter");
              System.out.println(" 1. Zakupy");
              System.out.println(" 2. Sprawdź zawartość koszyka");
              System.out.println(" 3. Złóż zamówienie");
              System.out.println(" 4. Koniec zakupów");

              int userChoice = scanner.nextInt();
              switch (userChoice) {
                  case 1 -> System.out.println("1");
                  case 2 -> System.out.println("2");
                  case 3 -> System.out.println("3");
                  case 4 -> shouldContinue = false;
              }

          }

      }
}