package com.example.stepTracker;


import com.example.stepTracker.messageToTheConsole.MenuMessageTemplateToConsole;
import com.example.stepTracker.messageToTheConsole.PrintingAnErrorMessage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.scanningUserData();
    }

    MenuMessageTemplateToConsole menuMessageTemplateToConsole = new MenuMessageTemplateToConsole();
    Scanner scanner = new Scanner(System.in);

    private int scanningUserData() {  //проверить на исключения


        System.out.println(menuMessageTemplateToConsole.getTemplate());
        int userInput = scanner.nextInt();


        while (userInput < 0 && userInput > 4) {             //обработка некорректного запроса
            PrintingAnErrorMessage printingAnErrorMessage = new PrintingAnErrorMessage();
            System.out.println(printingAnErrorMessage.getTemplate());
            System.out.println(menuMessageTemplateToConsole.getTemplate());
            userInput = scanner.nextInt();

        }
        return userInput;
    }

    private void actionMenuSelection(int userInput) {
       // ActionMenuSelection.getTemplateByCode(userInput).

    }


}
