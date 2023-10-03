package com.example.stepTracker;

import com.example.stepTracker.messageToTheConsole.MonthEntryRequest;
import com.example.stepTracker.messageToTheConsole.RequestForDayEntry;
import com.example.stepTracker.messageToTheConsole.RequestToEnterTheNumberOfSteps;

import java.util.Scanner;

final class StepsForToday {
     private class DateAndSteps {
        public String month;
        public int day;
        public int steps;

        public DateAndSteps(String month, int day, int steps) {
            this.month = month;
            this.day = day;
            this.steps = steps;
        }
    }

    private DateAndSteps introductionOfSteps() {
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
