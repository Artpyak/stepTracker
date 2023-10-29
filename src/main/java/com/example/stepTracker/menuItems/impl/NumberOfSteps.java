package com.example.stepTracker.menuItems.impl;

import com.example.stepTracker.menuItems.MenuItems;
import com.example.stepTracker.messageToTheConsole.impl.MonthEntryRequest;
import com.example.stepTracker.messageToTheConsole.impl.RequestForDayEntry;
import com.example.stepTracker.messageToTheConsole.impl.RequestToEnterTheNumberOfSteps;

import java.util.Scanner;

public class NumberOfSteps implements MenuItems {

    public class DateAndSteps implements DateAndStepsInterface { //Класс для сохранения и передачи: месяца, даты и количества шагов
        String month;
        int day;
        int steps;

        public DateAndSteps(String month, int day, int steps) {
            this.month = month;
            this.day = day;
            this.steps = steps;
        }

        @Override
        public String getMonth() {
            return month;
        }

        @Override
        public int getDay() {
            return day;
        }

        @Override
        public int getSteps() {
            return steps;
        }
    }

    @Override
    public Object getMenuItems() {
        databaseFilling();
        return null; //Исправить поебень с null
    }

    public DateAndSteps menuItemRetrieval() { //Подпункт меню сканирующий: месяц, дату и шаги. Возвращат объект с данными.
        MonthEntryRequest monthEntryRequest = new MonthEntryRequest();
        RequestForDayEntry requestForDayEntry = new RequestForDayEntry();
        RequestToEnterTheNumberOfSteps requestToEnterTheNumberOfSteps = new RequestToEnterTheNumberOfSteps();
        Scanner scanner = new Scanner(System.in);

        System.out.println(monthEntryRequest.getTemplate());
        String month = scanner.nextLine();
        System.out.println(requestForDayEntry.getTemplate());
        int day = scanner.nextInt();
        System.out.println(requestToEnterTheNumberOfSteps.getTemplate());
        int steps = scanner.nextInt();
        return new DateAndSteps(month, day, steps);
    }


    public void databaseFilling() { //Определяет месяц для заполнения hashMap
        DateAndStepsInterface myObject = menuItemRetrieval();
        myObject.getMonth();



    }
}
