package com.example.stapTracker;

public class MessageToTheConsole {

    final void printMenu() {
        System.out.println("Выберите номер действия:\n" +
                "1. Ввести количество шагов за определённый день;\n" +
                "2. Напечатать статистику за определённый месяц;\n" +
                "3. Изменить цель по количеству шагов;\n" +
                "4. Выйти из приложения;");
    }


    final void printingAnErrorMessage() {
        System.out.println("Недопустимый вариант\n" +
                "Введите номер действия");
    }

    final void monthEntryRequest() {
        System.out.println("Введите месяц:");

    }

    final void requestForDayEntry() {
        System.out.println("Введите дату:");
    }

    final void requestToEnterTheNumberOfSteps() {
        System.out.println("Введите количествошагов:");
    }




}
