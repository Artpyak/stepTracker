package com.example.stepTracker;


import com.example.stepTracker.messageToTheConsole.MenuMessageTemplateToConsole;
import com.example.stepTracker.messageToTheConsole.PrintingAnErrorMessage;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Main main = new Main();
        main.actionMenuSelection();

    }

    MenuMessageTemplateToConsole menuMessageTemplateToConsole = new MenuMessageTemplateToConsole();
    Scanner scanner = new Scanner(System.in);

    public Integer scanningUserData() {  //проверить на исключения


        System.out.println(menuMessageTemplateToConsole.getTemplate());
        int userInput = scanner.nextInt();


        while (userInput > 1 && userInput < 4) {             //обработка некорректного запроса
            PrintingAnErrorMessage printingAnErrorMessage = new PrintingAnErrorMessage();
            System.out.println(printingAnErrorMessage.getTemplate());
            System.out.println(menuMessageTemplateToConsole.getTemplate());
            userInput = scanner.nextInt();

        }
        return userInput;
    }

    public StepTracker stepTrackerinMain = new StepTracker();

    private void actionMenuSelection() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Main main = new Main();
        Object actionMenuSelection = ActionMenuSelection.getTemplateByCode(main.scanningUserData()).getMenuItemsEnum().getMenuItems();
        System.out.println(actionMenuSelection);
    }


}
