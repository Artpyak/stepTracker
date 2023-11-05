package com.example.stepTracker.messageToTheConsole.impl;

public class MessageAboutTheChoiceOfMonth {

    public static String getTemplate() {
    return "Выберете номер месяца за который напечатать статистику:\n" +
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
