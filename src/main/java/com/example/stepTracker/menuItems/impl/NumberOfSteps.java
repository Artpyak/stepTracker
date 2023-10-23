package com.example.stepTracker.menuItems.impl;

import com.example.stepTracker.Main;
import com.example.stepTracker.Months;
import com.example.stepTracker.StepTracker;
import com.example.stepTracker.menuItems.MenuItems;
import com.example.stepTracker.messageToTheConsole.MonthEntryRequest;
import com.example.stepTracker.messageToTheConsole.RequestForDayEntry;
import com.example.stepTracker.messageToTheConsole.RequestToEnterTheNumberOfSteps;

import java.util.Scanner;

public class NumberOfSteps implements MenuItems {

    public class DateAndSteps implements DateAndStepsInterface {
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
        //menuItemRetrieval();
        databaseFilling();
        return null; //Исправить поебень с null
    }

    public DateAndSteps menuItemRetrieval() {
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


    public void databaseFilling() {
        DateAndStepsInterface myObject = menuItemRetrieval();
        myObject.getMonth();

        /*Integer month = Months.valueOf(myObject.getMonth()).ordinal(); //ну тут точно ошибка. тут надо решить как получить стринговове значение одного из перечислений
        StepTracker stepTrackerMain = main.stepTrackerinMain;
        stepTrackerMain.monthDataHashMap.get(month); // и это поебень*/


    }
}
