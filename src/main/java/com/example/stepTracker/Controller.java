package com.example.stepTracker;

import com.example.stepTracker.messageToTheConsole.impl.MenuMessageTemplateToConsole;
import com.example.stepTracker.messageToTheConsole.impl.PrintingAnErrorMessage;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Controller {
    MenuMessageTemplateToConsole menuMessageTemplateToConsole = new MenuMessageTemplateToConsole(); // Создание объекта класса вызывающищего меню в консоль.
    Scanner scanner = new Scanner(System.in); // Сканер

    public Integer scanningUserData() {  //(проверить на исключения) Вызов меню и сканирование выбора пункта меню.


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


    //Определение необходимого подпункта меню и соответствующего действия
    public void actionMenuSelection() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Object actionMenuSelection = ActionMenuSelection.getTemplateByCode(scanningUserData()).getMenuItemsEnum().getMenuItems();
        System.out.println(actionMenuSelection);
    }

    /*public static void main(String[] args) { //Test
        System.out.println(ActionMenuSelection.getTemplateByCode(1));
        String s = String.valueOf(ActionMenuSelection.getTemplateByCode(1));
        String s2 = s.toLowerCase();
        System.out.println(s2);
    }*/
}
