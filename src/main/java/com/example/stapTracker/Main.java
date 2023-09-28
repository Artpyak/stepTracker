package com.example.stapTracker;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.scanningUserData();
        main.actionDefinition();
    }

    MessageToTheConsole messageToTheConsole = new MessageToTheConsole();
    Scanner scanner = new Scanner(System.in);
    private Integer scanningUserData() {  //проверить на исключения


        messageToTheConsole.printMenu();
        int userInput = scanner.nextInt();

        while (userInput < 0) {             //обработка некорректного запроса

            messageToTheConsole.printingAnErrorMessage();
            messageToTheConsole.printMenu();
            userInput = scanner.nextInt();

        }

        return userInput;
    }

    private void actionDefinition() {
        switch (scanningUserData()) {
            case 1:
                Main main = new Main();
                main.introductionOfSteps();
            case 2:
            case 3:
            case 4:
        }
    }

    private void introductionOfSteps() {
        messageToTheConsole.monthEntryRequest();
        String month = scanner.nextLine();
        messageToTheConsole.requestForDayEntry();
        int day = scanner.nextInt();
        messageToTheConsole.requestToEnterTheNumberOfSteps();
        int steps = scanner.nextInt();

    }

}
