package com.example.stepTracker.menuItems.impl;

import com.example.stepTracker.menuItems.MenuItems;
import com.example.stepTracker.messageToTheConsole.impl.MonthEntryRequest;
import com.example.stepTracker.messageToTheConsole.impl.RequestForDayEntry;
import com.example.stepTracker.messageToTheConsole.impl.RequestToEnterTheNumberOfSteps;

import java.util.Scanner;

public class NumberOfSteps implements MenuItems {

    int steps;
    int day;
    int monthNumber;

    @Override
    public Object getMenuItems() {
        menuItemRetrieval();
        databaseFilling();
        return null; //Исправить поебень с null
    }

    public void databaseFilling() { //Определяет месяц для заполнения hashMap

    }

    public void menuItemRetrieval() { //Подпункт меню сканирующий: месяц, дату и шаги.
        MonthEntryRequest monthEntryRequest = new MonthEntryRequest();
        RequestForDayEntry requestForDayEntry = new RequestForDayEntry();
        RequestToEnterTheNumberOfSteps requestToEnterTheNumberOfSteps = new RequestToEnterTheNumberOfSteps();
        Scanner scanner = new Scanner(System.in);

        System.out.println(monthEntryRequest.getTemplate());
        monthNumber = scanner.nextInt();
        System.out.println(requestForDayEntry.getTemplate());
        day = scanner.nextInt();
        System.out.println(requestToEnterTheNumberOfSteps.getTemplate());
        steps = scanner.nextInt();
    }

    /*public DateAndSteps menuItemRetrieval() { //Подпункт меню сканирующий: месяц, дату и шаги. Возвращает объект с данными.
        MonthEntryRequest monthEntryRequest = new MonthEntryRequest();
        RequestForDayEntry requestForDayEntry = new RequestForDayEntry();
        RequestToEnterTheNumberOfSteps requestToEnterTheNumberOfSteps = new RequestToEnterTheNumberOfSteps();
        Scanner scanner = new Scanner(System.in);

        System.out.println(monthEntryRequest.getTemplate());
        int monthNumber = scanner.nextInt();
        System.out.println(requestForDayEntry.getTemplate());
        int day = scanner.nextInt();
        System.out.println(requestToEnterTheNumberOfSteps.getTemplate());
        int steps = scanner.nextInt();
        return new DateAndSteps(monthNumber, day, steps);
    }*/


    /*public class DateAndSteps implements DateAndStepsInterface { //Класс для сохранения и передачи: месяца, даты и количества шагов
        int monthNumber;
        int day;
        int steps;

        public DateAndSteps(int monthNumber, int day, int steps) {
            this.monthNumber = monthNumber;
            this.day = day;
            this.steps = steps;
        }

        @Override
        public int getMonthNumber() {
            return monthNumber;
        }

        @Override
        public int getDay() {
            return day;
        }

        @Override
        public int getSteps() {
            return steps;
        }
    }*/
}
