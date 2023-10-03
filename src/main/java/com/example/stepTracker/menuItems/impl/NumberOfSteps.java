package com.example.stepTracker.menuItems.impl;

import com.example.stepTracker.menuItems.MenuItems;
import com.example.stepTracker.messageToTheConsole.MonthEntryRequest;
import com.example.stepTracker.messageToTheConsole.RequestForDayEntry;
import com.example.stepTracker.messageToTheConsole.RequestToEnterTheNumberOfSteps;

import java.util.Scanner;

public class NumberOfSteps implements MenuItems {

    public class DateAndSteps {
        String month;
        int day;
        int steps;

        public DateAndSteps(String month, int day, int steps) {
            this.month = month;
            this.day = day;
            this.steps = steps;
        }
    }

    @Override
    public DateAndSteps getMenuItems() {
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
}
