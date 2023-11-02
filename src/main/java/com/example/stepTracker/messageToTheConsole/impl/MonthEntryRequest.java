package com.example.stepTracker.messageToTheConsole.impl;

import com.example.stepTracker.messageToTheConsole.ConsoleMessageTemplate;

public class MonthEntryRequest implements ConsoleMessageTemplate {
    @Override
    public String getTemplate() {
        return "Выберете номер месяца:\n" +
                "JANUARY (1),\n" +
                "FEBRUARY (2),\n" +
                "MARCH (3),\n" +
                "APRIL (4),\n" +
                "MAY (5),\n" +
                "JUNE (6),\n" +
                "JULY (7),\n" +
                "AUGUST (8),\n" +
                "SEPTEMBER (9),\n" +
                "OCTOBER (10),\n" +
                "NOVEMBER (11),\n" +
                "DECEMBER (12);";
    }
}
